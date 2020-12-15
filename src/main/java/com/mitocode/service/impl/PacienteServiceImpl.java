package com.mitocode.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mitocode.model.Paciente;
import com.mitocode.repo.IGenericRepo;
import com.mitocode.repo.IPacienteRepo;
import com.mitocode.service.IPacienteService;

@Service
public class PacienteServiceImpl extends CRUDImpl<Paciente, Integer> implements IPacienteService{

	@Autowired
	private IPacienteRepo repo;

	@Override
	protected IGenericRepo<Paciente, Integer> getRepo() {
		return repo;
	}
	
	@Override
	public Page<Paciente> listarPageable(Pageable pageable) {
		return repo.findAll(pageable);
	}
	
	
}
