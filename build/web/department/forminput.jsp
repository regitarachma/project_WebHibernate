<%-- 
    Document   : forminput
    Created on : May 21, 2019, 9:58:18 PM
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
        <div class="container">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                </div>
                <div class="card-body">
                    <table border="1" class="table table-striped">
                        <thead class="thead-dark" align="centerh">
                        <h2>Form Input Department</h2>
                        <form action="../departmentServlet" method="post">
                            <div class="form-group">
                                <label for="dName">Department name:</label>
                                <input type="text" class="form-control" id="dName" placeholder="Enter department Name" name="dName">
                            </div>
                            <div class="form-group">
                                <label for="managerId">Manager Id:</label>
                                <input type="text" class="form-control" id="managerId" placeholder="Enter manager Id" name="managerId">
                            </div>
                            <div class="form-group">
                                <label for="locId">Loc Id:</label>
                                <input type="text" class="form-control" id="locId" placeholder="Enter loc Id" name="locId">
                            </div>
                            <button type="submit" class="btn btn-default">Submit</button>
                        </form>
                </div>


                </body>
                </html>
