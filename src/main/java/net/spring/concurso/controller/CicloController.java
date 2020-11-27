package net.spring.concurso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.spring.concurso.entity.Ciclo;
import net.spring.concurso.entity.Computadora;
import net.spring.concurso.entity.Marca;
import net.spring.concurso.service.CicloService;

@RestController
@RequestMapping(value = "/ciclo")
public class CicloController {
	
	@Autowired
	private CicloService cicloservice;
	
    @PostMapping(path = "/saveCiclo")
	public void saveComputadora(@RequestBody Ciclo bean) {
	  cicloservice.insertaCiclo(bean);		
	}
	
	
}
