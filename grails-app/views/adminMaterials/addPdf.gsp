<%--
  Created by IntelliJ IDEA.
  User: avinash
  Date: 5/9/17
  Time: 8:45 AM
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

        <form class="form">
            <h1>Add a new PDF</h1>
            <input type="text" placeholder="Name" name="name" required/> <br>
            <input type="file" placeholder="File" name="file" id="file" required/><br>
            <div class="col-sm-offset-4 col-sm-4">
                <select name="sub" class="form-control">
                    <g:each in="${sub}">
                        <option value="${it.id}">${it.name}</option>
                    </g:each>
                </select>
            </div><br><br><br>


            <button type="submit" formaction="savePdf" class="btn btn-success">Save</button>
            <a href="/AdminMaterials/showPdf"> <button type="button"  class="btn btn-default">Cancel</button></a>


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