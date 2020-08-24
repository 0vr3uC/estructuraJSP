package nsc.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import nsc.jpa.Genero;

public interface IGeneroRepository extends JpaRepository<Genero, Integer>, QuerydslPredicateExecutor<Genero>{	

	Genero findByGenero(String genero);
}
