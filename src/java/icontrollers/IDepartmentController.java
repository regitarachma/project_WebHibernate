package icontrollers;

import entities.Department;
import entities.Location;
import java.util.List;

/**
 *
 * @author RR17
 */
public interface IDepartmentController {

    public List<Department> getAll();

    public List<Department> getById(String id);

    public List<Department> search(String keyword);

    public String insert(String departmentId, String departmentName, String managerId, String locationId);

    public String delete(String id);
}
