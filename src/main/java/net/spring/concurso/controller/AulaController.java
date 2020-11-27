package net.spring.concurso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.spring.concurso.entity.Aula;
import net.spring.concurso.service.AulaService;

@RestController
@RequestMapping(value = "/aula")
public class AulaController {

	@Autowired
	private AulaService aulaService;
	
	@PostMapping(path = "/saveAula")
	public void saveAula(@RequestBody Aula bean) {
		aulaService.insertaAula(bean);
	}
}
