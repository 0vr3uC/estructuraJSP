package ford.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ford.jpa.Usuario;
import ford.mapper.UsuarioMapper;
import ford.repository.api.IUsuarioRepository;
import ford.services.api.IUsuarioService;
import ford.so.UsuarioSO;

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

}
