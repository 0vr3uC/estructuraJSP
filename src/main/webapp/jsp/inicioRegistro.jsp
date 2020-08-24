<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="nsc.common.Label"%>
<form method="post" action="./login" class="modal fade" id="myModalInicio" role="dialog">
	<div class="modal-dialog modal-lg">
		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<h1><%=Label.getLabel("iniciar.sesion") + " " + Label.getLabel("NSC")%></h1>
				<button type="button" class="close" data-dismiss="modal">&times;</button>
			</div>
			<div class="modal-body">
				<p>${errorInicio}</p>
				<table>
					<tr>
						<th width="50%"><%=Label.getLabel("correo.electronico")%></th>
						<th width="50%"><input name="correo" title="<%=Label.getLabel("correo.electronico")%>" type="email" required="required" /></th>
					</tr>
					<tr>
						<th width="50%"><%=Label.getLabel("contraseña")%></th>
						<th width="50%"><input name="contraseña" title="<%=Label.getLabel("contraseña")%>" type="password" required="required" /></th>
					</tr>
				</table>
			</div>
			<div class="modal-footer">
				<button type="submit" class="menu acceptButton" form="myModalInicio">Iniciar Sesión</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			</div>
		</div>
	</div>
</form>
<form method="post" action="./registro" class="modal fade" id="myModalRegistro" role="dialog">
	<div class="modal-dialog modal-lg">
		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<h1><%=Label.getLabel("iniciar.sesion") + " " + Label.getLabel("NSC")%></h1>
				<button type="button" class="close" data-dismiss="modal">&times;</button>
			</div>
			<div class="modal-body">
				<p>${errorRegistro}</p>
				<table>
					<tr>
						<th width="50%"><%=Label.getLabel("nombre")%></th>
						<th width="50%"><input name="nombre" title="<%=Label.getLabel("nombre")%>" type="text" required="required" /></th>
					</tr>
					<tr>
						<th width="50%"><%=Label.getLabel("correo.electronico")%></th>
						<th width="50%"><input name="correo" title="<%=Label.getLabel("correo.electronico")%>" type="email" required="required" /></th>
					</tr>
					<tr>
						<th width="50%"><%=Label.getLabel("contraseña")%></th>
						<th width="50%"><input name="contraseña" title="<%=Label.getLabel("contraseña")%>" type="password" required="required" /></th>
					</tr>
					<tr>
						<th width="50%"><%=Label.getLabel("repite.contraseña")%></th>
						<th width="50%"><input name="repiteContraseña" title="<%=Label.getLabel("repite.contraseña")%>" type="password"
							required="required" /></th>
					</tr>
				</table>
			</div>
			<div class="modal-footer">
				<button type="submit" class="menu acceptButton" form="myModalRegistro">Iniciar Sesión</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			</div>
		</div>
	</div>
</form>