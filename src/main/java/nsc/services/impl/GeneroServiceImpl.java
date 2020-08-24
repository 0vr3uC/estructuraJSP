package nsc.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nsc.jpa.Genero;
import nsc.mapper.GeneroMapper;
import nsc.repository.api.IGeneroRepository;
import nsc.services.api.IGeneroService;
import nsc.so.GeneroSO;

@Service("generoService")
public class GeneroServiceImpl implements IGeneroService {

	@Autowired
	private IGeneroRepository generoRepository;

	private GeneroMapper generoMapper = new GeneroMapper();

	@Override
	public List<GeneroSO> findAll() {
		List<Genero> generos = generoRepository.findAll();

		List<GeneroSO> returned = (List<GeneroSO>) generoMapper.toSO(generos);
		return returned;
	}

	@Override
	public GeneroSO findByGenero(GeneroSO generoSO) {
		Genero genero = generoRepository.findByGenero(generoSO.getGenero());
		GeneroSO returned = generoMapper.toSO(genero);
		return returned;
	}

	@Override
	public void save(GeneroSO generoSO) {
		Genero genero = generoRepository.findByGenero(generoSO.getGenero());
		generoRepository.save(genero);
	}

}
