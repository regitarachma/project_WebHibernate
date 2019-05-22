package icontrollers;

import entities.Region;
import java.util.List;

/**
 *
 * @author RR17
 */
public interface IRegionController {

    public List<Region> getAll();
    
    public List<Region> getById(String id);

    public List<Region> search(String keyword);

}
