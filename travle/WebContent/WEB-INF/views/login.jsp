<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">	<!-- 페이지 인코딩 설정 -->
	<meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
	<link rel="stylesheet" href="<c:url value='/css/bootstrap.min.css'/>">
	<title>희망도서관</title>
</head>
<body>
	<nav class="navbar navbar-expand-md navbar-dark bg-light">

		<!-- 네비게이션 브랜드 부분 -->
		<a class="navbar-brand" href="<c:url value='/index.do'/>"><img alt="index" src="<c:url value='/img/logo.png'/>"></a>
		
		<!-- 우측 토글버튼 -->
		<button class="navbar-toggler" type="button" 
			data-toggle="collapse" data-target="#navbar">
			<!-- 토글버튼 아이콘 -->
			<span class="navbar-toggler-icon"></span>
		</button>
		
		<!-- 
			네비게이션 메뉴
			mr-auto 관련 설명은 아래 링크 참조
			https://getbootstrap.com/docs/4.0/utilities/spacing/
		-->
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item dropdown">
					<a class="nav-link dropdown-toggle" href="#" id="dropdown" data-toggle="dropdown" style="color: #000">회원페이지</a>
					<div class="dropdown-menu">
						<sec:authorize access="!hasRole('ADMIN') and !hasRole('USERS')">
							<a class="dropdown-item" href="<c:url value='/login.do'/>">로그인</a>
							<a class="dropdown-item" href="<c:url value='/join.do'/>">회원가입</a>
						</sec:authorize>
						<sec:authorize access="hasRole('ADMIN') or hasRole('USERS')">
							<a class="dropdown-item" href="<c:url value='/logout.do'/>">로그아웃</a>
							<a class="dropdown-item" href="<c:url value='/users-modify.do'/>">회원정보 수정</a>
						</sec:authorize>
					</div>
				</li>
			</ul>
			
			<!-- 검색 창 -->
			<form action="<c:url value='/book-search.do'/>"  class="form-inline my-2 my-md-0" method="get">
				<input class="form-control mr-sm-2" type="text" name="input" id="input" placeholder="도서 검색">
				<input class="btn btn-outline-primary my-2 my-sm-0"  type="submit" value="검색">
			</form>
		</div>
	</nav>
	<br><br><h1 align="center" >로그인 페이지</h1><br><br>
	<div class="container">
		<form action="<c:url value='/login-processing'/>" method="post">
			<div class="form-group row">	
				<label class="col-sm-2 col-form-lable" for="email">이메일</label>
				<div class="col-sm-10">
					<input class="form-control" type="email" id="email" name="email" placeholder="email를 입력하세요" required>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 col-form-label" for="password">비밀번호</label>
				<div class="col-sm-10">
					<input class="form-control" type="password" id="password" name="password" placeholder="비밀번호를 입력하세요" required>
				</div>
			</div>
				<input type="hidden" name="${ _csrf.parameterName }" value="${ _csrf.token }"> 
			<div align="center">
				<input class="btn btn-primary" type="submit" value="로그인">	
			</div>
		</form>
	</div>
	
	<!-- Footer -->
	<footer class="bg-light mt-4 p-5 text-center" style="color: #000">
		<span>Copyright &copy; 2018 희망도서관  All Rights Reserved.</span>
	</footer>

	
	<script src="<c:url value='/js/popper.min.js'/>"></script>
	<script src="<c:url value='/js/jquery-3.3.1.min.js'/>"></script>
	<script src="<c:url value='/js/bootstrap.min.js'/>"></script>	
</body>
</html>