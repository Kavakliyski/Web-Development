package com.example.SofiaKnightsWeb.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers(){
        return playerRepository.findAll();
    }


//    public void addNewPlayer(Player player) {
//        Optional<Player> playerById = playerRepository.findById(player.getId());
//        if (playerById.isPresent()){
//            try {
//                throw new IllegalAccessException("id taken");
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        } else {
//            playerRepository.save(player);
//        }
//        System.out.println(player);
//    }
}
