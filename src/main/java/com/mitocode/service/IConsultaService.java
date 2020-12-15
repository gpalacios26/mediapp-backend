package com.mitocode.service;

import java.time.LocalDateTime;
import java.util.List;

import com.mitocode.dto.ConsultaListaExamenDTO;
import com.mitocode.dto.ConsultaResumenDTO;
import com.mitocode.dto.FiltroConsultaDTO;
import com.mitocode.model.Consulta;

public interface IConsultaService extends ICRUD<Consulta, Integer>{
	
	Consulta registrarTransaccional(ConsultaListaExamenDTO dto) throws Exception;

	List<Consulta> buscar(FiltroConsultaDTO filtro);

	List<Consulta> buscarFecha(LocalDateTime fecha);
	
	List<ConsultaResumenDTO> listarResumen();

	byte[] generarReporte();
}
