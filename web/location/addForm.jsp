<%-- 
    Document   : addForm
    Created on : May 21, 2019, 10:59:31 PM
    Author     : Ode
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../assets/css/bootstrap.min.css">
        <title>Tambah Data</title>
    </head>
    <body>
        <div class="container">
            <h1>Tambah Data Location</h1>
            <div class="row">
                <form action="../locationServlet" method="post" >
                    <div class="col-md-12">
                        <div class="form-group">
                            <label for="location_id">Location ID</label>
                            <input type="text" class="form-control" id="location_id" name="location_id" placeholder="Enter Address">
                        </div>
                        <div class="form-group">
                            <label for="street_address">Address</label>
                            <input type="text" class="form-control" id="street_address" name="street_address" placeholder="Enter Address">
                        </div>
                        <div class="form-group">
                            <label for="postal_code">Postal Code</label>
                            <input type="text" class="form-control" id="postal_code" name="postal_code" placeholder="Enter Postal">
                        </div>
                        <div class="form-group">
                            <label for="city">City</label>
                            <input type="text" class="form-control" id="city" name="city" placeholder="Enter City">
                        </div>
                        <div class="form-group">
                            <label for="state_province">Province</label>
                            <input type="text" class="form-control" id="state_province" name="state_province" placeholder="Enter Province">
                        </div>
                        <div class="form-group">
                            <label for="country_id">Country ID</label>
                            <input type="text" class="form-control" id="country_id" name="country_id" placeholder="Enter Country ID">
                        </div>
                        <button type="submit" class="btn btn-primary">Save</button>
                    </div>
                </form>
            </div> 
        </div>
    </body>
</html>
