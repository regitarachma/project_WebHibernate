package icontrollers;

import entities.Country;
import entities.Region;
import java.util.List;

/**
 *
 * @author RR17
 */
public interface ICountryController {
    public List<Country> getAll();
//     public List<> getAll();
    public List<Country> getById(String id);
//    public List<Object[]> binding();
    public String insert (String countryId, String countryName, String regionId);
    
    public List<Country> search(String keyword);
//    public String update (String countryId, String countryName, Region regionId);
    public String delete (String countryId);
}
