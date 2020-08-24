package nsc.mapper;

import nsc.jpa.Usuario;
import nsc.so.UsuarioSO;

public class UsuarioMapper extends BaseMapper<UsuarioSO, Usuario> {

	public Usuario fromSO(UsuarioSO usuarioSO) {
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(usuarioSO.getIdUsuario());
		usuario.setNombre(usuarioSO.getNombre());
		usuario.setContraseña(usuarioSO.getContraseña());
		usuario.setCorreo(usuarioSO.getCorreo());
		return usuario;
	}

	public UsuarioSO toSO(Usuario usuario) {
		UsuarioSO usuarioSO = new UsuarioSO();
		usuarioSO.setIdUsuario(usuario.getIdUsuario());
		usuarioSO.setNombre(usuario.getNombre());
		usuarioSO.setContraseña(usuario.getContraseña());
		usuarioSO.setCorreo(usuario.getCorreo());
		return usuarioSO;
	}

}
