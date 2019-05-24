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
        <link rel="stylesheet" href="../assets/css/bootstrap.min.css" >
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/jq-3.3.1/dt-1.10.18/datatables.min.css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        
        <link rel="stylesheet" href="../assets/css/mandatory.css" >
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        
        <script type="text/javascript" src="https://cdn.datatables.net/v/bs4/jq-3.3.1/dt-1.10.18/datatables.min.js"></script>
        <title>Job Data</title>
    </head>
        <% String delete = (String) session.getAttribute("delete"); %>
    <body <% if(delete == "true") {%> <%= "onload='alert()'" %> <%}%>>
        <% List<Job> jobs = (List<Job>) session.getAttribute("dataJob"); %>
        <div class="hide"></div>
        <div class="container">
            <h1><center>Job Table</center></h1>
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <button type="button" class="btn btn-dark" data-toggle="modal" data-target="#input-job">
                        Add Data
                    </button>
                    <a type="button" class="btn btn-light" href="../JobServlett">Refresh</a>
                </div>
                <div class="card-body">
                    <table id="table_id" border="1" class="table table-striped">
                        <thead class="thead-dark" align="center">
                            <tr>
                                <th>Job ID</th>
                                <th>Job Name</th>
                                <th>Minimal Salary</th>
                                <th>Maximal Salary</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody align="center">
                            <%for (Job job : jobs) {%>
                            <tr>
                                <td><%= job.getJobId()%></td>
                                <td><%= job.getJobTitle()%></td>
                                <td><%= job.getMinSalary()%></td>
                                <td><%= job.getMaxSalary()%></td>
                                <td>
                                    <a type="button" class="btn btn-primary" data-toggle="modal" data-target="#edit-job<%= job.getJobId()%>">Edit</a>
                                    <a type="button" class="btn btn-danger" data-toggle="modal" data-target="#delete-job<%= job.getJobId()%>">Delete</a>
                                </td>
                            </tr>
                            <% }%>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <!-- Modal insert Dialog -->
        <div class="modal fade" id="input-job" role="dialog" aria-labelledby="confirmDeleteLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Add Job</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    </div>
                    <form action="../JobServlett" method="post">
                        <div class="modal-body">
                            <div class="form-group required">
                                <label class="control-label"><b>Job ID </b></label>
                                <input type="text" class="form-control" id="job_id" name="job_id" aria-describedby="jobidhelp" placeholder="Enter Job Id" required>
                                <small id="jobidhelp" class="form-text text-mute">Please insert JobID with character</small>
                            </div>
                        
                            <div class="form-group required">
                                <label class="control-label"><b>Job Title </b></label>
                                <input type="text" class="form-control" id="job_title" name="job_title" aria-describedby="jobtitlehelp" placeholder="Enter Job Name" required>
                                <small id="jobtitlehelp" class="form-text text-mute">Enter your job name</small>
                            </div>
                       
                            <div class="form-group required">
                                <label><b>Minimal Salary </b></label>
                                <input type="text" class="form-control" id="min_sal" name="min_sal" aria-describedby="minsalhelp" placeholder="Enter Minimal Salary" required>
                                <small id="minsalhelp" class="form-text text-mute">Enter your minimal salary more than 0</small>
                            </div>
                        
                            <div class="form-group required">
                                <label><b>Maximal Salary </b></label>
                                <input type="text" class="form-control" id="max_sal" name="max_sal" aria-describedby="maxsalhelp" placeholder="Enter Maximal Salary" required>
                                <small id="maxsal" class="form-text text-mute">Enter your maximal salary more than 0</small>
                            </div>
                        
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>

                            <button type="submit" class="btn btn-primary" id="confirm">Save</button>

                        </div>
                    </form>
                </div>
            </div>
            </div>
        </div>
            
        
        <!--modal edit job-->
        <%for (Job job : jobs) {%>
        <div class="modal fade" id="edit-job<%= job.getJobId()%>" role="dialog" aria-labelledby="confirmDeleteLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Update Job</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    </div>
                    <form action="../JobServlett" method="get">
                    <div class="modal-body">
                        <div>
                            <label><b>Job ID </b></label>
                            <input type="text" class="form-control" id="job_id" name="job_id" readonly value="<%= job.getJobId()%>">
                        </div>
                        <div class="form-group required">
                            <label><b>Job Title </b></label>
                            <input type="text" class="form-control" id="jobtitlehelp" name="job_title" value="<%= job.getJobTitle()%>" placeholder="Enter Job Title" required>
                            <small id="jobtitlehelp" class="form-text text-mute">Update your job name</small>
                        </div>
                        <div class="form-group required">
                            <label><b>Minimal Salary : </b></label>
                            <input type="text" class="form-control" id="minsalhelp" name="min_sal" value="<%= job.getMinSalary()%>" placeholder="Enter Minimal Salary" required>
                            <small id="minsalhelp" class="form-text text-mute">Update your minimal salary more than 0</small>
                        </div>
                        <div class="form-group required">
                            <label><b>Maximal Salary : </b></label>
                            <input type="text" class="form-control" id="maxsalhelp" name="max_sal" value="<%= job.getMaxSalary()%>" placeholder="Enter Maximal Salary" required>
                            <small id="maxsalhelp" class="form-text text-mute">Update your maximal salary more than 0</small>
                        </div>
                    </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                            <button type="submit" class="btn btn-primary" id="confirm">Update</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <% }%>

        <!-- Modal delete Dialog -->
        <%for (Job job : jobs) {%>
        <div class="modal fade" id="delete-job<%= job.getJobId()%>" role="dialog" aria-labelledby="confirmDeleteLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Delete Job</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    </div>
                    <form action="../JobServlett" method="get">
                        <input type="hidden" class="form-control" id="job_id" name="job_id" value="<%= job.getJobId()%>">
                        <div class="modal-body">
                            Apakah anda yakin ingin menghapus data ini?
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                            <button type="submit" class="btn btn-primary" id="confirm" >Delete</button>

                        </div>
                    </form>
                </div>
            </div>
        </div>
        <%}%>
        
        <script>
            $(document).ready(function () {
                $('#table_id').DataTable();
            });
        </script>
        
        <script>
            function alert(){
                swal({
                title: "Delete",
                text: "Success!",
                icon: "success",
                button: "OK",
                });
            }
        </script>
</body>
</html>