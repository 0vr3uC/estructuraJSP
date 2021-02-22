package ford.repository.impl;

import org.springframework.stereotype.Repository;

import com.querydsl.core.types.Predicate;

import ford.common.BaseRepository;
import ford.jpa.QUsuario;
import ford.jpa.Usuario;
import ford.repository.api.IUsuarioRepository;

@Repository
public abstract class UsuarioRepositoryImpl implements IUsuarioRepository {
	BaseRepository<Usuario> repository;

	@Override
	public Usuario findByCorreo(String correo) {
		Predicate predicate = QUsuario.usuario.correo.eq(correo);
		return repository.findOne(predicate).get();
	}
}
