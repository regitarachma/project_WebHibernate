package controllers;

import daos.EmployeeDAO;
import daos.GeneralDAO;
import entities.Department;
import entities.Employee;
import entities.Job;
import icontrollers.IEmployeeController;
import idaos.IEmployeeDAO;
import idaos.IGeneralDAO;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.SessionFactory;

/**
 *
 * @author RR17
 */
public class EmployeeController implements IEmployeeController {

//    Date d = new Date();
//    java.util.Date date = new java.util.Date();
//    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
    Date date = new Date(); // this object contains the current date value 
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
//    private IEmployeeDAO iedao;
     private IGeneralDAO iedao;

    public EmployeeController(Class general, SessionFactory factory) {
//        iedao = new EmployeeDAO(factory);
        iedao = new GeneralDAO<>(general, factory);
    }

    @Override
    public List<Employee> getAll() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return iedao.getData("", false);
    }

    @Override
    public List<Employee> getById(String employeeId) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return iedao.getData(employeeId, true);
    }

    @Override
    public List<Employee> search(String keyword) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return iedao.getData(keyword, false);
    }

    @Override
    public String delete(String employeeId) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String result = "Maaf data tidak bisa dihapus";
        if (iedao.saveOrDelete(Integer.parseInt(employeeId), false)) {
            result = "Data berhasil dihapus";
        }
        return result;
    }

    @Override
    public String insert(String employeeId, String firstName, String lastName, String email, String phoneNumber, String hireDate, String salary, String commissionPct, String departmentId, String managerId, String jobId) {
        String result = "Maaf data gagal disimpan";
        try {
            //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            date = formatter.parse(hireDate);
            Employee employee = new Employee(Integer.parseInt(employeeId), firstName, lastName, email, phoneNumber, new java.sql.Date(date.getTime()), new BigDecimal(salary), new BigDecimal(commissionPct), new Department(Short.parseShort(departmentId)), new Employee(Integer.parseInt(managerId)), new Job(jobId));

            if (iedao.saveOrDelete(employee, true)) {
                result = "Data Berhasil Disimpan";
            }

        } catch (ParseException ex) {
            Logger.getLogger(EmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

//    @Override
//    public String update(String employeeId, String firstName, String lastName, String email, String phoneNumber, String hireDate, String salary, String commissionPct, String departmentId, String managerId, String jobId) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        String result = "Maaf data gagal diupdate";
//        try {
//            //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            date = formatter.parse(hireDate);
//            Employee employee = new Employee(Integer.parseInt(employeeId), firstName, lastName, email, phoneNumber, new java.sql.Date(date.getTime()), new BigDecimal(salary), new BigDecimal(commissionPct), new Department(Short.parseShort(departmentId)), new Employee(Integer.parseInt(managerId)), new Job(jobId));
//
//            if (iedao.update(employee)) {
//                result = "Data Berhasil Diupdate";
//            }
//
//        } catch (ParseException ex) {
//            Logger.getLogger(EmployeeController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return result;
//
//    }

}
