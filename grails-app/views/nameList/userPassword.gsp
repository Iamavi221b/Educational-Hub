<%--
  Created by IntelliJ IDEA.
  User: avinash
  Date: 7/9/17
  Time: 9:13 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Educational Hub</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    <asset:stylesheet src="educationalHub.css"/>
    <asset:javascript src="educationalHub.js"/>
</head>

<body>
<div class="wrapper">
    <div class="container-fluid">
        <g:if test="${flash.pass}">
            <div class="alert alert-danger">
                <strong>${flash.pass}</strong>
            </div>
        </g:if>


        <form class="form" action="/NameList/saveUserPassword">
            <input type="hidden" id="${acc.id}">
            <input type="password" placeholder="Current Password"  name="pass" required/>
            <input type="password" placeholder="New Password"  name="passw" required/>
            <input type="submit"  class="btn btn-success" value="Change" >
            <g:link action="userAccount" role="button" class="btn btn-default">Cancel</g:link>

        </form>
    </div>

    <ul class="bg-bubbles">
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
    </ul>
</div>
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

<script src="js/index.js"></script>

</body>
</html>