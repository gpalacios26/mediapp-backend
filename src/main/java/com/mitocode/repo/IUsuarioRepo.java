package com.mitocode.repo;

import com.mitocode.model.Usuario;

public interface IUsuarioRepo extends IGenericRepo<Usuario, Integer>  {

	//select * from usuario where username = ?
	Usuario findOneByUsername(String username);	
}
