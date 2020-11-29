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

import net.spring.concurso.entity.Alumno;
import net.spring.concurso.entity.Ciclo;
import net.spring.concurso.entity.Computadora;
import net.spring.concurso.entity.Institucion;
import net.spring.concurso.entity.Marca;
import net.spring.concurso.entity.Seccion;
import net.spring.concurso.service.AlumnoService;
import net.spring.concurso.service.CicloService;
import net.spring.concurso.service.InstitucionService;
import net.spring.concurso.service.SeccionService;

@RestController
@RequestMapping(value = "/alumno")

public class AlumnoController {
	@Autowired
	private AlumnoService alumnoservice;
	
	@Autowired
	private SeccionService seccionservice;
	@Autowired
	private CicloService cicloservice;
	@Autowired
	private InstitucionService institucionservice;
	

	@GetMapping(path ="/listAllAlumno" )
	@ResponseBody
	public List<Alumno> listAllAlumno(){
		return alumnoservice.listaAlumno();
	}
	
	@GetMapping(path ="/listAllSeccion" )
	@ResponseBody
	public List<Seccion> listaAllSeccion(){
		return seccionservice.listaSeccion();
	}
	
	@GetMapping(path ="/listAllCiclo" )
	@ResponseBody
	public List<Ciclo> listaAllCiclo(){
		return cicloservice.listaCiclo();
	}
	
	@GetMapping(path ="/listAllInsitucion" )
	@ResponseBody
	public List<Institucion> listaAllInstitucion(){
		return institucionservice.listaInstitucion();
	}
	
	
	  @PostMapping(path = "/saveAlumno")
		public void saveComputadora(@RequestBody Alumno bean) {
		  alumnoservice.insertaActualizaAlumno(bean);		
     }
	  
		//actualizar computadora
		@PutMapping(path = "/updateAlumno")
		public void updateComputadora(@RequestBody Alumno bean) {
			alumnoservice.ActualizaAlumno(bean);		
		}	
		
		//eliminar computadora
		@DeleteMapping(path = "/deleteAlumno/{codigo}")
		public void deleteComputadora(@PathVariable("codigo") int cod) {
			alumnoservice.eliminaAlumno(cod);
		}
	  

}
