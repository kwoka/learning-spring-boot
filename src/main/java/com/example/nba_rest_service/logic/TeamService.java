package com.example.nba_rest_service.logic;

import com.example.nba_rest_service.data.Team;
import com.example.nba_rest_service.data.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<Team> getTeams(){
        List<Team> teamList = new ArrayList<>();
        Iterable<Team> teams = this.teamRepository.findAll();
        for(Team team : teams) {
            teamList.add(team);
        }
        return teamList;
    }

    public Team getTeamByLocation(String location){
        if(this.teamRepository.findTeamByLocation(location).isEmpty()) return null;
        return this.teamRepository.findTeamByLocation(location).get();
    }

}
