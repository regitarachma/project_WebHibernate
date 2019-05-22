<%-- 
    Document   : region
    Created on : 21-May-2019, 13:25:55
    Author     : Rahmad
--%>

<%@page import="entities.Region"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../assets/css/bootstrap.min.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <div
        <% List<Region> regions = (List<Region>) session.getAttribute("dataRegion"); %>
        <div class="container">
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th scope="col">Region ID</th>
                        <th scope="col">Region Name</th>
                        <th scope="col">Control</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Region region : regions) {
                    %>
                    <tr>
                        <td><%= region.getRegionId()%></td>
                        <td><%= region.getRegionName()%></td>
                        <td>
                            <button type="button" class="btn btn-primary">Edit</button>
                            <button type="button" class="btn btn-danger">Delete</button>
                        </td>
                    </tr>
                    <% }%>
                </tbody>
            </table>
            <a href="../RegionServlet"><input type="submit" value="Refresh" /></a>
        </div>
    </body>
</html>
