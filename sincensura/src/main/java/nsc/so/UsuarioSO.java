package nsc.so;

/**
 * Entity implementation class for Entity: UsuarioSO
 *
 */
public class UsuarioSO {

	private Integer idUsuarioSO;
	private String nombre;
	private String contraseña;
	private String correo;

	public UsuarioSO() {
		super();
	}

	public Integer getIdUsuario() {
		return this.idUsuarioSO;
	}

	public void setIdUsuario(Integer idUsuarioSO) {
		this.idUsuarioSO = idUsuarioSO;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return this.contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
