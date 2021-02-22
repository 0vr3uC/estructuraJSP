package ford.mapper;

import ford.jpa.Usuario;
import ford.so.UsuarioSO;

public class UsuarioMapper extends BaseMapper<UsuarioSO, Usuario> {

	public Usuario fromSO(UsuarioSO usuarioSO) {
		Usuario usuario = new Usuario();
		usuario.setNombre(usuarioSO.getNombre());
		usuario.setCorreo(usuarioSO.getCorreo());
		return usuario;
	}

	public UsuarioSO toSO(Usuario usuario) {
		UsuarioSO usuarioSO = new UsuarioSO();
		usuarioSO.setNombre(usuario.getNombre());
		usuarioSO.setCorreo(usuario.getCorreo());
		return usuarioSO;
	}

}
