<%-- 
    Document   : addRegionForm
    Created on : May 21, 2019, 2:29:09 PM
    Author     : RR17
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Add Form Region</title>
    </head>
    
    <body>
        <div class="container">
            <div class="row">
                <div class="col-6-bg-light">
                    <h1>Tambah Data Region</h1>
                    <form action="../RegionServlet" method="post">
                        <div class="form-group">
                            <label for="region">Region Name</label>
                            <input type="text" class="form-control" name="region" id="region" placeholder="Nama Region">
                        </div>
                        <div class="form-group">
                            <button type="submit" class="btn btn-primary">Simpan</button>
                        </div>
                    </form></div>
                <div class="col-6"></div>
            </div>
        </div>
    </body>
</html>
