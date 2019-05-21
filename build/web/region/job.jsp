<%-- 
    Document   : job.jsp
    Created on : May 21, 2019, 9:32:24 PM
    Author     : RR17
--%>

<%@page import="entities.Job"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Job Data</title>
    </head>
    <body>
        <%-- "dataJob" harus sama persis dengan di servlet, proses pengambilan data --%>
        <% List<Job> jobs = (List<Job>)session.getAttribute("dataJob"); %>
        <h1><center>Data Job</center></h1>
        <div class="container">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <!--<a type="button" class="btn btn-light" href="addJobForm.jsp">Tambah Job</a>-->
                    <button type="button" class="btn btn-warning" data-toggle="modal" data-target="#edit-job">
                        Tambah Data Job
                    </button>
                </div>
                <div class="card-body">
                    <table border="1" class="table table-striped">
                        <thead class="thead-dark" align="center">
                            <tr>
                                <th>Job ID</th>
                                <th>Job Title</th>
                                <th>Minimal Salary</th>
                                <th>Maximal Salary</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody align="center">
                        <!--<c:forEach var="datas" items="${list}">-->
                            
                            <%-- table pengambilan data region --%>
                            <% for (Job job : jobs) { %>
                            <tr>
                                <td> <%= job.getJobId()%> </td>
                                <td> <%= job.getJobTitle()%> </td>
                                <td> <%= job.getMinSalary()%> </td>
                                <td> <%= job.getMaxSalary()%> </td>
                                <td>
                                    <a type="button" class="btn btn-warning" href="#">Edit</a>
                                    <a type="button" class="btn btn-danger" href="#">Delete</a>
                                </td>
        <!--                            <c:forEach var="datas" items="${list}">
                                    <tr>
                                        <td>${datas.job_id}</td>
                                        <td>${datas.job_title}</td>
                                        <td>${datas.min_salary}</td>
                                        <td>${datas.max_salary}</td>
                                        <td>
                                            <a>Edit</a>
                                            <a>Delete</a>
                                        </td> -->
                          </tr>
                          <% } %>
                        <!--</c:forEach>-->
                        </tbody>
                    </table>
                          <%-- button refresh untuk muat ulang data Region --%>
                        <a href="../JobServlet"><input type="button" value="Refresh" /></a>
                </div>
            </div>
        </div>
        
        
        
        <div class="modal fade" id="edit-job" role="dialog" aria-labelledby="confirmDeleteLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Add Job</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">x</button>
                    </div>
                    
                    <form action="../JobServlet" method="post">
                        <div class="modal-body">
                            <div class="form-group">
                                <input type="text" class="form-control" id="job_id" name="job_id" placeholder="Enter Job ID">          
                            </div>
                            
                            <div class="form-group">
                                <input type="text" class="form-control" id="job_title" name="job_title" placeholder="Enter Job Title">          
                            </div>
                            
                            <div class="form-group">
                                <input type="text" class="form-control" id="min_sal" name="min_sal" placeholder="Enter Minimal Salary">          
                            </div>
                            
                            <div class="form-group">
                                <input type="text" class="form-control" id="max_sal" name="max_sal" placeholder="Enter Maximal Salary">          
                            </div>
                        </div>
                        
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                            <button type="submit" class="btn btn-primary" id="confirm">Save</button>
                        </div>
                
              </form>
             </div>
            </div>
        </div> 
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
