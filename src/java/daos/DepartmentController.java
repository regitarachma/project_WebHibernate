package daos;

import entities.Department;
import entities.Employee;
import entities.Location;
import icontrollers.IDepartmentController;
import idaos.IDepartmentDAO;
import idaos.IGeneralDAO;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author RR17
 */
public class DepartmentController implements IDepartmentController{

//    private IDepartmentDAO iddao;
//    
//    public DepartmentController(SessionFactory sessionFactory){
//        iddao = new DepartmentDAO(sessionFactory);
//    }
    
    private IGeneralDAO iddao;
    
    public DepartmentController(Class general, SessionFactory sessionFactory){
        iddao = new GeneralDAO<>(general, sessionFactory);
    }

    @Override
    public List<Department> getAll() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return iddao.getData("", false);
    }

    @Override
    public List<Department> getById(String id) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return iddao.getData(id, false);
    }

    @Override
    public List<Department> search(String keyword) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return iddao.getData(keyword, true);
    }

    @Override
    public String insert(String departmentId, String departmentName, String managerId, String locationId) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Department department = new Department(new Short(departmentId), departmentName, new Employee(Integer.parseInt(managerId)), new Location(new Short(locationId)));
        String result="Insert Failed";
        if (iddao.saveOrDelete(department, true)){
            result = "Insert Success";
        } 
//        else {
//            result = "Insert Failed";
//        }
        return result;
    }

    @Override
    public String delete(String id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String result="Insert Failed";
        if (iddao.saveOrDelete(id, false)){
            result = "Insert Success";
        } 
//        else {
//            result = "Insert Failed";
//        }
        return result;
    }

}
