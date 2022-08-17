package com.idat.EFJormanHuaman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFJormanHuaman.model.Pizerria;
import com.idat.EFJormanHuaman.repository.PizerriaRepository;

@Service

public class PizerriaServiceImpl  implements PizerriaService {

	@Autowired
	private PizerriaRepository repository;
	
	@Override
	public List<Pizerria> listar() {
		
		return repository.findAll();
	}

	@Override
	public Pizerria obtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Pizerria pizeria) {
		// TODO Auto-generated method stub
		repository.save(null);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteAllById(null);
	}

	@Override
	public void actualizar(Pizerria pizeria) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(null);
	}

}
