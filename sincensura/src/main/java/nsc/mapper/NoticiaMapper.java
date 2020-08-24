package nsc.mapper;

import nsc.jpa.Noticia;
import nsc.so.NoticiaSO;

public class NoticiaMapper extends BaseMapper<NoticiaSO, Noticia> {
	GeneroMapper generoMapper = new GeneroMapper();

	public Noticia fromSO(NoticiaSO noticiaSO) {
		Noticia noticia = new Noticia();
		noticia.setIdNoticia(noticiaSO.getIdNoticia());
		noticia.setTexto(noticiaSO.getTexto());
		noticia.setTitulo(noticiaSO.getTitulo());
		noticia.setIdGenero(generoMapper.fromSO(noticiaSO.getIdGenero()));
		return noticia;
	}

	public NoticiaSO toSO(Noticia noticia) {
		NoticiaSO NoticiaSO = new NoticiaSO();
		NoticiaSO.setIdNoticia(noticia.getIdNoticia());
		NoticiaSO.setTexto(noticia.getTexto());
		NoticiaSO.setTitulo(noticia.getTitulo());
		NoticiaSO.setIdGenero(generoMapper.toSO(noticia.getIdGenero()));
		return NoticiaSO;
	}

}
