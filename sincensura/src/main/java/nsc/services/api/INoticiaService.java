package nsc.services.api;

import java.util.List;

import nsc.so.NoticiaSO;

public interface INoticiaService {

	public List<NoticiaSO> findByTitulo(String string);

	public void save(NoticiaSO noticiaSO);

	public List<NoticiaSO> findAll();

}
