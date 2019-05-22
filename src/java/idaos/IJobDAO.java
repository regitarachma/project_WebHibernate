/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idaos;

import entities.Job;
import java.util.List;

/**
 *
 * @author RR17
 */
public interface IJobDAO {

    public List<Job> getAll();

    public Job getById(String jobId);

    public boolean insert(Job job);

    public List<Job> search(String keyword);

    public boolean update(Job job);

    public boolean delete(Job job);
}
