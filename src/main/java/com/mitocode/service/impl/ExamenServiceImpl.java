package com.mitocode.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Examen;
import com.mitocode.repo.IGenericRepo;
import com.mitocode.repo.IExamenRepo;
import com.mitocode.service.IExamenService;

@Service
public class ExamenServiceImpl extends CRUDImpl<Examen, Integer> implements IExamenService{

	@Autowired
	private IExamenRepo repo;

	@Override
	protected IGenericRepo<Examen, Integer> getRepo() {	
		return repo;
	}
	
	

}
