package com.mitocode;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.mitocode.model.Usuario;
import com.mitocode.repo.IUsuarioRepo;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class MediappBackendApplicationTests {

	@Autowired
	private IUsuarioRepo repo;

	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@Test
	void verificarClave() {
		Usuario us = new Usuario();
		us.setIdUsuario(2);
		us.setUsername("mitocode21@gmail.com");
		us.setPassword(bcrypt.encode("123"));				
		us.setEnabled(true);
		
		Usuario retorno = repo.save(us);
		
		assertTrue(retorno.getPassword().equalsIgnoreCase(us.getPassword()));
	}

}
