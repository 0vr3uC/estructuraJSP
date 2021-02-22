package ford.services.api;

import java.util.List;

import ford.so.UsuarioSO;

public interface IUsuarioService {

	public List<UsuarioSO> findAll() ;

	public UsuarioSO findByCorreo(String string);

}
