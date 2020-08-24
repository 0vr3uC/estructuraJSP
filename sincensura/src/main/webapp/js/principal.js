function comprobaciones(errorInicio,errorRegistro) {
	if (errorInicio) {
		$('#IniciarSesion').click();
	}
	if (errorRegistro) {
		$('#RegistrarUsuario').click();
	}
}

