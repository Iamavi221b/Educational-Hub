<%--
  Created by IntelliJ IDEA.
  User: avinash
  Date: 4/9/17
  Time: 11:16 PM
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
        <g:if test="${flash.exist}">
            <div class="alert alert-danger">
                <strong>${flash.exist}</strong>
            </div>
        </g:if>

        <h1>Educational Hub</h1>
        <h3>Create a New Account</h3>

        <form class="form" method="post">
            <input type="text" placeholder="First Name" name="firstname" required/>
            <input type="text" placeholder="Last Name" name="lastname" required/>
            <input type="email" placeholder="email" name="email" required/>
            <input type="password" placeholder="Password" name="password" required/>
            <button type="submit" formaction="save" class="btn">Create Account</button>
            <a href="/UserLogin/index"> <button type="button" class="btn">Cancel</button></a>

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