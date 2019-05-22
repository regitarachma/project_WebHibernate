<%-- 
    Document   : addRegion
    Created on : May 21, 2019, 11:19:15 AM
    Author     : Relion31
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../assets/css/bootstrap.min.css">
        <title>Add Data</title>
    </head>
    <body>
        <div class="container">
            <h1>Tambah Data Region</h1>
            <div class="row">
                <form action="../RegionServlet" method="post" >
                    <div class="col-md-12">
                        <div class="form-group">
                            <label for="region_name">Region Name</label>
                            <input type="text" class="form-control" id="region_name" name="region_name" aria-describedby="emailHelp" placeholder="Enter email">
                        </div>
                        <button type="submit" class="btn btn-primary">Save</button>
                    </div>
                </form>
            </div> 
        </div>

    </body>
</html>
