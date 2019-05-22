<%-- 
    Document   : department
    Created on : May 21, 2019, 9:58:05 PM
    Author     : RossaHening
--%>
<%@page import="entities.Department"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Department Data</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% List<Department> departments = (List<Department>) session.getAttribute("dataDepartment");%>
        <div class="jumbotron text-center">
            <h1> Data Department </h1>
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
                                <th>Department ID</th>
                                <th>Department Name</th>
                                <th>Manager ID</th>
                                <th>Location ID</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody align="center">
                        <!--<c:forEach var="datas" items="${list}">-->
                            <%for (Department d : departments) {
                            %>
                            <tr>
                                <td><%= d.getDepartmentId()%></td>
                                <td><%=d.getDepartmentName()%></td>
                                <% if (d.getManagerId() != null) {%>
                                <td><%=d.getManagerId().getEmployeeId()%></td>
                                <%}%>
                                <% if (d.getLocationId() != null) {%>
                                <td><%=d.getLocationId().getLocationId()%></td>
                                <%} else {%>
                                <td> null </td>
                                <%}%> 
                                <td>
                                    <a type="button" class="btn btn-warning" data-toggle="modal" data-target="#departmentEdit">Edit</a>
                                    <a type="button" class="btn btn-danger" href="#">Delete</a>
                                </td>

                            </tr>
                            <%}%>
                            <!--</c:forEach>
                            <!---->                        </tbody>
                    </table>
                    <a href="../DepartmentServlet"><input type="button" value="Refresh" /></a>
                </div>
            </div>
        </div> 

        
    </body>
</html>
