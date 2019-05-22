package controllers;

import daos.RegionDAO;
import entities.Region;
import icontrollers.IRegionController;
import idaos.IRegionDAO;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author RR17
 */
public class RegionController implements IRegionController {

    private IRegionDAO irdao;

    public RegionController(SessionFactory factory) {
        irdao = new RegionDAO(factory);
    }

    @Override
    public List<Region> getAll() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return irdao.getAll();
    }
    
//    @Override
//    public List<Region> getById(String id){
//    return irdao.getById(BigDecimal id);
//    }

    @Override
    public List<Region> search(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    

}
