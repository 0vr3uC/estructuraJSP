package nsc.repository.impl;

import org.springframework.stereotype.Repository;

import com.querydsl.core.types.Predicate;

import nsc.common.BaseRepository;
import nsc.jpa.Genero;
import nsc.jpa.QGenero;
import nsc.repository.api.IGeneroRepository;

@Repository
public abstract class GeneroRepositoryImpl implements IGeneroRepository {
	BaseRepository<Genero> repository;
	
	@Override
	public Genero findByGenero(String genero) {
		Predicate predicate = QGenero.genero1.genero.eq(genero);
		return repository.findOne(predicate).get();
	}
}
