package com.example.nba_rest_service.data;

import javax.persistence.*;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @Column(name = "player_id")
    private int playerId;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name ="team_id")
    private int teamId;

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
