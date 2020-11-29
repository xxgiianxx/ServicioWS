package net.spring.concurso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.spring.concurso.entity.Ciclo;
import net.spring.concurso.entity.Institucion;
import net.spring.concurso.service.InstitucionService;


@RestController
@RequestMapping(value = "/institucion")
public class InstitucionController {
	

	@Autowired
	private InstitucionService institucionservice;
	
	   @PostMapping(path = "/saveInsitucion")
		public void saveComputadora(@RequestBody Institucion bean) {
		   institucionservice.insertaInstitucion(bean);		
    }
	   
	
}
