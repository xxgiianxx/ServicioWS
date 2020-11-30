package net.spring.concurso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.spring.concurso.entity.Aula;
import net.spring.concurso.entity.Marca;
import net.spring.concurso.entity.Seccion;
import net.spring.concurso.service.AulaService;
import net.spring.concurso.service.SeccionService;

@RestController
@RequestMapping(value = "/aula")
public class AulaController {

	@Autowired
	private AulaService aulaService;
	
	@Autowired
	private SeccionService seccionservice;
	
	
	@PostMapping(path = "/saveAula")
	public void saveAula(@RequestBody Aula bean) {
		aulaService.insertaAula(bean);
	}
	
	//listar todas las marcas
		@GetMapping(path ="/listAllSeccion" )
		@ResponseBody
		public List<Seccion> listAllSeccion(){
			return seccionservice.listaSeccion();
		}
	
	
	
}
