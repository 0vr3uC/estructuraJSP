package nsc.repository.impl;

import org.springframework.stereotype.Repository;

import com.querydsl.core.types.Predicate;

import nsc.common.BaseRepository;
import nsc.jpa.QUsuario;
import nsc.jpa.Usuario;
import nsc.repository.api.IUsuarioRepository;

@Repository
public abstract class UsuarioRepositoryImpl implements IUsuarioRepository {
	BaseRepository<Usuario> repository;
	@Override
	public Usuario findByCorreoAndContraseña(String correo, String contraseña) {
		Predicate predicate = QUsuario.usuario.correo.eq(correo).and(QUsuario.usuario.contraseña.eq(contraseña));
		return repository.findOne(predicate).get();
	}

	@Override
	public Usuario findByCorreo(String correo) {
		Predicate predicate = QUsuario.usuario.correo.eq(correo);
		return repository.findOne(predicate).get();
	}
}
