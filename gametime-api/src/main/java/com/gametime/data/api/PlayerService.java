package com.gametime.data.api;

import com.gametime.data.common.Player;
import com.gametime.data.common.Position;

import java.util.List;

/**
 * Created by dave on 2/6/2017.
 */
public interface PlayerService {
    Player getPlayer (int playerId);
    List<Player> findPlayer (String searchTerm);
    List<Player> getPlayersByPosition (Position position);
    List<Player> getPlayersByTeam (int teamId);
}
