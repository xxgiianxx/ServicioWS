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
import net.spring.concurso.entity.Marca;
import net.spring.concurso.service.ComputadoraService;
import net.spring.concurso.service.MarcaService;

@RestController
@RequestMapping(value = "/computadora")
public class ComputadoraController {
	@Autowired
	private ComputadoraService computadoraService;
	
	@Autowired
	private MarcaService marcaService;

	//listar todas las marcas
	@GetMapping(path ="/listAllMarca" )
	@ResponseBody
	public List<Marca> listAllMarca(){
		return marcaService.listAll();
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
	
}
