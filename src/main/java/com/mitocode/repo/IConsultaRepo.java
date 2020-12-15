package com.mitocode.repo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mitocode.model.Consulta;

//@Repository
public interface IConsultaRepo extends IGenericRepo<Consulta, Integer>{

	//@Query(JPQL)
	//SQL | SELECT p.* FROM Consulta C INNER JOIN Paciente p ON c.id_paciente = p.id_paciente WHERE p.dni = ?
	@Query("FROM Consulta c WHERE c.paciente.dni = :dni OR LOWER(c.paciente.nombres) LIKE %:nombreCompleto% OR LOWER(c.paciente.apellidos) LIKE %:nombreCompleto%")
	List<Consulta> buscar(@Param("dni") String dni, @Param("nombreCompleto") String nombreCompleto);
	
	// X>= BETEWEEN Y< | 14-11-2020 - 15-11-2020 | ISODate yyyy-mm-ddTHH:mm:ss.mm
	@Query("FROM Consulta c WHERE c.fecha BETWEEN :fechaConsulta AND :fechaSgte")
	List<Consulta> buscarFecha(@Param("fechaConsulta") LocalDateTime fechaConsulta, @Param("fechaSgte") LocalDateTime fechaSgte);
	
	@Query(value = "select * from fn_listarResumen()", nativeQuery = true)
	List<Object[]> listarResumen();
	
	//cantidad		fecha
	//[1,	"07/11/2020"]
	//[2,	"14/11/2020"]
	//[3,	"24/10/2020"]
	
}