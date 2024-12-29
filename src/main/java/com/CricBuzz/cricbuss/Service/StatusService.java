package com.CricBuzz.cricbuss.Service;

import com.CricBuzz.cricbuss.Repository.PlayerRepository;
import com.CricBuzz.cricbuss.converter.StatusConvertor;
import com.CricBuzz.cricbuss.dtos.request.StatusRequest;
import com.CricBuzz.cricbuss.exception.PlayerNotFoundException;
import com.CricBuzz.cricbuss.model.Player;
import com.CricBuzz.cricbuss.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class StatusService {
    @Autowired
    PlayerRepository playerRepository;

    public String addStatsForPlayer(StatusRequest statusRequest,
                                    int playerId) {

        Optional<Player> playerOptional = playerRepository.findById(playerId);
        if(playerOptional.isEmpty()) {
            throw new PlayerNotFoundException("Invalid player Id");
        }

        Player player = playerOptional.get();
        Status status = StatusConvertor.statsRequestToStats(statusRequest);
        status.setPlayer(player);

        player.setStatus(status);

        Player savedPlayer = playerRepository.save(player); // save both player + stats
        return "Stats added for player"+savedPlayer.getName();
    }
}
