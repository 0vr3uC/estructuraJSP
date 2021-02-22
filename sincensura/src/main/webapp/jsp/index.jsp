<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="ford.common.Label"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="./scriptsgenerales.jsp" />
<link href="${pageContext.request.contextPath}/resources/css/index.css"
	type="text/css" rel="stylesheet" />
<meta charset="UTF-8">
<title>Inicio proyectoFord</title>
</head>
<body class="fondo-pagina">
	<h1 class="text-center titulo-inicio">Proyecto Ford</h1>
	<div class="divcentral">
		<p><%=Label.getLabel("presentacion.inicio")%></p>
		<br> 
		<input type="button"
			class="acceptButton" value="<%=Label.getLabel("aceptar")%>"
			onclick="document.location.href = './principal'">
	</div>
</body>
</html>