package com.mitocode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.ConsultaExamen;
import com.mitocode.repo.IConsultaExamenRepo;
import com.mitocode.service.IConsultaExamenService;

@Service
public class ConsultaExamenServiceImpl implements IConsultaExamenService{

	@Autowired
	private IConsultaExamenRepo repo;
	
	@Override
	public List<ConsultaExamen> listarExamenesPorConsulta(Integer idconsulta) {
		return repo.listarExamenesPorConsulta(idconsulta);
	}
}
