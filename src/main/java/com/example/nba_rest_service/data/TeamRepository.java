package com.example.nba_rest_service.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
    Iterable<Team> findTeamByLocation(String location);
}
