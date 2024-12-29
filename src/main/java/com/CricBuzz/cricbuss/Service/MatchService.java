package com.CricBuzz.cricbuss.Service;

import com.CricBuzz.cricbuss.Repository.TeamRepository;
import com.CricBuzz.cricbuss.converter.MatchConvertor;
import com.CricBuzz.cricbuss.dtos.request.CricketMatchRequest;
import com.CricBuzz.cricbuss.dtos.response.CricketMatchResponse;
import com.CricBuzz.cricbuss.exception.CricketMatchRepo;
import com.CricBuzz.cricbuss.exception.TeamNotFoundException;
import com.CricBuzz.cricbuss.model.CricketMatch;
import com.CricBuzz.cricbuss.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatchService {
    @Autowired
    TeamRepository teamRepository;

    @Autowired
    CricketMatchRepo cricketMatchRepo;

    public CricketMatchResponse registerMatch(CricketMatchRequest cricketMatchRequest,
                                              int teamAId,
                                              int teamBId) {

        Optional<Team> optionalTeamA = teamRepository.findById(teamAId);
        Optional<Team> optionalTeamB = teamRepository.findById(teamBId);

        if(optionalTeamA.isEmpty() || optionalTeamB.isEmpty()) {
            throw new TeamNotFoundException("Invalid team details");
        }

        Team teamA = optionalTeamA.get();
        Team teamB = optionalTeamB.get();

        CricketMatch match = MatchConvertor.cricketMatchRequestToCricketMatch(cricketMatchRequest);

        List<Team> teams = List.of(teamA,teamB);
        match.setTeams(teams);

        teamA.getMatches().add(match);
        teamB.getMatches().add(match);

        CricketMatch savedMatch = cricketMatchRepo.save(match);
        teamRepository.save(teamA);
        teamRepository.save(teamB);

        return MatchConvertor.cricketMatchToCricketMatchResponse(savedMatch);
    }
}