<%--
  Created by IntelliJ IDEA.
  User: avinash
  Date: 10/9/17
  Time: 11:23 PM
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

</head>

<body>


<div class="wrapper">
    <div class="container-fluid">
<form>
    <div style="float: right">
        <button type="submit" formaction="/UserPage/index" role="button" class="btn btn-primary">Home</button><br><br>
    </div>
        <div class="vue-wrapper">
            <div id="vue">
                <h1>Questions and Answers</h1>
<g:each in="${var}">
                <div class="question" >
                    <h4>
                        <strong>
                          ${it.firstName} ${it.lastName}  <br>
                        </strong>
                        <span>${it.email}</span><br>
                        <span>${it.sName.name}</span>
                    </h4>


                    <div class="question-and-answer">
                        <h2>${it.ask}</h2>
                        <p>${it.ans}</p>
                    </div>
                </div>
</g:each>
            </div>
        </div>
        <script src='https://cdnjs.cloudflare.com/ajax/libs/vue/1.0.21/vue.js'></script>

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