package com.CricBuzz.cricbuss.converter;

import com.CricBuzz.cricbuss.dtos.request.CricketMatchRequest;
import com.CricBuzz.cricbuss.dtos.response.CricketMatchResponse;
import com.CricBuzz.cricbuss.dtos.response.TeamResponse;
import com.CricBuzz.cricbuss.model.CricketMatch;

import java.util.ArrayList;
import java.util.List;

public class MatchConvertor {

    // Method to convert CricketMatchRequest to CricketMatch
    public static CricketMatch cricketMatchRequestToCricketMatch(CricketMatchRequest matchRequest) {
        CricketMatch match = new CricketMatch();
        match.setTitle(matchRequest.getTitle());
        match.setMatchType(matchRequest.getMatchType());
        match.setOvers(matchRequest.getOvers());
        match.setPlace(matchRequest.getPlace());
        return match;
    }

    // Method to convert CricketMatch to CricketMatchResponse
    public static CricketMatchResponse cricketMatchToCricketMatchResponse(CricketMatch match) {
        CricketMatchResponse matchResponse = new CricketMatchResponse();

        List<TeamResponse> teamResponseList = new ArrayList<>();
        TeamResponse teamResponseA = TeamConvertor.teamToTeamResponse(match.getTeams().get(0));
        TeamResponse teamResponseB = TeamConvertor.teamToTeamResponse(match.getTeams().get(1));
        teamResponseList.add(teamResponseA);
        teamResponseList.add(teamResponseB);

        matchResponse.setTitle(match.getTitle());
        matchResponse.setMatchType(match.getMatchType());
        matchResponse.setOvers(match.getOvers());
        matchResponse.setPlace(match.getPlace());
        matchResponse.setStartedAt(match.getStartedAt());
        matchResponse.setTeams(teamResponseList);

        return matchResponse;
    }
}
