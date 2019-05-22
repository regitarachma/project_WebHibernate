/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import daos.GeneralDAO;
import idaos.IGeneralDAO;
import models.Employee;
import org.hibernate.SessionFactory;

/**
 *
 * @author Okala
 */
public class ManualTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SessionFactory factory = HibernateUtil.getSessionFactory();
        IGeneralDAO<Employee> igdao = new GeneralDAO(Employee.class, factory);
        
        for (Employee employee  : igdao.getData("1", false)) {
            System.out.println(employee.getEmployeeId());
        }
    }
    
}
