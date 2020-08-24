<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="nsc.common.Label"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NSC</title>
<jsp:include page="scriptsgenerales.jsp" />
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/principal.js"></script>
<link href="${pageContext.request.contextPath}/resources/css/principal.css" type="text/css" rel="stylesheet" />
</head>
<body class="fondo-pagina">
	<header class="header">
		<nav class="text-center">
			<a class="menu" href="./principal" title="Ir a la página principal">NSC</a> <a class="menu" href="./categorias"
				title="Ver las diferentes categorias">Categorias</a> <a class="menu" href="./categorias" title="Ver las diferentes categorias">Categorias</a>
			<c:choose>
				<c:when test="${usuario == null}">
					<button id="IniciarSesion" type="button" class="menu acceptButton" data-toggle="modal" data-target="#myModalInicio"><%=Label.getLabel("iniciar.sesion")%></button>
					<button id="RegistrarUsuario" type="button" class="menu acceptButton" data-toggle="modal" data-target="#myModalRegistro"><%=Label.getLabel("registrarse")%></button>
				</c:when>
				<c:otherwise>
					<img class="menu" src="https://img.icons8.com/cotton/64/000000/groups--v1.png" />
					<form id="salirUsuario" action="./salir" method="post">
						<button type="submit" form="salirUsuario" class="menu acceptButton"><%=Label.getLabel("logout")%></button>
					</form>
				</c:otherwise>
			</c:choose>
		</nav>
	</header>
	<div class="cuerpoPrincipal">
		<section></section>
	</div>
	<aside>publicidad</aside>
	<footer>Footer Noticias Sin Censura</footer>
	<jsp:include page="inicioRegistro.jsp" />
	<c:set var="errorInicioComprobacion" scope="session" value="${errorInicio}" />
	
	
	<script type="text/javascript">
		var errorInicio = '${errorInicio}';
		var errorRegistro = '${errorRegistro}';
		window.onload = comprobaciones(errorInicio, errorRegistro);
	</script>
</body>
</html>