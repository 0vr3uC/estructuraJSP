package nsc.repository.api;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import nsc.jpa.Noticia;

public interface INoticiaRepository extends JpaRepository<Noticia, Integer>, QuerydslPredicateExecutor<Noticia>{

	List<Noticia> findByTitulo(String titulo);

//	List<Noticia> getFirst30();
}
