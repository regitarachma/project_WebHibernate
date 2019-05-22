package tools;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import controllers.CountryController;
import controllers.EmployeeController;
import controllers.GeneralController;
import controllers.LocationController;
import daos.CountryDAO;
import daos.EmployeeDAO;
import daos.GeneralDAO;
import daos.LocationDAO;
import daos.RegionDAO;
import entities.Country;
import entities.Employee;
import entities.Job;
import entities.Location;
import entities.Region;
import icontrollers.ICountryController;
import icontrollers.IGeneralController;
import icontrollers.ILocationController;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.hibernate.SessionFactory;
//import views.MainFrameView;
//import views.Views;

/**
 *
 * @author RR17
 */
public class ManualTester {

    public static void main(String[] args) throws ParseException {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Date date = new Date(); // this object contains the current date value 
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
//        CountryDAO countryDAO = new CountryDAO(sessionFactory);
//        EmployeeDAO employeeDAO = new EmployeeDAO(sessionFactory);

//        MainFrameView mfv = new MainFrameView();
//        mfv.setVisible(true);
        //General DAO saveDelete
//        GeneralDAO<Country> cdao = new GeneralDAO<>(Country.class, sessionFactory);
//        for (Country c : cdao.getData("IN", true)) {
//            System.out.println(c.getCountryId()+" "+c.getCountryName()+" "+c.getRegionId().getRegionName());
//        }
//        for (Country c : cdao.getData("ZZ", false)) {
//            System.out.println(c.getCountryId()+" "+c.getCountryName()+" "+c.getRegionId().getRegionName());
//        }
//        for (Country c : cdao.getData("erman", true)) {
//            System.out.println(c.getCountryId()+" "+c.getCountryName()+" "+c.getRegionId().getRegionName());
//        }
        //saveOrDelete region pada GeneralDAO = false untuk del, true untuk save/update
//        GeneralDAO<Region> rdAO = new GeneralDAO<>(Region.class, sessionFactory);
//        
//        for (Region region : rdAO.getData("", false)) {
//            System.out.println(region.getRegionName());
//        }
        
//        Region region = new Region(new BigDecimal(6), "Sekarang");
//        System.out.println(rdAO.saveOrDelete(region, false));
        //insert region pada GeneralDAO
//        GeneralDAO<Region> rdAO = new GeneralDAO<>(sessionFactory);
//        Region region = new Region(new BigDecimal(0), "Hawai");
//        System.out.println(rdAO.save(region));
        //General Controller GetAll
//        IGeneralController<Country> cdao = new GeneralController<>(Country.class, sessionFactory);
//        for (Country c : cdao.getAll()) {
//            System.out.println(c.getCountryId()+" "+c.getCountryName()+" "+c.getRegionId().getRegionName());
//        }
        //insert GENERAL Controller
//        int id_region = 7;
//        IGeneralController<Country> cdao = new GeneralController<>(Country.class, sessionFactory);
//        IGeneralController<Region> cdao = new GeneralController<>(Region.class, sessionFactory);
//        IGeneralController<Employee> cdao = new GeneralController<>(Employee.class, sessionFactory);
//        System.out.println(cdao.save(new Region(new BigDecimal(0), "Asia")));
//        System.out.println(rdao.save(new Region(new BigDecimal(id_region), "General Region")));
//        System.out.println(cdao.save(new Country("MY", "Indonesia", new Region(new BigDecimal(id_region)))));
//        System.out.println(cdao.save(new Country("MY", "Malaysia", new Region(new BigDecimal(25)))));
//        for (Country country : cdao.getAll()) {
//            System.out.println(country.getCountryId()+", "+country.getCountryName()+", "+country.getRegionId().getRegionId());
//        }
//        for (Country country : cdao.getById("ID")) {
//            System.out.println(country.getCountryId()+", "+country.getCountryName()+", "+country.getRegionId().getRegionId());
//        }
//        for (Country country : cdao.search("Indonesia")) {
//            System.out.println(country.getCountryId()+", "+country.getCountryName()+", "+country.getRegionId().getRegionId());
//        }
//        for (Region region : cdao.search("25")) {
//            System.out.println(region.getRegionId()+", "+region.getRegionName());
//        }
//        for (Region region : cdao.getById("25")) {
//            System.out.println(region.getRegionId()+", "+region.getRegionName());
//        }
//            System.out.println(cdao.save(new Employee(222, "Septiyani", "sep@gmail.com", new Date(2019, 5,9), new Job("AD_PRES"))));
//====================================================================================================================
        //insert country dao
//        Country country = new Country("ZZ", "Denmark", new Region(new BigDecimal(3)));
//        System.out.println(countryDAO.insert(country));
        //getbyid country dao
//        System.out.println(countryDAO.getById("KW").getCountryName());
//        System.out.println(countryDAO.getById("KW").getRegionId());
        //insert country controller
//        CountryController countryController = new CountryController(sessionFactory);
//        System.out.println(countryController.insert("", "mm", "2"));
        //getbyid country controller
//        CountryController countryController = new CountryController(sessionFactory);
//        System.out.println(countryController.getById("XX").getCountryName());
//        LocationDAO xxx = new LocationDAO(sessionFactory);
//        for (Location location : xxx.search("Argentina")) {
//            System.out.println(location.getStreetAddress());
//        }
//        System.out.println(xxx.search());
        //delete employee dao
//        Employee employee = new Employee(208);
//        System.out.println(employeeDAO.delete(employee.getEmployeeId()));
        //delete employee controller
//        EmployeeController employeeController = new EmployeeController(sessionFactory);
//        System.out.println(employeeController.delete("207"));
        //insert employee controller
//        EmployeeController employeeController = new EmployeeController(sessionFactory);
//        System.out.println(employeeController.insert("0", "Rere", "Uio", "WWindi", "515123890", "07/08/2019", "12008", "0.23", "110", "101", "AC_ACCOUNT"));
        //insert country controller
//        LocationController locationController = new LocationController(sessionFactory);
//        System.out.println(locationController.insert("0", "600 RCH House", "7890", "Semarang", "Jateng", "UK"));
        //update country controller
//        LocationController locationController = new LocationController(sessionFactory);
//        System.out.println(locationController.update("3500", "700 RGT House", "5733", "Salatiga", "Jateng", "JP"));
        //delete country controller
//        LocationController locationController = new LocationController(sessionFactory);
//        System.out.println(locationController.delete("3600"));
//        ====================================================================================
//        RegionDAO regionDAO = new RegionDAO();
//        LocationDAO locationDAO = new LocationDAO();
//        EmployeeDAO employeeDAO = new EmployeeDAO();
        //untuk menampilkan semua
//        regionDAO.getAll().forEach((region) -> {
//            System.out.println("");
//            System.out.println(region.getRegionId() + " - " + region.getRegionName());
//            for (Country country : region.getCountryList()) {
//                System.out.println("\t-> " + country.getCountryId() + " - " + country.getCountryName());
//                for (Location location : country.getLocationList()) {
//                    System.out.println("\t\t--> " + location.getCity());
//                }
//            }
//        });
//            cdao.getAll().forEach((country) -> {
//            System.out.println("");
//            System.out.println(country.getCountryId()+ " - " + country.getCountryName()+ " - " + country.getRegionId());
//            for (Region region : country.getLocationList()) {
//                System.out.println("\t-> " + region.getRegionId()+ " - " + region.getRegionName());
//            }
//        });
        //untuk melakukan proses insert
//        Region region = new Region(BigDecimal.ZERO, "Salatiga");
//        System.out.println(regionDAO.insert(region));
//         Location location = new Location(new Sho "Solo", "Gondangsari", "50744", "Jateng", "JP");
//         System.out.println(locationDAO.insert(location));
        //untuk melakukan proses update
//        Region region = new Region(new BigDecimal(5), "Negara RGT");
//        System.out.println(regionDAO.update(region));
        //untuk melakukan proses delete
//        Region region = new Region(new BigDecimal(6));
//        System.out.println(regionDAO.delete(region));
//            Location location = new Location(new Number(3300));
//            System.out.println(regionDAO.delete(location));
        //untuk melakukan proses getById
//        System.out.println(regionDAO.getById(new BigDecimal(6)).getRegionName());
        //untuk melakukam proses search
//        System.out.println(regionDAO.search("Asia").getRegionId());


//  ==========================================================================================
//21-05-2019

        ICountryController countryController = new CountryController(Country.class, sessionFactory);
        
        //get ALL
        for (Country country : countryController.getAll()) {
            System.out.println(country.getCountryId()+", "+country.getCountryName()+", "+country.getRegionId().getRegionId());
        }
        //get By id
        for (Country country : countryController.getById("MY")) {
            System.out.println(country.getCountryId()+", "+country.getCountryName()+", "+country.getRegionId().getRegionId());
        }
        //get search
        for (Country country : countryController.search("Indonesia")) {
            System.out.println(country.getCountryId()+", "+country.getCountryName()+", "+country.getRegionId().getRegionId());
        }
        
        ILocationController ilc = new LocationController(Location.class, sessionFactory);
        for (Location location : ilc.getAll()) {
            System.out.println(location.getLocationId()+", "+location.getStreetAddress());
            
        }
    }
}
