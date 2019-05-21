package controllers;

import daos.GeneralDAO;
import daos.JobDAO;
import entities.Department;
import entities.Employee;
import entities.Job;
import icontrollers.IJobController;
import idaos.IGeneralDAO;
import idaos.IJobDAO;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.SessionFactory;

/**
 *
 * @author RR17
 */
public class JobController implements IJobController {

//    private IJobDAO ijdao;
//    
//    public JobController(SessionFactory sessionFactory){
//        ijdao = new JobDAO(sessionFactory);
//    }
    private IGeneralDAO ijdao;

    public JobController(Class general, SessionFactory factory) {
        ijdao = new GeneralDAO<>(general, factory);
    }

    @Override
    public List<Job> getAll() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return ijdao.getData("", false);
    }

    @Override
    public List<Job> getById(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return ijdao.getData(id, true);
    }

    @Override
    public String insert(String jobId, String jobTitle, String minSalary, String maxSalary) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String result = "Maaf data gagal disimpan";
        Job job = new Job(jobId, jobTitle, Integer.parseInt(minSalary), Integer.parseInt(maxSalary));
        if (ijdao.saveOrDelete(job, true)) {
            result = "Data Berhasil Disimpan";
        }
        return result;
    }

    @Override
    public List<Job> search(String keyword) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return ijdao.getData(keyword, false);
    }

    @Override
    public String delete(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String result = "Maaf data gagal dihapus";
        if (ijdao.saveOrDelete(id, false)) {
            result = "Data Berhasil dihapus";
        }
        return result;
    }

}
