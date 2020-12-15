package com.mitocode.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Especialidad;
import com.mitocode.repo.IGenericRepo;
import com.mitocode.repo.IEspecialidadRepo;
import com.mitocode.service.IEspecialidadService;

@Service
public class EspecialidadServiceImpl extends CRUDImpl<Especialidad, Integer> implements IEspecialidadService{

	@Autowired
	private IEspecialidadRepo repo;

	@Override
	protected IGenericRepo<Especialidad, Integer> getRepo() {	
		return repo;
	}
	
	

}
