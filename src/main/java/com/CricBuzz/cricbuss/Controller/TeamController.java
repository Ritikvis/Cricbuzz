package com.CricBuzz.cricbuss.Controller;

import com.CricBuzz.cricbuss.Service.TeamService;
import com.CricBuzz.cricbuss.dtos.request.TeamRequest;
import com.CricBuzz.cricbuss.dtos.response.TeamResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/team")
public class TeamController {
    @Autowired
    TeamService teamService;

    @PostMapping
    public TeamResponse addTeam(@RequestBody TeamRequest teamRequest) {
        return teamService.addTeam(teamRequest);
    }
}