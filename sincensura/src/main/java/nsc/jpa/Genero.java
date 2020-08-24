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
 * Entity implementation class for Entity: Genero
 *
 */
@Entity
@Table(name = "nsc.genero")
@SequenceGenerator(name = "nsc.seq_genero", allocationSize = 1)
public class Genero implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mySeqGenerator")
	@Column(name = "idgenero", nullable = false)
	private Integer idGenero;

	@Column(name = "genero", nullable = false)
	private String genero;

	public Genero() {
		super();
	}

	public Genero(String genero) {
		this.setGenero(genero);
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(Integer idGenero) {
		this.idGenero = idGenero;
	}
}
