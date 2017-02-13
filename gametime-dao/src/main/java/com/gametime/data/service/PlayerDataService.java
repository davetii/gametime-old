package com.gametime.data.service;

import com.gametime.common.Player;
import com.gametime.common.Team;
import com.gametime.data.PlayerDataVO;

import java.util.List;

/**
 * Created by dave on 2/12/2017.
 */
public interface PlayerDataService {
    List<PlayerDataVO> getAllPlayers();
    PlayerDataVO getPlayer(Long id);
    void savePlayer(Player p);
    List<PlayerDataVO> findByLastName(String lastName);
    List<PlayerDataVO> findByTeam(Long TeamId);
    List<PlayerDataVO> findByTeam(Team team);
    void deleteAllPlayers();
    void deletePlayer(Long id);
    void deletePlayer(Player p);
}
