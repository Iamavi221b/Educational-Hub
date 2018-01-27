<%--
  Created by IntelliJ IDEA.
  User: avinash
  Date: 7/9/17
  Time: 11:39 PM
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
        <form class="form" action="/NameList/saveAdmin">

            <input type="hidden" value="${name.id}" name="id">
            <input type="text" placeholder="First Name" value="${name.firstName}" name="fname" required> <br>
            <input type="text" placeholder="Last Name" value="${name.lastName}" name="lname" required> <br>
            <input type="text" placeholder="Email" value="${name.email}" name="email" disabled> <br>
            <input type="text" placeholder="Password" value="${name.password}" name="pass" required> <br>
            <input type="text" placeholder="Role" value="${name.role}" name="role" required> <br>
            <input type="submit"  class="btn btn-success" value="Save Update" >
            <g:link action="index" role="button" class="btn btn-default">Cancel</g:link>



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