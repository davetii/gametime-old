package com.greatwideweb.service;

import com.gametime.api.PlayerService;
import com.gametime.common.Player;
import com.gametime.common.Position;
import com.gametime.data.PlayerDataVO;
import com.gametime.data.service.PlayerDataService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by dave on 2/12/2017.
 */
public class PlayerServiceImpl implements PlayerService {

    PlayerDataService playerDataService;


    public Player getPlayer(Long playerId) {
        PlayerDataVO data = playerDataService.getPlayer(playerId);
        //Player player = new Player(data);
        return null;
    }

    private Player parsePlayerData(PlayerDataVO data) {
        Player player = new Player();
        player.setId(data.getId());
        return null;
        /*
        player.setPerson(
                new Person(data.getFirstName(), data.getLastName(), data.getHeight(), data.getWeight()));
                */
    }

    public List<Player> findPlayer(String searchTerm) {
        return null;
    }

    public List<Player> getPlayersByPosition(Position position) {
        return null;
    }

    public List<Player> getPlayersByTeam(Long teamId) {
        return null;
    }
}
