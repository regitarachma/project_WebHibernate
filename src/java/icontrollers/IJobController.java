package icontrollers;

import entities.Country;
import entities.Job;
import entities.Region;
import java.util.List;

/**
 *
 * @author RR17
 */
public interface IJobController {
    public List<Job> getAll();
     public List<Job> getById(String id);
    public String insert (String jobId, String jobTitle, String minSalary, String maxSalary);
    
    public List<Job> search(String keyword);
//    public String update (String countryId, String countryName, Region regionId);
    public String delete (String id);
}
