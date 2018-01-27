<%--
  Created by IntelliJ IDEA.
  User: avinash
  Date: 7/9/17
  Time: 8:24 AM
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
            <ul class="nav nav-tabs">
                <li role="presentation" class="active"><g:link id="${book[1].id}" controller="materials" action="index" class="tabs">Book</g:link></li>
                <li role="presentation"><g:link id="${book[1].id}" controller="materials" action="adminPdf" class="tabs">Topics</g:link></li>
                <li role="presentation"><g:link id="${book[1].id}" controller="materials" action="adminTut" class="tabs"> Tutorial</g:link></li>
            </ul>
            <table class="table">
                <thead>
                <tr>
                    <th>S.No.</th>
                    <th>Name</th>
                    <th>Author</th>
                    <th>Year</th>
                    <th>Publication</th>
                    <th>Option</th>
                </tr>
                </thead>
                <tbody>
                <g:each in="${book[0]}">
                    <tr>
                        <td>${it.id}</td>
                        <td>${it.name}</td>
                        <td>${it.author}</td>
                        <td>${it.date}</td>
                        <td>${it.publication}</td>
                        <td ><g:link id="${it.id}" action="updateBook" role="button" class="btn btn-primary">Update</g:link>
                        <g:link id="${it.id}" action="deleteBook" role="button" class="btn btn-danger">Delete</g:link>

                        </td>
                    </tr>
                </g:each>
                </tbody>
            </table>

            <br><br><br>
            <button type="submit" formaction="/AdminPage/showSubject" role="button" class="btn btn-default">Back</button>
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