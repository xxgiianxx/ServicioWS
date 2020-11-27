package net.spring.concurso.dao;

import net.spring.concurso.entity.Usuario;

public interface UsuarioDAO {
	public abstract Usuario login(String Usuario,String Clave);

}
