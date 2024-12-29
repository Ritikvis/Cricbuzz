package com.CricBuzz.cricbuss.Controller;

import com.CricBuzz.cricbuss.Service.StatusService;
import com.CricBuzz.cricbuss.dtos.request.StatusRequest;
import com.CricBuzz.cricbuss.exception.PlayerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/status")
public class StatusController {
    @Autowired
     StatusService statusService;

    @PostMapping
    public ResponseEntity addStatsForPlayer(@RequestBody StatusRequest statusRequest,
                                            @RequestParam("player-id") int playerId) {
        try{
            return new ResponseEntity(statusService.addStatsForPlayer(statusRequest,playerId), HttpStatus.CREATED);
        }
        catch (PlayerNotFoundException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
