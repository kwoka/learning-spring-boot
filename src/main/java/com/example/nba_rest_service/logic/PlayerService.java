package com.example.nba_rest_service.logic;

import com.example.nba_rest_service.data.Player;
import com.example.nba_rest_service.data.PlayerRepository;
import com.example.nba_rest_service.data.Team;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers() {
        Iterable<Player> players = this.playerRepository.findAll();
        List<Player> playerList = new ArrayList<>();
        for (Player player: players) {
            playerList.add(player);
        }
        return playerList;
    }
}
