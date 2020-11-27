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

import net.spring.concurso.entity.Computadora;
import net.spring.concurso.entity.Curso;
import net.spring.concurso.entity.Marca;
import net.spring.concurso.entity.SistemaEvaluacion;
import net.spring.concurso.service.CursoService;
import net.spring.concurso.service.SistemaEvaluacionService;

@RestController
@RequestMapping(value = "/curso")
public class CursoController {
	
	@Autowired
	private CursoService cursoService;
	
	@Autowired
	private SistemaEvaluacionService sistemaEvaluacionService;

	
	//listar todas los cursos
	@GetMapping(path ="/listAllCurso" )
	@ResponseBody
	public List<Curso> listAllCurso(){
		return cursoService.listarTodos();
	}
	
	//listar todas los Sistema Evaluacion
	@GetMapping(path ="/listAllSistemaEvaluacion" )
	@ResponseBody
	public List<SistemaEvaluacion> listAllSistemaEvaluacion(){
		return sistemaEvaluacionService.listaSistemaEvaluacion();
	}
	
	@PostMapping(path = "/saveCurso")
	public void saveComputadora(@RequestBody Curso bean) {
		cursoService.insertaActualizaCurso(bean);		
	}
	
	
	
	
	
	
/*		//buscar computadora por nombre
	@GetMapping(path ="/findCurso/{nombre}" )
	@ResponseBody
	public List<Curso>  findComputadora(@PathVariable("nombre") String nombre) {
     return  cursoService.listarPorNombre(nombre);
//		return computadoraService.findId(cod);
	}
	//listar todas las computadoras
	@GetMapping(path ="/listAllComputadora" )
	@ResponseBody
	public List<Computadora> listAllComputadora(){
		return computadoraService.listAll();
	}
	//buscar computadora por ID
	@GetMapping(path ="/findComputadora/{codigo}" )
	@ResponseBody
	public Computadora findComputadora(@PathVariable("codigo") int cod) {
		return computadoraService.findId(cod);
	}
	//registrar computadora
	@PostMapping(path = "/saveComputadora")
	public void saveComputadora(@RequestBody Computadora bean) {
		computadoraService.save(bean);		
	}
	//actualizar computadora
	@PutMapping(path = "/updateComputadora")
	public void updateComputadora(@RequestBody Computadora bean) {
		computadoraService.update(bean);		
	}	
	//eliminar computadora
	@DeleteMapping(path = "/deleteComputadora/{codigo}")
	public void deleteComputadora(@PathVariable("codigo") int cod) {
		computadoraService.delete(cod);
	}
	*/
	
	
}
