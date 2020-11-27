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
import net.spring.concurso.entity.Curso;
import net.spring.concurso.entity.Docente;
import net.spring.concurso.entity.Seccion;
import net.spring.concurso.service.CicloService;
import net.spring.concurso.service.CursoService;
import net.spring.concurso.service.DocenteService;
import net.spring.concurso.service.SeccionService;

@RestController
@RequestMapping(value = "/seccion")
public class SeccionController {
	
  @Autowired
  private SeccionService seccionservice;
  @Autowired
  private CursoService cursoservice;
  @Autowired
  private DocenteService docenterservice;
  @Autowired
  private CicloService cicloservice;
  
  
	@GetMapping(path ="/cargaCiclo_s" )
	@ResponseBody
	public List<Ciclo> listAllCiclo(){
		return cicloservice.listaCiclo();
	}
	
	@GetMapping(path ="/cargaCurso_s" )
	@ResponseBody
	public List<Curso> listAllCurso(){
		return cursoservice.listarTodos();
	}
	
	@GetMapping(path ="/cargaDocente_s" )
	@ResponseBody
	public List<Docente> listAllDocente(){
		return docenterservice.listaDocente();
	}
	
	
	//registrar computadora
	@PostMapping(path = "/insertaSeccion")
	public void saveComputadora(@RequestBody Seccion bean) {
		seccionservice.insertaSeccion(bean);		
	}
	
	
	
}
