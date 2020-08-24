package nsc.mapper;

import nsc.jpa.Genero;
import nsc.so.GeneroSO;

public class GeneroMapper extends BaseMapper<GeneroSO, Genero> {

	public Genero fromSO(GeneroSO generoSO) {
		Genero genero = new Genero();
		genero.setIdGenero(generoSO.getIdGenero());
		genero.setGenero(generoSO.getGenero());
		return genero;
	}

	public GeneroSO toSO(Genero genero) {
		GeneroSO generoSO = new GeneroSO();
		generoSO.setIdGenero(genero.getIdGenero());
		generoSO.setGenero(genero.getGenero());
		return generoSO;
	}

}
