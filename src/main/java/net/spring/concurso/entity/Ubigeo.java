package net.spring.concurso.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "ubigeo")
public class Ubigeo implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUbigeo")
	private Integer idUbigeo;
	private String provincia;
	private String departamento;
	private String distrito;
	public Integer getIdUbigeo() {
		return idUbigeo;
	}
	public void setIdUbigeo(Integer idUbigeo) {
		this.idUbigeo = idUbigeo;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
	
}
