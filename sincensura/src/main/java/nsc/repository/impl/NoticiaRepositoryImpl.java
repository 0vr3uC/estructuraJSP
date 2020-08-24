package nsc.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.querydsl.core.types.Predicate;

import nsc.common.BaseRepository;
import nsc.jpa.Noticia;
import nsc.jpa.QNoticia;
import nsc.repository.api.INoticiaRepository;

@Repository
public abstract class NoticiaRepositoryImpl implements INoticiaRepository {
	
	BaseRepository<Noticia> repository;

	@Override
	public List<Noticia> findByTitulo(String titulo) {
		Predicate predicate = QNoticia.noticia.titulo.containsIgnoreCase(titulo);
		return (List<Noticia>) repository.findAll(predicate);
	}

}
