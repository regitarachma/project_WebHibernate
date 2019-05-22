<%-- 
    Document   : Region
    Created on : May 21, 2019, 1:46:07 AM
    Author     : Relion31
--%>

<%@page import="entities.Region"%>
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
        <script type="text/javascript" src="https://cdn.datatables.net/v/bs4/jq-3.3.1/dt-1.10.18/datatables.min.js"></script>

    </head>
    <body>
        <% List<Region> regions = (List<Region>) session.getAttribute("dataRegion"); %>

        <div class="container">
            <h1>Region Table</h1>
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#input-region">
                        Add Data
                    </button>
                    <!--<a type="button" class="btn btn-light" href="addRegion.jsp">Add</a>-->
                    <a type="button" class="btn btn-light" href="../RegionServlet">Refresh</a>
                </div>
                <div class="card-body">
                    <table id="table_id" border="1" class="table table-striped">
                        <thead class="thead-dark" align="center">
                            <tr>
                                <th>Region ID</th>
                                <th>Region Name</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody align="center">
                            <%for (Region region : regions) {%>
                            <tr>
                                <td><%= region.getRegionId()%></td>
                                <td><%= region.getRegionName()%></td>
                                <td>
                                    <a type="button" class="btn btn-warning" data-toggle="modal" data-target="#edit-region<%= region.getRegionId()%>">Edit</a>
                                    <a type="button" class="btn btn-danger" data-toggle="modal" data-target="#delete-region<%= region.getRegionId()%>">Delete</a>
                                </td>
                            </tr>
                            <% }%>
                        </tbody>
                    </table>

                </div>
            </div>
        </div>


        <!-- Modal edit Dialog -->
        <%for (Region region : regions) {%>
        <div class="modal fade" id="edit-region<%= region.getRegionId()%>" role="dialog" aria-labelledby="confirmDeleteLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Update Region</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    </div>
                    <form action="../RegionServlet" method="get">
                        <div class="modal-body">
                            <input type="hidden" class="form-control" id="region_Id" name="region_Id" value="<%= region.getRegionId()%>">
                            <div class="form-group">
                                <input type="text" class="form-control" id="region_Name" name="region_Name" value="<%= region.getRegionName()%>" required placeholder="Enter Region Name">
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


        <!-- Modal input Dialog -->
        <div class="modal fade" id="input-region" role="dialog" aria-labelledby="confirmDeleteLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Add Region</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    </div>
                    <form action="../RegionServlet" method="post">
                        <div class="modal-body">
                            <div class="form-group">
                                <input type="text" class="form-control" id="region_name" name="region_name" placeholder="Enter Region Name">
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

        <!-- Modal delete Dialog -->
        <%for (Region region : regions) {%>
        <div class="modal fade" id="delete-region<%= region.getRegionId()%>" role="dialog" aria-labelledby="confirmDeleteLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Delete Region</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    </div>
                    <form action="../RegionServlet" method="get">
                        <input type="hidden" class="form-control" id="region_Id" name="region_Id" value="<%= region.getRegionId()%>">
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
        <%}%>

        <script type="text/javascript">
            $(document).ready(function () {
                $('#table_id').DataTable();
            });
        </script>      
    </body>  
</html>
