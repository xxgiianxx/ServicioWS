package net.spring.concurso.service;

import net.spring.concurso.entity.Usuario;

public interface UsuarioService {
	public abstract Usuario login(String Usuario,String Clave);

}
