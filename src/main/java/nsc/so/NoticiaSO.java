package nsc.so;

import java.io.Serializable;

/**
 * Entity implementation class for Entity: Noticia
 *
 */
public class NoticiaSO implements Serializable {

	private Integer idNoticia;
	private String titulo;
	private String texto;
	private GeneroSO idGenero;

	private static final long serialVersionUID = 1L;

	public NoticiaSO() {
		super();
	}

	public NoticiaSO(String titulo, String texto, GeneroSO genero) {
		this.setTitulo(titulo);
		this.setTexto(texto);
		this.setIdGenero(genero);
}

	public Integer getIdNoticia() {
		return this.idNoticia;
	}

	public void setIdNoticia(Integer idNoticia) {
		this.idNoticia = idNoticia;
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

	public GeneroSO getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(GeneroSO idGenero) {
		this.idGenero = idGenero;
	}
}
