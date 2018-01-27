<%--
  Created by IntelliJ IDEA.
  User: avinash
  Date: 5/9/17
  Time: 7:41 AM
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
        <g:if test="${flash.delete}">
            <div class="alert alert-success">
                <strong>${flash.delete}</strong>
            </div>
        </g:if>
        <g:if test="${flash.saveUpdate}">
            <div class="alert alert-success">
                <strong>${flash.saveUpdate}</strong>
            </div>
        </g:if>
        <g:if test="${flash.saveSubject}">
            <div class="alert alert-success">
                <strong>${flash.saveSubject}</strong>
            </div>
        </g:if>

        <form class="form">
            <div style="float: right">
                <button type="submit" formaction="/AdminPage/addSubject" role="button" class="btn btn-primary">Add a new Subject</button><br><br>
            </div>
            <table class="table">
                <h1>List of Books</h1>
                <thead>
                <tr>
                    <th>S.No.</th>
                    <th>Name</th>
                    <th>Branch</th>
                    <th>Option</th>
                </tr>
                </thead>
                <tbody>
                <g:each in="${sub}">
                    <tr>
                        <td>${it.id}</td>
                        <td>${it.name}</td>
                        <td>${it.branch}</td>
                        <td ><g:link id="${it.id}" action="updateSubject" role="button" class="btn btn-primary">Update</g:link>
                        <g:link id="${it.id}" action="deleteSubject" role="button" class="btn btn-danger">Delete</g:link>
                        <g:link id="${it.id}" controller="Materials" action="index" role="button" class="btn btn-primary">View Material</g:link>

                        </td>
                    </tr>
                </g:each>
                </tbody>
            </table>

            <br><br><br>
            <button type="submit" formaction="index" role="button" class="btn btn-default">Back</button>

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