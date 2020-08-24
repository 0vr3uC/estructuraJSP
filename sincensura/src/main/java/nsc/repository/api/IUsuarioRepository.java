package nsc.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import nsc.jpa.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>, QuerydslPredicateExecutor<Usuario>{

	Usuario findByCorreoAndContraseña(String correo, String contraseña);

	Usuario findByCorreo(String string);
}
