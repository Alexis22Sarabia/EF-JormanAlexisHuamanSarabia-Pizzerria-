package com.idat.EFJormanHuaman.service;

import java.util.List;


import com.idat.EFJormanHuaman.model.Pizerria;



public interface PizerriaService {

	List<Pizerria> listar();
	Pizerria obtenerId(Integer id);
	void guardar(Pizerria pizeria);
	void eliminar(Integer id);
	void actualizar(Pizerria pizeria);

}
