package com.next.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.next.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
