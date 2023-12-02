<%@page import="model.Login_Register"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Phong cho thuê trọ :))</title>
<link rel="stylesheet" type="text/css" href="TrangChu.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"
	integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT"
	crossorigin="anonymous"></script>
<%
String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
		+ request.getContextPath();
%>
<link href="<%=url%>/css/index.css" rel="stylesheet">
</head>
<body>
	<!-- Header -->
	<header class="header">
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container-fluid">
				<!-- Logo -->
				<div class="col-1">
					<a class="navbar-brand" href="#"> <img src="img/logo.png"
						alt="" height="50" class="d-inline-block align-text-top">
					</a>
				</div>

				<!-- Search Form -->
				<div class="col-9">
					<form class="d-flex">
						<input class="form-control me-2" type="search"
							placeholder="Search" aria-label="Search" style="width: 90%;">
						<button class="btn btn-outline-success" type="submit">Search</button>
					</form>
				</div>

				<div class="col-2">
					<%
					Object obj = session.getAttribute("login");
					Login_Register lg = null;
					if (obj != null) {
						lg = (Login_Register) obj;
					}
					if (lg == null) {
					%>
					<a href="register.jsp" class="register" id="register">Đăng ký</a> <a
						href="login.jsp" class="login" id="login">Đăng nhập</a>
					<%
					} else {
					%>
					<div class="dropdown">
						<button class="btn btn-secondary dropdown-toggle" type="button"
							id="dropdownMenuButton1" data-bs-toggle="dropdown"
							aria-expanded="false">
							Admin: <b><%=lg.getUser()%></b>
						</button>
						<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
							<li><a class="dropdown-item" href="#">Action</a></li>
							<li><a class="dropdown-item" href="#">Another action</a></li>
							<hr>
							<li><a href="logout" id="logout"
								class="dropdown-item text-center text-decoration-none d-block">
									<b>Đăng xuất</b>
							</a></li>
						</ul>
					</div>
					<%
					}
					%>
				</div>
			</div>
		</nav>
	</header>
	<!-- Navbar -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<div class="navbar-nav">
					<a class="nav-link" href="#">Trang chủ</a> <a class="nav-link"
						href="#">Phòng trọ cho thuê</a> <a class="nav-link" href="#">Tìm
						người ở ghép</a> <a class="nav-link" href="#">Tin tức</a> <a
						class="nav-link" href="#">Bảng giá</a>
				</div>
			</div>
		</div>
	</nav>

</body>
</html>