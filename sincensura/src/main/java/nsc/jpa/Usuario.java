package nsc.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity
@Table(name = "nsc.usuario")
@SequenceGenerator(name = "mySeqGenerator", sequenceName = "nsc.seq_usuario", allocationSize = 1)
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mySeqGenerator")
	@Column(name = "idusuario", nullable = false)
	private Integer idUsuario;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "contraseña", nullable = false)
	private String contraseña;

	@Column(name = "correo", nullable = false)
	private String correo;

	public Usuario() {
		super();
	}

	public Usuario(String nombre, String correo, String contra) {
		this.setNombre(nombre);
		this.setCorreo(correo);
		this.setContraseña(contra);
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

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

}
