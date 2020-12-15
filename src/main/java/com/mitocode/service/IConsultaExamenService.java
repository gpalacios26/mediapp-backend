package com.mitocode.service;

import java.util.List;

import com.mitocode.model.ConsultaExamen;

public interface IConsultaExamenService {

	List<ConsultaExamen> listarExamenesPorConsulta(Integer idconsulta);

}
