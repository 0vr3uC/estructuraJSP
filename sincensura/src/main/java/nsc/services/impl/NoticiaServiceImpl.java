package nsc.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nsc.jpa.Noticia;
import nsc.mapper.NoticiaMapper;
import nsc.repository.api.INoticiaRepository;
import nsc.services.api.INoticiaService;
import nsc.so.NoticiaSO;

@Service("noticiaService")
public class NoticiaServiceImpl implements INoticiaService {
	
	@Autowired
	private INoticiaRepository noticiaRepository;
	
	private NoticiaMapper noticiaMapper = new NoticiaMapper();
	
	@Override
	public List<NoticiaSO> findByTitulo(String titulo) {
		List<Noticia> noticias = noticiaRepository.findByTitulo(titulo);
		List<NoticiaSO> returned = (List<NoticiaSO>) noticiaMapper.toSO(noticias);
		return returned;
	}


	@Override
	public void save(NoticiaSO noticiaSO) {
		Noticia noticia = noticiaMapper.fromSO(noticiaSO);
		noticiaRepository.save(noticia);	
	}


	@Override
	public List<NoticiaSO> findAll() {
		List<Noticia> noticias = noticiaRepository.findAll();

		List<NoticiaSO> returned = (List<NoticiaSO>) noticiaMapper.toSO(noticias);
		return returned;
	}

}
