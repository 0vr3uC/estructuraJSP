package nsc.services.api;

import java.util.List;

import nsc.so.GeneroSO;

public interface IGeneroService {

	public List<GeneroSO> findAll() ;

	public GeneroSO findByGenero(GeneroSO generoSO);

	public void save(GeneroSO generoSO);

}
