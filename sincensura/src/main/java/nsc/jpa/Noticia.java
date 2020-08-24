package nsc.jpa;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Noticia
 *
 */
@Entity
@Table(name = "nsc.noticia")
@SequenceGenerator(name = "mySeqGenerator", sequenceName = "nsc.seq_noticia", allocationSize = 1)
public class Noticia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mySeqGenerator")
	@Column(name = "idnoticia", nullable = false)
	private Integer idNoticia;

	@Column(name = "titulo", nullable = false)
	private String titulo;

	@Column(name = "texto", nullable = false)
	private String texto;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idgenero", nullable = false)
	private Genero idGenero;

	@Column(name = "fechacreacion", nullable = false)
	private Date fechaCreacion;

	public Noticia() {
		super();
	}

	public Noticia(String titulo, String texto, Genero genero, Date fechaCreacion) {
		this.setTitulo(titulo);
		this.setTexto(texto);
		this.setIdGenero(genero);
		this.setFechaCreacion(fechaCreacion);
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Genero getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(Genero idGenero) {
		this.idGenero = idGenero;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getIdNoticia() {
		return idNoticia;
	}

	public void setIdNoticia(Integer idNoticia) {
		this.idNoticia = idNoticia;
	}
}
