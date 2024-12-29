package com.CricBuzz.cricbuss.converter;


import com.CricBuzz.cricbuss.dtos.request.PlayerRequest;
import com.CricBuzz.cricbuss.dtos.response.PlayerResponse;
import com.CricBuzz.cricbuss.model.Player;

public class PlayerConvertor {

    // Convert PlayerRequest to Player
    public static Player playerRequestToPlayer(PlayerRequest playerRequest) {
        Player player = new Player();
        player.setName(playerRequest.getName());
        player.setAge(playerRequest.getAge());
        player.setGender(playerRequest.getGender());
        player.setSpeciality(playerRequest.getSpeciality());
        player.setEmail(playerRequest.getEmail());
        return player;
    }

    // Convert Player to PlayerResponse
    public static PlayerResponse playerToPlayerResponse(Player player) {
        PlayerResponse playerResponse = new PlayerResponse();
        playerResponse.setName(player.getName());
        playerResponse.setSpeciality(player.getSpeciality());
        return playerResponse;
    }
}
