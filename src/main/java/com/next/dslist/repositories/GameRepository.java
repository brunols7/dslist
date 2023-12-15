package com.next.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.next.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
