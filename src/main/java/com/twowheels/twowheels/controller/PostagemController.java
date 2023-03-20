package com.twowheels.twowheels.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twowheels.twowheels.model.Postagem;
import com.twowheels.twowheels.repository.PostagemRepository;

@RestController /* ele receber uma informação */
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*mimimi")
public class PostagemController {
	
	@Autowired
	private PostagemRepository postagemRepository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> getAll(){
		return ResponseEntity.ok(postagemRepository.findAll());
		
	}
}
