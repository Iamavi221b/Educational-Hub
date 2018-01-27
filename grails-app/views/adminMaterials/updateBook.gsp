<%--
  Created by IntelliJ IDEA.
  User: avinash
  Date: 5/9/17
  Time: 8:43 AM
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
        <form class="form" action="/AdminMaterials/saveUpdateBook">
            <h1>Update Book</h1>

            <input type="hidden" value="${book[0].id}" name="id">
            <input type="text" placeholder="Name" value="${book[0].name}" name="name" required> <br>
            <input type="text" placeholder="Author" value="${book[0].author}" name="author" required> <br>
            <input type="number" placeholder="Publication Date" value="${book[0].date}" name="date" required> <br>
            <input type="text" placeholder="Publication" value="${book[0].publication}" name="publication" required> <br>
            <div class="col-sm-offset-4 col-sm-4">
                <select name="sub" class="form-control" required>
                    <option value="none">None</option>
                    <g:each in="${book[1]}">
                        <option value="${it.id}">${it.name}</option>
                    </g:each>
                </select>
            </div><br><br><br>


            <input type="submit"  class="btn btn-success" value="Save Update" >

            <g:link action="showBook" role="button" class="btn btn-default">Cancel</g:link>



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