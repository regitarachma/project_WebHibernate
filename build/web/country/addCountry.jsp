<%-- 
    Document   : addCountry
    Created on : 21-May-2019, 23:31:36
    Author     : yosef
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../assets/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Tambah Data Country</h1>
            <div class="row">
                <form action="../CountryServlet" method="post" >
                    <div class="col-md-12">
                        <div class="form-group">
                            <label for="country_id">Country Id</label>
                            <input type="text" class="form-control" id="country_id" name="country_id" aria-describedby="emailHelp" placeholder="Enter Id Country">
                            <label for="country_name">Country Name</label>
                            <input type="text" class="form-control" id="country_name" name="country_name" aria-describedby="emailHelp" placeholder="Enter Name Country">
                            <label for="region_id">Id Region</label>
                            <input type="text" class="form-control" id="region_id" name="region_id" aria-describedby="emailHelp" placeholder="Enter Region Id">
                        </div>
                        <button type="submit" class="btn btn-primary">Save</button>
                    </div>
                </form>
            </div> 
        </div>
    </body>
</html>
