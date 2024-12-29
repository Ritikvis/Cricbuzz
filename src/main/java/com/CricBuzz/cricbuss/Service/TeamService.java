package com.CricBuzz.cricbuss.Service;

import com.CricBuzz.cricbuss.Repository.TeamRepository;
import com.CricBuzz.cricbuss.converter.TeamConvertor;
import com.CricBuzz.cricbuss.dtos.request.TeamRequest;
import com.CricBuzz.cricbuss.dtos.response.TeamResponse;
import com.CricBuzz.cricbuss.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    @Autowired
    TeamRepository teamRepository;

    public TeamResponse addTeam(TeamRequest teamRequest) {
        Team team = TeamConvertor.teamRequestToTeam(teamRequest);
        Team savedTeam = teamRepository.save(team);
        return TeamConvertor.teamToTeamResponse(savedTeam);
    }
}