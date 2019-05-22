<%-- 
    Document   : forminput
    Created on : May 21, 2019, 11:18:03 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Region</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js">min.js"></script>

    </head>
    <body>
        <div class="container">
        <div class="card border-info">
        <div class="card-header bg-info text-white">
        </div>
        <div class="card-body">
        <table border="1" class="table table-striped">
        <thead class="thead-dark" align="centerh">
        <h2>Form Input Regional</h2>
        <form action="../regionServlet" method="post">
        <div class="form-group">
        <label for="region">Regional Name:</label>
        <input type="text" class="form-control" id="region" placeholder="Enter Regional Name" name="region">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
        </form>
        </div>
        
    
    </body >
    </html>
