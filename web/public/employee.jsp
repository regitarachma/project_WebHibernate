<%-- 
    Document   : employee
    Created on : May 22, 2019, 2:03:27 AM
    Author     : Okala
--%>

<%@page import="models.Employee"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Table</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Bootstrap -->
        <link href="../assets/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/jq-3.3.1/dt-1.10.18/datatables.min.css"/>

        <script type="text/javascript" src="https://cdn.datatables.net/v/bs4/jq-3.3.1/dt-1.10.18/datatables.min.js"></script>
    </head>
    <body>
        <% List<Employee> list = (List<Employee>) session.getAttribute("dataEmployee"); %>

        <div class="container">
            <div class="jumbotron">
                <h1 class="center">Employee Table</h1>
                    <!-- Button trigger modal -->
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                        Add Employee
                    </button>
            </div>
            <div class="row">
                <div class="col-12">
                    <table id="table-employee">
                        <thead>
                        <th>ID</th>
                        <th>FirstName</th>
                        <th>LastName</th>
                        <th>Email</th>
                        <th>Phone</th>
                        <th>HireDate</th>
                        <th>Salary</th>
                        <th>Commission Pct</th>
                        <th>JobID</th>
                        <th>ManagerID</th>
                        <th>DepartmentID</th>
                        <th>Options</th>
                        </thead>
                        <tbody>
                            <% for (Employee employee : list) {%>
                            <tr>
                                <td><%= employee.getEmployeeId()%></td>
                                <td><%= employee.getFirstName()%></td>
                                <td><%= employee.getLastName()%></td>
                                <td><%= employee.getEmail()%></td>
                                <td><%= employee.getPhoneNumber()%></td>
                                <td><%= employee.getHireDate()%></td>
                                <td><%= employee.getSalary()%></td>
                                <%if (employee.getManagerId() == null) {%>
                                <td><%= "-"%></td>
                                <%} else {%>
                                <td><%= employee.getCommissionPct()%></td>
                                <%}%>
                                <td><%= employee.getJobId().getJobId()%></td>
                                <%if (employee.getManagerId() == null) {%>
                                <td><%= "-"%></td>
                                <%} else {%>
                                <td><%= employee.getManagerId().getEmployeeId()%></td>
                                <%}%>
                                <%if (employee.getDepartmentId() == null) {%>
                                <td><%= "-"%></td>
                                <%} else {%>
                                <td><%=employee.getDepartmentId().getDepartmentId()%></td>
                                <%}%>
                                <td>
                                    <a href="../EmployeeServlet?deleteId=<%= employee.getEmployeeId() %>" class="btn btn-sm btn-block btn-primary">Edit</a>
                                    <a href="../EmployeeServlet?editId=<%= employee.getEmployeeId() %>" class="btn btn-sm btn-block btn-danger">Delete</a>
                                </td>
                            </tr>
                            <%}%>
                        </tbody>
                        <tfoot>
                        <th>ID</th>
                        <th>FirstName</th>
                        <th>LastName</th>
                        <th>Email</th>
                        <th>Phone</th>
                        <th>HireDate</th>
                        <th>Salary</th>
                        <th>Commission Pct</th>
                        <th>JobID</th>
                        <th>ManagerID</th>
                        <th>DepartmentID</th>    
                        <th>Options</th>    
                        </tfoot>
                    </table>
                </div>
            </div>
        </div>
        <script>
            $(document).ready(function () {
                $('#table-employee').DataTable();
            });
        </script>
        <script src="https://code.jquery.com/jquery.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
    </body>
    
    
    
    
    
    
    
    
    


<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        ...
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
    
    
    
</html>