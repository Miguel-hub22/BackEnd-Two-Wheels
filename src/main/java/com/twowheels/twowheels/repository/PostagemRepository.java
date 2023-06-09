package com.twowheels.twowheels.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.twowheels.twowheels.model.Postagem;

@Repository
public interface PostagemRepository  extends JpaRepository<Postagem, Long> {
	
	public List <Postagem> findAllByTituloContainingIgnoreCase(String Titulo);
	

}
