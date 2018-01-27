<%--
  Created by IntelliJ IDEA.
  User: avinash
  Date: 7/9/17
  Time: 11:38 PM
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
        <form class="form" action="/AdminMaterials/saveUpdatePdf">
            <h1>Update PDF</h1>

            <input type="hidden" value="${tutorial[0].id}" name="id">
            <input type="text" placeholder="Name" value="${tutorial[0].name}" name="name" required> <br>
            <div class="col-sm-offset-4 col-sm-4">
                <select name="sub" class="form-control" required>
                    <option value="none">None</option>
                    <g:each in="${tutorial[1]}">
                        <option value="${it.id}">${it.name}</option>
                    </g:each>
                </select>
            </div><br><br><br>


            <input type="submit"  class="btn btn-success" value="Save Update" >

            <g:link action="showPdf" role="button" class="btn btn-default">Cancel</g:link>



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