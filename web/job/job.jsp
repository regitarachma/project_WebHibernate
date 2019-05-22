<%-- 
    Document   : job
    Created on : May 22, 2019, 1:10:12 AM
    Author     : ASUS
--%>

<%@page import="entities.Job"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../assets/css/bootstrap.min.css" rel="stylesheet" />

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/jq-3.3.1/dt-1.10.18/datatables.min.css"/>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>



        <script type="text/javascript" src="https://cdn.datatables.net/v/bs4/jq-3.3.1/dt-1.10.18/datatables.min.js"></script>
        <% List<Job> list = (List<Job>) session.getAttribute("dataJob");%>
    <div class="container">
        <h1>Job Table</h1>
        <div class="card border-info">
            <div class="card-header bg-info text-white">
                <button type="button" class="btn btn-light" data-toggle="modal" data-target="#input-job">
                    Add Data
                </button>
                <!--<a type="button" class="btn btn-light" href="addRegion.jsp">Add</a>-->

            </div>
            <div class="card-body">
                <table class="table table-striped table-bordered data">
                    <thead class="thead-dark" align="center">
                        <tr>
                            <th>Job ID</th>
                            <th>Job Name</th>
                            <th>Min</th>
                            <th>Max</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody align="center">
                        <%for (Job j : list) {%>
                        <tr>
                            <td><%= j.getJobId()%></td>
                            <td><%= j.getJobTitle()%></td>
                            <td><%= j.getMinSalary()%></td>
                            <td><%= j.getMaxSalary()%></td>
                            <td>
                                <a type="button" class="btn btn-warning" data-toggle="modal" data-target="#edit-job<%= j.getJobId()%>">Edit</a>
                                <a type="button" class="btn btn-warning" data-toggle="modal" data-target="#delete<%= j.getJobId()%>">Delete</a>
                            </td>
                        </tr>   
                        <% }%>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <!-- Modal input Dialog -->
    <div class="modal fade" id="input-job" role="dialog" aria-labelledby="confirmDeleteLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Add Job</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                </div>
                <form action="../jobServlet" method="post">
                    <div class="modal-body">
                        <div class="form-group">
                            <input type="text" class="form-control" id="job" name="id" placeholder="Enter Job ID">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="name" name="name" placeholder="Enter Job Title">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="min" name="min" placeholder="Enter Minimal Salary">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="max" name="max" placeholder="Enter Maximal Salary">
                        </div>

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                        <button type="submit" class="btn btn-success" id="confirm">Save</button>

                    </div>
                </form>
            </div>
        </div>
    </div>
    <!--modal edit job-->
    <%for (Job j : list) {%>
    <div class="modal fade" id="edit-job<%= j.getJobId()%>" role="dialog" aria-labelledby="confirmEditLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Update Job</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                </div>
                <form action="../jobServlet" method="get">
                    <div class="modal-body">
                        <input type="hidden" class="form-control" id="jid" name="jid" value="<%= j.getJobId()%>">
                        <div class="form-group">
                            <input type="text" class="form-control" id="jname" name="jname" value="<%= j.getJobTitle()%>" required placeholder="Enter Job Title">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="jmin" name="jmin" value="<%= j.getMinSalary()%>" required placeholder="Enter Minimal Salary">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="jmax" name="jmax" value="<%= j.getMaxSalary()%>" required placeholder="Enter Maximal Salary">
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
    <%for (Job j : list) {%>
    <div class="modal fade" id="delete<%= j.getJobId()%>" role="dialog" aria-labelledby="confirmUpdateLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Delete Job</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                </div>
                <form action="../deleteJobServlet" method="get">
                    <div class="modal-body">
                        Apakah anda yakin ingin menghapus data ini?
                    </div>
                    <div class="modal-body">
                        <input type="hidden" class="form-control" id="jid" name="jid" value="<%= j.getJobId()%>">
                        <div class="form-group">
                            <input type="hidden" class="form-control" id="jname" name="jname" value="<%= j.getJobTitle()%>" >
                        </div>
                        <div class="form-group">
                            <input type="hidden" class="form-control" id="jmin" name="jmin" value="<%= j.getMinSalary()%>">
                        </div>
                        <div class="form-group">
                            <input type="hidden" class="form-control" id="jmax" name="jmax" value="<%= j.getMaxSalary()%>">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                        <button type="submit" class="btn btn-primary" id="confirm">Delete</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <% }%>
    <script type="text/javascript">
        $(document).ready(function () {
            $('.data').DataTable();
        });
    </script>
</body>
</html>
