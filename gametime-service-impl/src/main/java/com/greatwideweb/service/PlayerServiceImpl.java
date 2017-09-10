package com.greatwideweb.service;

import com.gametime.api.PlayerService;
import com.gametime.common.Player;
import com.gametime.common.Position;
import com.gametime.api.PlayerDataService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by dave on 2/12/2017.
 */
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    PlayerDataService playerDataService;

    public Player getPlayer(Integer playerId) {
        return new Player(playerDataService.getPlayer(playerId));
    }

    public List<Player> findPlayer(String searchTerm) { return null; }

    public List<Player> getPlayersByPosition(Position position) {
        return null;
    }

    public List<Player> getPlayersByTeam(Integer teamId) {
        return null;
    }
}
