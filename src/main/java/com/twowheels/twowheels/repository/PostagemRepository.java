package com.twowheels.twowheels.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twowheels.twowheels.model.Postagem;

@Repository
public interface PostagemRepository  extends JpaRepository<Postagem, Long> {
	

}
