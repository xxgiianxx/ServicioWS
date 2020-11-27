package net.spring.concurso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.spring.concurso.entity.Usuario;
import net.spring.concurso.service.UsuarioService;

@RestController
@RequestMapping(value = "/session")
public class LoginController {
	@Autowired
	private UsuarioService service;
    
	@GetMapping(path="/iniciar/{login}/{clave}")
	@ResponseBody
	public Usuario iniciar(@PathVariable("login")String Usuariox,
			               @PathVariable("clave")String Clave) {
		
		Usuario bean=null;
		bean=service.login(Usuariox, Clave);
		return bean;
		
	}
	
}
