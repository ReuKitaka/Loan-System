<%--
  Created by IntelliJ IDEA.
  User: bigman
  Date: 5/21/18
  Time: 10:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add client</title>

    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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

<div class="container">
    <div class="row">
        <div class="col-xs-6 col-sm-3">
            <form method="post" action="addClient">
                Title:<select name="tit">
                <option>MR</option>
                <option>MRS</option>
                <option>MISS</option>
                <option>MS</option>
                <option>DR</option>
                <option>PROF</option>
                <option>REV</option>
                <option>ENG</option>
                <option>VIRTUAL</option>
                <option>HON</option>
                <option>UNKNOWN</option>
            </select>

                Sir Name:<input type="text" name="sName">
                First Name:<input type="text" name="fName">
                Other Names:<input type="text" name="oNames">
            </form>
        </div>
        <div class="col-xs-6 col-sm-3">
            <div class="col-xs-3 col-sm-3"></div>
            <div class="col-xs-3 col-sm-3"></div>
        </div>
    </div>
</div>
</body>
</html>
