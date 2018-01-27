<%--
  Created by IntelliJ IDEA.
  User: avinash
  Date: 7/9/17
  Time: 9:14 AM
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
        <form class="form">
            <g:if test="${flash.name}">
                <div class="alert alert-success">
                    <strong>${flash.name}</strong>
                </div>
            </g:if>
            <g:if test="${flash.password}">
                <div class="alert alert-success">
                    <strong>${flash.password}</strong>
                </div>
            </g:if>

            <h1>My Account</h1>
            <table class="table">
                <thead>
                <tr>
                    <th></th>
                    <th></th>
                    <th></th>
                </tr>
                </thead>
                <tbody>

                <tr>
                    <td>Name</td>
                    <td>${name.firstName} ${name.lastName}</td>
                    <td ><g:link id="${name.id}" action="changeName" role="button" class="btn btn-primary">Change</g:link>
                    </td>
                </tr>
                <tr>
                    <td>E-mail</td>
                    <td>${name.email}</td>
                    <td></td>
                </tr>
                <tr>
                    <td>Role</td>
                    <td>${name.role}</td>
                    <td></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td>${name.password}</td>
                    <td ><g:link id="${name.id}" action="changePassword" role="button" class="btn btn-primary">Change</g:link>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>



                </tbody>
            </table>

            <br><br><br>
            <button type="submit" formaction="/AdminPage/index" role="button" class="btn btn-default">Home</button>

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

</body>
</html>