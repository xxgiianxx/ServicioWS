package net.spring.concurso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.spring.concurso.entity.Alumno;
import net.spring.concurso.entity.Asistencia;

import net.spring.concurso.entity.Curso;
import net.spring.concurso.entity.Docente;

import net.spring.concurso.service.AlumnoService;
import net.spring.concurso.service.AsistenciaService;

import net.spring.concurso.service.CursoService;
import net.spring.concurso.service.DocenteService;


@Controller
@RequestMapping(value = "/asistencia")
public class AsistenciaController {
	
	@Autowired
	private AsistenciaService asistenciaService;
	
	@Autowired
	private DocenteService docenteService;
	
	
	@Autowired
	private AlumnoService alumnoService;
	
	@Autowired
	private CursoService cursoService;
	
	
	@GetMapping(path ="/listAllAsistencia" )
	@ResponseBody
	public List<Asistencia> listAllAsistencia(){
		return asistenciaService.listaAsistencia();
	}
	
	@GetMapping(path ="/listAllDocente" )
	@ResponseBody
	public List<Docente> listAllDocente(){
		return docenteService.listaDocente();
	}
	
	@GetMapping(path ="/listaAllAlumno" )
	@ResponseBody
	public List<Alumno> listaAllAlumno(){
		return alumnoService.listaAlumno();
	}
	
	
	@GetMapping(path ="/findAsistencia" )
	@ResponseBody
	public List<Asistencia> findAsistencia(){
		return asistenciaService.listaAsistencia();
	}
	
	
	@GetMapping(path ="/listaAllCurso" )
	@ResponseBody
	public List<Curso> listaAllCurso(){
		return cursoService.listaCurso();
	}
	
	
	  @PostMapping(path = "/saveAsistencia")
		public void saveAsistencia(@RequestBody Asistencia bean) {
		  asistenciaService.insertaActualizaAsistencia(bean);		
     }
	  
		//actualizar computadora
		@PutMapping(path = "/updateAsistencia")
		public void updateAsistencia(@RequestBody Asistencia bean) {
			asistenciaService.ActualizaAsistencia(bean);		
		}	
		
		//eliminar computadora
		@DeleteMapping(path = "/deleteAsistencia/{codigo}")
		public void deleteAsistencia(@PathVariable("codigo") int cod) {
			asistenciaService.eliminaAsistencia(cod);
		}

}
