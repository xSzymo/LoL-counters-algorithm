<%@page session="false"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Logo Nav - Start Bootstrap Template</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/logo-nav.css" rel="stylesheet">
</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
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
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="team">Team</a></li>
					<li><a href="oneChampion">Champion</a></li>
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
				<br> <br> <br>
				<div style="float: mid">
					<table>
						<tr>
							<td>
								<h1>
									Best counters for
									<c:out value="${champion} "></c:out>
									:
								</h1>
							</td>
						</tr>
						<c:set var="i" value="${0}"></c:set>
						<c:forEach items="${champions}" var="champion">
							<c:set var="i" value="${i+1}"></c:set>
							<tr>
								<td><h3>
										<c:out value="${i}. ${champion}"></c:out>
									</h3></td>
							</tr>
						</c:forEach>
					</table>
				</div>
				<br><br><br><br>

				<div style="float: mid">
					<table>
						<tr>
							<td>
								<h2>
									Tips :
								</h2>
							</td>
						</tr>
						<c:set var="i" value="${0}"></c:set>
						<c:forEach items="${tips}" var="tip">
							<c:set var="i" value="${i+1}"></c:set>
							<tr>
								<td><h4>
										<c:out value="${i}. ${tip}"></c:out>
									</h4></td>
							</tr>
						</c:forEach>
					</table>
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
