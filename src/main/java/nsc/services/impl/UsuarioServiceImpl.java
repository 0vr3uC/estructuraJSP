package nsc.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nsc.common.Encriptar;
import nsc.jpa.Usuario;
import nsc.mapper.UsuarioMapper;
import nsc.repository.api.IUsuarioRepository;
import nsc.services.api.IUsuarioService;
import nsc.so.UsuarioSO;

@Service("usuarioService")
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioRepository usuarioRepository;

	private UsuarioMapper usuarioMapper = new UsuarioMapper();

	@Override
	public List<UsuarioSO> findAll() {
		List<Usuario> usuarios = usuarioRepository.findAll();

		List<UsuarioSO> returned = (List<UsuarioSO>) usuarioMapper.toSO(usuarios);
		return returned;
	}

	@Override
	public UsuarioSO findByCorreo(String correo) {
		Usuario usuario = usuarioRepository.findByCorreo(correo);
		if (usuario != null) {
			UsuarioSO returned = usuarioMapper.toSO(usuario);
			return returned;
		}
		return null;
	}

	@Override
	public UsuarioSO save(String nombre, String correo, String contra) {
		Usuario usuario = new Usuario(nombre, correo, Encriptar.encript(contra));
		usuarioRepository.save(usuario);
		return null;
	}

}
