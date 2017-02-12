package com.gametime.data.service;

import com.gametime.data.dto.PlayerData;

import java.util.List;

/**
 * Created by dave on 2/12/2017.
 */
public interface PlayerDataService {
    List<PlayerData> getAllPlayers();
    PlayerData getPlayer(Long id);
    void savePlayer(PlayerData p);
    List<PlayerData> findByLastName(String lastName);
    void deleteAllPlayers();
    void deletePlayer(Long id);
    void deletePlayer(PlayerData p);
}
