package com.twowheels.twowheels.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tb_postagens")
public class Postagem {
	 
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "o atributo titulo é obrigatório!")
	@Size(min = 5, max = 100, message = "o atributo deve conter no minino 5 e no maximo 100 caracteres")
	private String titulo;
	
	@NotBlank(message = "o atributo texto é obrigatório!") /*notblanck é obrigatorio escrever*/
	@Size(min = 10, max = 1000, message = "o atributo deve conter no minino 10 e no maximo 1000 caracteres") /*obrigatorio por o numero*/
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;
	
	/*inserir o gets e sets*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
}

