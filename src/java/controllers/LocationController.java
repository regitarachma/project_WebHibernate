package controllers;

import daos.GeneralDAO;
import daos.LocationDAO;
import entities.Country;
import entities.Location;
import icontrollers.ILocationController;
import idaos.IGeneralDAO;
import idaos.ILocationDAO;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author RR17
* @author Okala
 */
public class LocationController implements ILocationController {

//    private ILocationDAO ildao;
//    
//    public LocationController(SessionFactory sessionFactory){
//        ildao = new LocationDAO(sessionFactory);
//    }
    
    private IGeneralDAO ildao;
    
    public LocationController(Class general, SessionFactory sessionFactory){
        ildao = new GeneralDAO<>(general, sessionFactory);
    }

    @Override
    public List<Location> getAll() {
        return ildao.getData("", false);
    }

    @Override
    public List<Location> getById(String locationId) {
        return ildao.getData(locationId, true);
    }

    @Override
    public List<Location> search(String keyword) {
        return ildao.getData(keyword, false);
    }

    @Override
    public String insert(String locationId, String streetAddress, String postalCode, String city, String stateProvince, String countryId) {
        String result = "Data tidak berhasil disimpan";
        Location location = new Location(Short.valueOf(locationId), streetAddress, postalCode, city, stateProvince, new Country(countryId));
        if (locationId.isEmpty() || city.isEmpty()) {
            result = "Data locationId atau city wajib diisi";
        } else {
            if (ildao.saveOrDelete(location, true)) {
                result = "Data berhasil ditambahkan";
            }
        }
        return result;
    }

//    @Override
//    public String update(String locationId, String streetAddress, String postalCode, String city, String stateProvince, String countryId) {
//        String result = "Data tidak berhasil diupdate ";
//        Location location = new Location(Short.valueOf(locationId), streetAddress, postalCode, city, stateProvince, new Country(countryId));
//        if (locationId.isEmpty() || city.isEmpty()) {
//            result = "Data locationId atau city tidak boleh kosong";
//        } else {
//            if (ildao.update(location)) {
//                result = "Data berhasil diupdate";
//            }
//        }
//        return result;
//    }

    @Override
    public String delete(String locationId) {
        String result = "Data tidak berhasil dihapus";
        if (ildao.saveOrDelete(Integer.parseInt(locationId), false)) {
            result = "Data berhasil dihapus";
        }
        return result;
    }
}
