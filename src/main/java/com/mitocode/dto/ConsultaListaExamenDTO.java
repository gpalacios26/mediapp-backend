package com.mitocode.dto;

import java.util.List;

import com.mitocode.model.Consulta;
import com.mitocode.model.Examen;

public class ConsultaListaExamenDTO {

	private Consulta consulta;
	private List<Examen> lstExamen;
	
	public Consulta getConsulta() {
		return consulta;
	}
	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
	public List<Examen> getLstExamen() {
		return lstExamen;
	}
	public void setLstExamen(List<Examen> lstExamen) {
		this.lstExamen = lstExamen;
	}
	
	
}
