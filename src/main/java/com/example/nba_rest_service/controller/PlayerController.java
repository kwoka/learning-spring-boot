package com.example.nba_rest_service.controller;

import com.example.nba_rest_service.data.Player;
import com.example.nba_rest_service.logic.PlayerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/player")
    public List<Player> getPlayers() {
        return this.playerService.getPlayers();
    }

}
