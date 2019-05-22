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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/jq-3.3.1/dt-1.10.18/datatables.min.css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

        <script type="text/javascript" src="https://cdn.datatables.net/v/bs4/jq-3.3.1/dt-1.10.18/datatables.min.js"></script>
        <title>Country Data</title>
    </head>
    <body>
        <% List<Country> countrys = (List<Country>) session.getAttribute("dataCountry"); %>
        <div class="container">
            <h1>Country Table</h1>
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#input-country">
                        Add Data
                    </button>
                    <!--<a type="button" class="btn btn-light" href="addCountry.jsp">Add</a>-->
                    <a type="button" class="btn btn-light" href="../countryServlett">Refresh</a>
                </div>
                <div class="card-body">
                    <table id="table_id" border="1" class="table table-striped">
                        <thead class="thead-dark" align="center">
                            <tr>
                                <th>Country ID</th>
                                <th>Country Name</th>
                                <th>Id Region</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody align="center">
                            <%for (Country country : countrys) {%>
                            <tr>
                                <td><%= country.getCountryId()%></td>
                                <td><%= country.getCountryName()%></td>
                                <td><%= country.getRegionId().getRegionId()%></td>
                                <td>
                                    <a type="button" class="btn btn-primary" data-toggle="modal" data-target="#edit-country<%= country.getCountryId()%>">Edit</a>
                                    <a type="button" class="btn btn-danger" data-toggle="modal" data-target="#delete-country<%= country.getCountryId()%>">Delete</a>
                                </td>
                            </tr>


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
                    <form action="../countryServlett" method="post">
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
        <%for (Country country : countrys) {%>
        <div class="modal fade" id="edit-country<%= country.getCountryId()%>" role="dialog" aria-labelledby="confirmDeleteLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Update Country</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    </div>
                    <form action="../countryServlett" method="get">
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

        <!-- Modal delete Dialog -->
        <%for (Country country : countrys) {%>
        <div class="modal fade" id="delete-country<%= country.getCountryId()%>" role="dialog" aria-labelledby="confirmDeleteLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Delete Region</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    </div>
                    <form action="../countryServlett" method="get">
                        <input type="hidden" class="form-control" id="country_id" name="country_id" value="<%= country.getCountryId()%>">
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
        <script>
            $(document).ready(function () {
                $('#table_id').DataTable();
            });
        </script>
    </body>  
</html>