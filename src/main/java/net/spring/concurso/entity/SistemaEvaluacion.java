package net.spring.concurso.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
@Table(name = "sistemaevaluacion")
public class SistemaEvaluacion implements Serializable{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSistemaEvaluacion")
	private Integer idSistemaEvaluacion;
	private String nombre;
	private String formula;
	private String estado;
	/*
	//relación uno "SistemaEvaluacion" a muchos "Cursos"
    @JsonIgnore
	@OneToMany(mappedBy = "idSistemaEvaluacion")
	private List<Curso> listaCursos;

		
	public List<Curso> getListaCursos() {
		return listaCursos;
	}
	public void setListaCursos(List<Curso> listaCursos) {
		this.listaCursos = listaCursos;
	}*/
	public Integer getIdSistemaEvaluacion() {
		return idSistemaEvaluacion;
	}
	public void setIdSistemaEvaluacion(Integer idSistemaEvaluacion) {
		this.idSistemaEvaluacion = idSistemaEvaluacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula) {
		this.formula = formula;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
