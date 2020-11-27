package net.spring.concurso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.spring.concurso.dao.UsuarioDAO;
import net.spring.concurso.entity.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Override
	public Usuario login(String Usuario,String Clave) {
		return usuarioDAO.login(Usuario,Clave);
	}

	
}
