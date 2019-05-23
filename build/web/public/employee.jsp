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
        <link href="../assets/css/mdb.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/jq-3.3.1/dt-1.10.18/datatables.min.css"/>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

        <script type="text/javascript" src="https://cdn.datatables.net/v/bs4/jq-3.3.1/dt-1.10.18/datatables.min.js"></script>
        <!--        <script src="https://code.jquery.com/jquery.js"></script>-->
        <!--        <script src="assets/js/bootstrap.min.js"></script>-->
        <script src="../assets/js/mdb.min.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script>
            $(function () {
                $("#datepicker").datepicker();
            });
        </script>
    </head>
    <body>
        <% List<Employee> list = (List<Employee>) session.getAttribute("dataEmployee"); %>
        <% String notif = (String) session.getAttribute("notif"); %>

        <div class="container">
            <% if (notif != null) {%>
            <%= "<div class='alert alert-danger' role='alert'>" + notif + "</div>"%>
            <%}%>
            <div class="jumbotron">
                <h1 class="center">Employee Table</h1>
            </div>
            <!-- Button Add Modal Employee -->
            <a href="#" class="btn btn-sm btn-primary" data-toggle="modal" data-target="#add-employee">
                Add Employee
            </a>
            <!-- Button Refresh Employee -->
            <a href="../EmployeeServlet" class="btn btn-sm btn-warning">
                Refresh
            </a>
            <div class="row">
                <div class="col-12">
                    <table id="table-employee" class="table table-responsive">
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
                                    <!-- Button Add Modal Employee -->
                                    <a href="#" class="btn btn-sm btn-primary btn-block" id="btn-<%= employee.getEmployeeId()%>" data-toggle="modal" data-target="#edit-employee-<%= employee.getEmployeeId()%>">Edit</a>
                                    <a href="#" class="btn btn-sm btn-danger btn-block" id="btn-<%= employee.getEmployeeId()%>" data-toggle="modal" data-target="#delete-employee-<%= employee.getEmployeeId()%>">Delete</a>
                                </td>
                            </tr>

                            <!-- Modal Update -->
                        <div class="modal fade" id="edit-employee-<%= employee.getEmployeeId()%>" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                            <div class="modal-dialog" role="document">
                                <div class="modal-dialog modal-lg">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title" id="exampleModalLabel">Edit Employee - <%= employee.getLastName()%></h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                        <div class="modal-body">
                                            <%= employee.getFirstName()%>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                                            <button type="button" class="btn btn-primary">Save changes</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Modal Delete -->
                        <div class="modal fade" id="delete-employee-<%= employee.getEmployeeId()%>" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                            <div class="modal-dialog" role="document">
                                <div class="modal-dialog modal-lg">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title" id="exampleModalLabel">Delete Employee - <%= employee.getEmployeeId()%></h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                        <div class="modal-body">
                                            <%= employee.getFirstName()%>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                                            <a href="../EmployeeServlet?delEmpId=<%= employee.getEmployeeId()%>" class="btn btn-danger">Yes, I delete it</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

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

            $('.datepicker').pickadate({
                weekdaysShort: ['Su', 'Mo', 'Tu', 'We', 'Th', 'Fr', 'Sa'],
                showMonthsShort: true
            })
        </script>
    </body>











    <!-- Add Modal -->
    <div class="modal fade" id="add-employee" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Add Employee</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">

                        <form>
                            <div class="form-row">
                                <input type="hidden" class="form-control" id="empId" name="empId" placeholder="Employee ID" value="0">
                                <div class="form-group col-md-6">
                                    <label for="empFirstname">Firstname</label>
                                    <input type="text" class="form-control" id="empFirstname" name="empFirstname" placeholder="Firstname">
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="empLastname">Lastname</label>
                                    <input type="text" class="form-control" id="empLastname" name="empLastname" placeholder="Lastname" required="">
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <label for="empEmail">Email</label>
                                    <input type="email" class="form-control" id="empEmail" name="empEmail" placeholder="Email" required="">
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="empPhone">Phone Number</label>
                                    <input type="number" class="form-control" id="empPhone" name="empPhone" placeholder="Phone Number">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="datepicker">Hire Date</label>
                                <input placeholder="Selected date" type="text" id="datepicker" class="form-control datepicker" name="empHireDate" required="">
                            </div>
                            <div class="form-group">
                                    <label for="empJobId">Job</label>
                                    <select id="empJobId" class="form-control" name="empJobId">
                                        <option selected>Choose...</option>
                                        <option value="">...</option>
                                    </select>
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <label for="empSalary">Salary</label>
                                    <input placeholder="Salary" type="number" id="empSallary" class="form-control" name="empSalary">
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="empCommissionPct">Commission Pct</label>
                                    <input placeholder="Commission Pct" type="number" id="empCommissionPct" class="form-control" name="empCommPct">
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <label for="empManagerId">Manager</label>
                                    <select id="empManagerId" class="form-control" name="empManagerId">
                                        <option selected>Choose...</option>
                                        <option value="">...</option>
                                    </select>
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="empDepartmentId">Department</label>
                                    <select id="empDepartmentId" class="form-control" name="empDepartmentId">
                                        <option selected>Choose...</option>
                                        <option value="">...</option>
                                    </select>

                                </div>
                            </div>

                            <!--                            <div class="form-row">
                                                            <div class="form-group col-md-6">
                                                                <label for="inputCity">City</label>
                                                                <input type="text" class="form-control" id="inputCity">
                                                            </div>
                                                            <div class="form-group col-md-4">
                                                                <label for="inputState">State</label>
                                                                <select id="inputState" class="form-control">
                                                                    <option selected>Choose...</option>
                                                                    <option>...</option>
                                                                </select>
                                                            </div>
                                                            <div class="form-group col-md-2">
                                                                <label for="inputZip">Zip</label>
                                                                <input type="text" class="form-control" id="inputZip">
                                                            </div>
                                                        </div>-->
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary">Save changes</button>
                    </div>
                </div>
            </div>
        </div>
    </div>

</html>
