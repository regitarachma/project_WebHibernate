<%-- 
    Document   : Region
    Created on : May 21, 2019, 1:46:07 AM
    Author     : RR17
--%>

<%@page import="entities.Region"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Region Data</title>
    </head>
    <body>
        <%-- "dataRegion" harus sama persis dengan di servlet, proses pengambilan data --%>
        <% List<Region> regions = (List<Region>)session.getAttribute("dataRegion"); %>
        <h1><center>Data Region</center></h1>
        <div class="container">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a type="button" class="btn btn-light" href="addRegionForm.jsp">Tambah Region</a>
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
                        <!--<c:forEach var="datas" items="${list}">-->
                            
                            <%-- table pengambilan data region --%>
                            <% for (Region region : regions) { %>
                            <tr>
                                <td> <%= region.getRegionId() %> </td>
                                <td> <%= region.getRegionName()%> </td>
                                <td>
                                    <a type="button" class="btn btn-warning" href="#">Edit</a>
                                    <a type="button" class="btn btn-danger" href="#">Delete</a>
                                </td>
        <!--                            <c:forEach var="datas" items="${list}">
                                    <tr>
                                        <td>${datas.region_id}</td>
                                        <td>${datas.region_name}</td>
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
                        <a href="../RegionServlet"><input type="button" value="Refresh" /></a>
                </div>
            </div>
        </div>
        
<!--         Button trigger modal 
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
            Tambah Data Region
        </button>
        
        
         Modal 
        <div class="modal fade" id="addRegion" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Modal Title</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    
                    <div class="modal-body">
                        <form action="../RegionServlet" method="post">
                            <div class="form-group">
                                <label for="region">Region Name</label>
                                <input type="text" class="form-control" name="region" id="region" placeholder="Nama Region" />
                            </div>
                    </div>
                    
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary">Save</button>
                    </div>
                    
                    </form>
                </div>
            </div>
        </div>
        
        <script>
            $('#myModal').on('shown.bs.modal', function (){
                    $('#myInput').trigger('focus')
                })
        </script>
        <script src="https://code.jquery.com/jquery.js"></script>
        <script src="../assets/js/bootstrap.min.js"></script>-->
    </body>
</html>
