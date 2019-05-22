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
        <link rel="stylesheet" href="../assets/css/bootstrap.min.css"/>
        <title>Region Data</title>
        <link href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round" rel="stylesheet">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        
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
                    <a type="button" class="btn btn-light" href="addRegion.jsp">Add</a>
                    <a type="button" class="btn btn-light" href="../RegionServlet">Refresh</a>
                </div>
                <div class="card-body">
                    <table border="1" class="table table-striped">
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
                                    <a type="button" class="btn btn-primary" href="#">Edit</a>
                                    <!-- Button trigger modal -->
                                    <form action="../RegionServlet?region_id=<%= region.getRegionId() %>" method="post">
                                    <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#confirmDelete">
                                        Delete
                                    </button>
                                    </form>
                                    
                                </td>
                            </tr>

                            <!-- Modal HTML -->
                        <div id="confirmDelete" class="modal fade">
                            <div class="modal-dialog modal-confirm">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <div class="icon-box">
                                            <i class="material-icons">&#xE5CD;</i>
                                        </div>
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                    </div>
                                    <div class="modal-body">
                                        <h4 class="modal-title">Are you sure?</h4>	
                                        <p>Do you really want to delete these records? This process cannot be undone.</p>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-info" data-dismiss="modal">Cancel</button>
                                        <button type="button" class="btn btn-danger">Delete</button>
                                    </div>
                                </div>
                            </div>
                        </div>   
                        <% }%>

                        </tbody>
                    </table>

                </div>
            </div>
        </div>




        <!-- Modal Dialog -->
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
                                <input type="text" class="form-control" id="region_name" name="region_name" aria-describedby="emailHelp" placeholder="Enter Region Name">
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
        <script src="../assets/js/bootstrap.min.js"></script>
    </body>  
</html>