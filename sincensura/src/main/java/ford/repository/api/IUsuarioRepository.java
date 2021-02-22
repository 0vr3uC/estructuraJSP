package ford.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import ford.jpa.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>, QuerydslPredicateExecutor<Usuario>{

	Usuario findByCorreo(String string);
}
