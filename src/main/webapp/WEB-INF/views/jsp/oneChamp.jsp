<%@page session="false" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Logo Nav - Start Bootstrap Template</title>

    <!-- Bootstrap Core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="resources/css/logo-nav.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
<!-- Navigation -->
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span> <span
                    class="icon-bar"></span> <span class="icon-bar"></span> <span
                    class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="welcome"> <img
                    src="resources/img/xSzymo.png" alt="">
            </a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse"
             id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a href="team">Team</a></li>
                <li><a href="oneChampion">Champion</a></li>
                <!-- <li><a href="#">About</a></li>
                <li><a href="#">Services</a></li>
                <li><a href="#">Contact</a></li> -->
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>

<!-- Page Content -->
<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <form method="post" action="countersForOneChampion">
                <input type="hidden" name="${_csrf.parameterName}"
                       value="${_csrf.token}"></input>
                <div style="float: left">
                    <table>
                        <tr>
                            <td>
                                <h3>Enemy champion</h3>
                            </td>
                        </tr>
                        <tr>
                            <td><input type="hidden" name="enemyChampion"
                                       id="enemyChampion" value=""></td>
                        </tr>
                        <tr>
                            <td><input type="text" name="enemyName" id="enemyName"/></td>
                            <td>
                                <div id="enemyChampion123"></div>
                            </td>
                        </tr>
                        <tr>
                            <td><input type="button" onclick="setOneEnemy()"
                                       value="Set champ"/></td>

                            <!-- <td><input type="submit" name="nameEnemy" id="Go"
                                value="Go"></input></td>  -->
                        </tr>
                    </table>
                </div>
            </form>
        </div>
    </div>
</div>

<!-- /.container -->

<!-- jQuery -->
<script src="resources/js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="resources/js/bootstrap.min.js"></script>


<script src="resources/js/championsFunctions.js"></script>

<%--
<script type="text/javascript" src="<c:url value="resources/js/halo.js" />"> </script>  --%>


</body>

</html>
