<%-- 
    Document   : Region
    Created on : May 21, 2019, 1:46:07 AM
    Author     : Relion31
--%>

<%@page import="entities.Department"%> 
<%@page import="entities.Employee"%> 
<%@page import="java.util.List"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html> 
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <link href="../assets/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <!--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">--> 
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/jq-3.3.1/dt-1.10.18/datatables.min.css"/>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <script src="js/getData.js"></script>

        <script type="text/javascript" src="https://cdn.datatables.net/v/bs4/jq-3.3.1/dt-1.10.18/datatables.min.js"></script>
        
        
        <% List<Department> list = (List<Department>) session.getAttribute("dataDepartment");%>
    <div class="container">
        <h1>Department Table</h1>
        <div class="card border-info">
            <div class="card-header bg-info text-white">
                <button type="button" class="btn btn-light" data-toggle="modal" data-target="#input-d">
                    Add Data
                </button>
                <a type="button" class="btn btn-light" href="../departmentServlet">Refresh</a>
                <!--<a type="button" class="btn btn-light" href="addRegion.jsp">Add</a>-->

            </div>
            <div class="card-body">
                <table class="table table-striped table-bordered data">
                    <thead class="thead-dark" align="center">
                        <tr>
                            <th>Department ID</th> 
                            <th>Department Name</th> 
                            <th>Manager ID</th> 
                            <th>Location ID</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody align="center">
                        <%for (Department d : list) {%>
                        <tr>
                            <td><%=d.getDepartmentId() %></td> 
                            <td><%=d.getDepartmentName() %></td> 
                            <td><%=d.getManagerId() %></td>

                            <td><%=d.getLocationId().getLocationId() %></td>
                            <td>
                                <a type="button" class="btn btn-warning" data-toggle="modal" data-target="#edit-d<%= d.getDepartmentId()%>">Edit</a>
                                <a type="button" class="btn btn-danger" data-toggle="modal" data-target="#delete-d<%= d.getDepartmentId() %>">Delete</a>
                            </td>
                        </tr>   
                        <% }%>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    
    
    <!-- Modal input Dialog -->
    <div class="modal fade" id="input-d" role="dialog" aria-labelledby="confirmDeleteLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Add Department</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                </div>
                <form action="../departmentServlet" method="post">
                    <div class="modal-body">
                        <div class="form-group">
                            <input type="text" class="form-control" id="id" name="id" placeholder="Enter Department ID">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="name" name="name" placeholder="Enter Department Name">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="man" name="man" placeholder="Enter Manager ID">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="loc" name="loc" placeholder="Enter Location ID">
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
    
    
    <!--modal EDIT -->
    <%for (Department d : list) {%>
    <div class="modal fade" id="edit-d<%= d.getDepartmentId()%>" role="dialog" aria-labelledby="confirmDeleteLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Update Department</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                </div>
                <form action="../departmentServlet" method="get">
                    <div class="modal-body">
                        <input type="hidden" class="form-control" id="did" name="did" value="<%= d.getDepartmentId()%>">
                        <div class="form-group">
                            <input type="text" class="form-control" id="dname" name="dname" value="<%= d.getDepartmentName()%>" required placeholder="Enter D Name">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="dman" name="dman" value="<%= d.getManagerId() %>" required placeholder="Enter Manager ID">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="dloc" name="dloc" value="<%= d.getLocationId().getLocationId() %>" required placeholder="Enter Loc ID">
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
    
    <!--modal Delete -->
    <%for (Department d : list) {%>
    <div class="modal fade" id="delete-d<%= d.getDepartmentId()%>" role="dialog" aria-labelledby="confirmDeleteLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Delete Department</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                </div>
                <form action="../departmentServlet" method="get">
                    <div class="modal-body">
                        Apakah anda yakin ingin menghapus data ini?
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
