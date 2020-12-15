package com.mitocode.service;

import com.mitocode.model.Usuario;

public interface ILoginService {

	Usuario verificarNombreUsuario(String usuario);
	void cambiarClave(String clave, String nombre);
}
