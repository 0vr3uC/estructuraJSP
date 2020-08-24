package nsc.services.api;

import java.util.List;

import nsc.so.UsuarioSO;

public interface IUsuarioService {

	public List<UsuarioSO> findAll() ;

	public UsuarioSO findByCorreo(String string);

	public UsuarioSO save(String nombre, String correo, String contra);

}
