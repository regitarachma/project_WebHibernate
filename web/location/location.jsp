<%-- 
    Document   : location
    Created on : May 21, 2019, 9:32:04 PM
    Author     : Ode
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="entities.Location"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Location Data</title>
        <link href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round" rel="stylesheet">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <% List<Location> locations = (List<Location>) session.getAttribute("dataLocation"); %>
        <h1><center>Location</center></h1>
        <div class="container">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#input-location">
                        Add Data
                    </button>
                    <a type="button" class="btn btn-light" href="addForm.jsp">Add</a>
                    <a type="button" class="btn btn-light" href="../locationServlet">Refresh</a>
                </div>
                <div class="card-body">
                    <table border="1" class="table table-striped">
                        <thead class="thead-dark" align="center">
                            <tr>
                                <th>Location ID</th>
                                <th>Street Address</th>
                                <th>Postal Code</th>
                                <th>City</th>
                                <th>State Province</th>
                                <th>Country ID</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody align="center">
                        <!--<c:forEach var="datas" items="${list}">-->
                            <% for (Location location : locations) {%>
                            <tr>
                                <td><%= location.getLocationId()%></td>
                                <td><%= location.getStreetAddress()%></td>
                                <td><%= location.getPostalCode()%></td>
                                <td><%= location.getCity()%></td>
                                <td><%= location.getStateProvince()%></td>
                                <td><%= location.getCountryId().getCountryId()%></td>
                                <td>
                                    <a type="button" class="btn btn-primary" href="#">Edit</a>
                                    <!-- Button trigger modal -->
                                    <form action="../locationServlet?location_id=<%= location.getLocationId()%>" method="post">
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
                        <!--</c:forEach>-->
                        </tbody>
                    </table>
                </div>
            </div>
        </div> 
        <!-- Modal Dialog -->
        <div class="modal fade" id="input-location" role="dialog" aria-labelledby="confirmDeleteLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Add Location</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    </div>
                    <form action="../locationServlet" method="post">
                        <div class="modal-body">
                            <div class="form-group">
                                <input type="text" class="form-control" id="location_id" name="location_id" placeholder="Enter Location ID">
                            </div>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <input type="text" class="form-control" id="street_address" name="street_address" placeholder="Enter Address">
                            </div>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <input type="text" class="form-control" id="portal_code" name="portal_code" placeholder="Enter Portal Code">
                            </div>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <input type="text" class="form-control" id="city" name="city" placeholder="Enter City">
                            </div>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <input type="text" class="form-control" id="state_province" name="state_province" placeholder="Enter Province">
                            </div>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <input type="text" class="form-control" id="country_id" name="country_id" placeholder="Enter Country ID">
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
