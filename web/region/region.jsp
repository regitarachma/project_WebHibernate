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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"> 
        <title>Region Data</title> 
    </head> 
    <body> 
        <% List<Region> regions = (List<Region>) session.getAttribute("dataRegion");%> 
        <div class="jumbotron text-center"> 
            <h1> Data Region </h1> 
            <p></p> 
        </div> 
        <div class="container"> 
            <div class="card border-info"> 
                <div class="card-header bg-info text-white"> 
                    <a type="button" class="btn btn-light" href="forminput.jsp">Add</a> 
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
                            <%for (Region r : regions) {

                            %> 
                            <tr> 
                                <td><%=r.getRegionId()%></td> 
                                <td><%=r.getRegionName()%></td> 
                                <td> 
                                    <a type="button" class="btn btn-warning" href="#">Edit</a> 
                                    <a type="button" class="btn btn-danger" href="#">Delete</a> 
                                </td> 
                                <!-- <c:forEach var="datas" items="${list}"> 
                                <tr> 
                                <td>${datas.region_id}</td> 
                                <td>${datas.region_name}</td> 
                                <td> 
                                <a>Edit</a> 
                                <a>Delete</a> 
                                </td> --> 
                            </tr> 
                            <%}%> 
                            <!--</c:forEach>--> 
                        </tbody> 
                    </table> 
                    <a href="../regionServlet"><input type="button" value="Refresh" /></a> 
                </div> 
            </div> 
        </div> 
    </body> 
</html>