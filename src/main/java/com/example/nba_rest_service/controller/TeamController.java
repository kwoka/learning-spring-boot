package com.example.nba_rest_service.controller;

import com.example.nba_rest_service.data.Team;
import com.example.nba_rest_service.logic.TeamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TeamController {
    private TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/teams")
    public List<Team> getAllTeams(@RequestParam(value = "location", required = false) String location){
        if(location == null) {
            return this.teamService.getTeams();
        } else {
            Team team = this.teamService.getTeamByLocation(location);
            return new ArrayList<Team>(Arrays.asList(team));
        }
    }
}
