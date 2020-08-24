package nsc.so;

/**
 * Entity implementation class for Entity: Genero
 *
 */
public class GeneroSO {
	private Integer idGenero;
	private String genero;

	public GeneroSO() {
		super();
	}

	public GeneroSO(String genero) {
		this.setGenero(genero);
	}

	public Integer getIdGenero() {
		return this.idGenero;
	}

	public void setIdGenero(Integer idGenero) {
		this.idGenero = idGenero;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}
