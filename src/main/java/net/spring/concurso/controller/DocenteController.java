package net.spring.concurso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.spring.concurso.service.DocenteService;

@RestController
@RequestMapping(value = "/docente")
public class DocenteController {
	
	@Autowired
	private DocenteService docenteservicio;
	

}
