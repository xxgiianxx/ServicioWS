package net.spring.concurso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import net.spring.concurso.entity.Ciclo;
import net.spring.concurso.entity.Curso;
import net.spring.concurso.entity.Docente;
import net.spring.concurso.entity.Institucion;

import net.spring.concurso.service.CicloService;
import net.spring.concurso.service.CursoService;
import net.spring.concurso.service.DocenteService;
import net.spring.concurso.service.InstitucionService;


@RestController
@RequestMapping(value = "/docente")
public class DocenteController {
	
	
	@Autowired
	private DocenteService docenteservice;
	
	@Autowired
	private CursoService cursoservice;
	
	@Autowired
	private CicloService cicloservice;
	
	@Autowired
	private InstitucionService institucionservice;
	
	
	@GetMapping(path ="/listAllDocente" )
	@ResponseBody
	public List<Docente> listAllAlumno(){
		return docenteservice.listaDocente();
	}
	
	@GetMapping(path ="/listAllCurso_docente" )
	@ResponseBody
	public List<Curso> listaAllCurso(){
		return cursoservice.listaCurso();
	}
	
	@GetMapping(path ="/listAllCiclo_docente" )
	@ResponseBody
	public List<Ciclo> listaAllCiclo(){
		return cicloservice.listaCiclo();
	}
	
	@GetMapping(path ="/listAllInsitucion_docente" )
	@ResponseBody
	public List<Institucion> listaAllInstitucion(){
		return institucionservice.listaInstitucion();
	}
	
	
	  @PostMapping(path = "/saveDocente")
		public void saveDocente(@RequestBody Docente bean) {
		  docenteservice.insertaActualizaDocente(bean);		
   }
	  
		
		@PutMapping(path = "/updateDocente")
		public void updateDocente(@RequestBody Docente bean) {
			docenteservice.ActualizaDocente(bean);		
		}	
		
		
		@DeleteMapping(path = "/deleteDocente/{codigo}")
		public void deleteDocente(@PathVariable("codigo") int cod) {
			docenteservice.eliminaDocente(cod);
		}
	

}
