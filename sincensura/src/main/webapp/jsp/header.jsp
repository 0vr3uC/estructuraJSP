<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link
	href="${pageContext.request.contextPath}/resources/css/general.css"
	type="text/css" rel="stylesheet" />

<header class="header">
	<nav class="text-center">
		<a class="menu" href="./principal" title="Ir a la página principal">NSC</a>
		<a class="menu" href="./categorias"
			title="Ver las diferentes categorias">Categorias</a> <a class="menu"
			href="./categorias" title="Ver las diferentes categorias">Categorias</a>

		<c:if test="${logueado == true}">
			<a class="menu acceptButton" href="/login">Inicia sesión</a>
			<a class="menu acceptButton" href="/registro"> Regístrate</a>
		</c:if>
		
		<label>${logueado}</label>
	</nav>
</header>