package controllers;

import daos.CountryDAO;
import daos.GeneralDAO;
import entities.Country;
import entities.Region;
import icontrollers.ICountryController;
import idaos.ICountryDAO;
import idaos.IGeneralDAO;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author RR17
 */
public class CountryController implements ICountryController{
//    private ICountryDAO icdao;
    private IGeneralDAO icdao;
    
    public CountryController(Class general, SessionFactory sessionFactory){
        icdao = new GeneralDAO<>(general, sessionFactory);
    }
    
//    public CountryController(SessionFactory sessionFactory){
//        icdao = new CountryDAO(sessionFactory);
//    }

    @Override
    public List<Country> getAll() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return icdao.getData("", false);
    }

    @Override
    public List<Country> getById(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return icdao.getData(id, true);
    }


    @Override
    public List<Country> search(String keyword) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return icdao.getData(keyword, false);
    }


    @Override
    public String delete(String countryId) {
      String result="Insert Failed";
        if (icdao.saveOrDelete(countryId, false)){
            result = "Insert Success";
        } 
//        else {
//            result = "Insert Failed";
//        }
        return result;  
        
    }

//    @Override
//    public List<Object[]> binding() {
//        return this.icdao.getData("", false);
//        
//    }

    @Override
    public String insert(String countryId, String countryName, String regionId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Country country = new Country(countryId, countryName, new Region(new BigDecimal(regionId)));
        String result="Insert Failed";
        if (icdao.saveOrDelete(country, true)){
            result = "Insert Success";
        } 
//        else {
//            result = "Insert Failed";
//        }
        return result;
    }
}
