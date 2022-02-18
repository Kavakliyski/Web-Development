package com.example.SofiaKnightsWeb.Player;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
//    @Query(value = "SELECT * FROM sofiaknights")
//    Page<Player> findAll(Pageable pageable);
//    Player findByName(String name);

//    @Override
    @Query("select p from Player p where p.id = ?1")
    Optional<Player> findById(Long aLong);
}