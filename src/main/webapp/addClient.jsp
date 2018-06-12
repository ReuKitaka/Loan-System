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

<div class="container-fluid">
    <div class="row">
        <form method="post" action="addClient">
            <%--<div class="row">--%>
            <div class="col-md-6 col-sm-3">
                <fieldset>
                    <legend>Personal info:</legend>
                    <div class="form-group">
                        <label class="control-label col-sm-2">Title:</label> <div class="col-sm-3"><select name="tit">
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
                    </select></div><br>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-3">Sir Name: </label> <div class="col-sm-3"><input type="text" name="sName"></div><br>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-3">First Name:</label><div class="col-sm-3"><input type="text" name="fName"></div><br>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-3">Other Names:</label><div class="col-sm-3"><input type="text" name="oNames"></div><br>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-3">Gender:</label> <div class="col-sm-3"><select name="gen">
                        <option>Male</option>
                        <option>Female</option>
                    </select></div><br>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-3">Date of birth:</label><div class="col-sm-3"><input type="date" name="dob"></div><br>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-3">ID Type:</label><div class="col-sm-3"><select name="idType">
                        <option>NATIONAL</option>
                        <option>PASSPORT</option>
                        <option>VOTER</option>
                        <option>DRIVER</option>
                        <option>NOT_SPECIFIED</option>
                    </select>
                    </div><br>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-3">ID No:</label><div class="col-sm-3"><input type="text" name="idNo"></div><br>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-3">Marital Status:</label> <div class="col-sm-3"><select name="mStatus">
                        <option>SINGLE</option>
                        <option>MARRIED</option>
                        <option>SEPARATED</option>
                        <option>DIVORCED</option>
                        <option>WIDOWED</option>
                        <option>NOT SPECIFIED</option>
                    </select></div><br>
                    </div>
                </fieldset>
            </div>
            <%--</div>--%>
            <div class="col-md-6 col-sm-3">
                <%--<div class="col-md-3 col-sm-3">--%>
                <div>
                    <fieldset>
                        <legend>Bank Info:</legend>
                        <div class="form-group">
                            <label class="control-label col-sm-3">Bank:</label><div class="col-sm-3"><input type="text" name="bank"></div><br>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3">Branch:</label><div class="col-sm-3"><input type="text" name="branch"></div><br>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3">Account No:</label><div class="col-sm-3"><input type="text" name="accNo"></div><br>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3">Salary:</label><div class="col-sm-3"><input type="text" name="sal"></div><br>
                        </div>
                    </fieldset>
                </div>
                <%--</div>--%>
                <%--<div class="col-xs-3 col-sm-3"></div>--%>



                <div>
                    <fieldset>
                        <legend>Address:</legend>
                        <div class="form-group">
                            <label class="control-label col-sm-3">Facebook:</label><div class="col-sm-3"><input type="text" name="fb"></div><br>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3">Twitter:</label><div class="col-sm-3"><input type="tw" name="tw"></div><br>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3">LinkedIn:</label><div class="col-sm-3"><input type="text" name="li"></div><br>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3">Google plus:</label><div class="col-sm-3"><input type="text" name="gPlus"></div><br>
                        </div>
                    </fieldset>
                </div>
            </div>
            <input type="submit" value="Submit">
        </form>
    </div>
</div>
</body>
</html>
