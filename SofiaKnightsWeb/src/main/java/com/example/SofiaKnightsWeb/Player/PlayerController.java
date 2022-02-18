package com.example.SofiaKnightsWeb.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@Controller
//@RequestMapping(path = "players")
public class PlayerController {

    private final PlayerService playerService;
    private PlayerRepository playerRepository;


    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @RequestMapping("/players")
    public String players(Model model) {
        List<Player> players = playerService.getPlayers();
        model.addAttribute("player", players);

        return "players_page";
    }

//    @GetMapping                                               // извежда JSON
//    public List<Player> getPlayers() {
//        return playerService.getPlayers();
//    }

}
