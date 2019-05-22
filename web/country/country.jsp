<%-- 
    Document   : country
    Created on : 21-May-2019, 21:36:14
    Author     : yosef
--%>
<%@page import="entities.Country"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../assets/css/bootstrap.min.css" >
        <title>Country Data</title>
    </head>
    <body>
        <% List<Country> coun = (List<Country>) session.getAttribute("dataCountry"); %>

        <div class="container">
            <h1>Country Table</h1>
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#input-country">
                        Add Data
                    </button>
                    <a type="button" class="btn btn-light" href="addCountry.jsp">Add</a>
                    <a type="button" class="btn btn-light" href="../CountryServlet">Refresh</a>
                </div>
                <div class="card-body">
                    <table border="1" class="table table-striped">
                        <thead class="thead-dark" align="center">
                            <tr>
                                <th>Country ID</th>
                                <th>Country Name</th>
                                <th>Id Region</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody align="center">
                            <%for (Country country : coun) {%>
                            <tr>
                                <td><%= country.getCountryId()%></td>
                                <td><%= country.getCountryName()%></td>
                                <td><%= country.getRegionId().getRegionId()%></td>
                                <td>
                                    <a type="button" class="btn btn-primary" data-toggle="modal" data-target="#edit-country<%= country.getCountryId()%>">Edit</a>
                                    <!-- Button trigger modal -->
                                    <form action="../CountryServlet?country_id=<%= country.getCountryId()%>" method="post">
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
        <div class="modal fade" id="input-country" role="dialog" aria-labelledby="confirmDeleteLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Add Country</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    </div>
                    <form action="../CountryServlet" method="post">
                        <div class="modal-body">
                            <div class="form-group">
                                <input type="text" class="form-control" id="country_id" name="country_id" aria-describedby="emailHelp" placeholder="Enter Country Id">
                            </div>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <input type="text" class="form-control" id="country_name" name="country_name" aria-describedby="emailHelp" placeholder="Enter Country Name">
                            </div>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <input type="text" class="form-control" id="region_id" name="region_id" aria-describedby="emailHelp" placeholder="Enter Region Id">
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
        
         <!--modal edit country-->
        <%for (Country country : coun) {%>
        <div class="modal fade" id="edit-country<%= country.getCountryId()%>" role="dialog" aria-labelledby="confirmDeleteLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Update Country</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    </div>
                    <form action="../CountryServlet" method="get">
                        <div class="modal-body">
                            <div class="form-group">
                                <input type="text" class="form-control" id="country_id" name="country_id" value="<%= country.getCountryId()%>" required placeholder="Enter Job Title">
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" id="country_name" name="country_name" value="<%= country.getCountryName()%>" required placeholder="Enter Job Title">
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" id="region_id" name="region_id" value="<%= country.getRegionId().getRegionId()%>" required placeholder="Enter Minimal Salary">
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


        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="../assets/js/bootstrap.min.js"></script>
    </body>  
</html>