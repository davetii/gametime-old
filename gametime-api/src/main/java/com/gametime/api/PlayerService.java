package com.gametime.api;

import com.gametime.common.Player;
import com.gametime.common.Position;

import java.util.List;

/**
 * Created by dave on 2/6/2017.
 */
public interface PlayerService {
    Player getPlayer (Integer playerId);
    List<Player> findPlayer (String searchTerm);
    List<Player> getPlayersByPosition (Position position);
    List<Player> getPlayersByTeam (Integer teamId);
}
