<%--
  Created by IntelliJ IDEA.
  User: bigman
  Date: 6/11/18
  Time: 10:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>

    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <script>
        var check = function() {
            if (document.getElementById('pass').value ==
                document.getElementById('confpass').value) {
                document.getElementById('message').style.color = 'green';
                document.getElementById('message').innerHTML = 'matching';
            } else {
                document.getElementById('message').style.color = 'red';
                document.getElementById('message').innerHTML = 'not matching';
            }
        }
    </script>
    <%--$('#password, #confirm_password').on('keyup', function () {--%>
    <%--if ($('#password').val() == $('#confirm_password').val()) {--%>
    <%--$('#message').html('Matching').css('color', 'green');--%>
    <%--} else--%>
    <%--$('#message').html('Not Matching').css('color', 'red');--%>
    <%--});--%>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <nav class="navbar navbar-inverse">

            <div class="navbar-header">
                <a class="navbar-brand" href="#">      Loan System</a>
            </div>
            <ul class="nav navbar-nav">
                <li  ><a href="#">Home</a></li>
                <li><a class="active" href="javascript:void(0)">Add Client</a></li>

                <li><a href="view">View</a></li>


            </ul>
            <ul class="nav navbar-nav navbar-right">
                <%--<li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>--%>
                <li><a href="logout"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
            </ul>
        </nav>

    </div>
</div>

<div class="container-fluid">
    <div class="row">
        <form method="post" action="addUser">
            <%--<div class="row">--%>
            <div class="col-md-6 col-sm-3">
                <fieldset>
                    <legend>Personal info:</legend>

                    <div class="form-group">
                        <label class="control-label col-sm-3">Sir Name: </label> <div class="col-sm-3"><input type="text" name="sName"></div><br>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-3">Other Names:</label><div class="col-sm-3"><input type="text" name="oNames"></div><br>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-3">User Name:</label><div class="col-sm-3"><input type="text" name="uName"></div><br>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-3">Email:</label><div class="col-sm-3"><input type="email" name="em"></div><br>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-3">Password:</label><div class="col-sm-3">
                        <input type="password" id="pass" name="pass" onkeyup="check()"></div><br>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-3">Confirm password:</label><div class="col-sm-3">
                        <input type="password" id="confpass" name="confpass" onkeyup="check()"></div><br>
                    </div>
                    <span id='message'></span>
                </fieldset>
            </div>
            <%--</div>--%>

    </div>
    <input type="submit" value="Submit">
    </form>
</div>
</div>
</body>
</html>
