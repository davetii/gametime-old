package com.gametime.api;

import com.gametime.data.TeamDataVO;
import java.util.List;

/**
 * Created by dave on 2/12/2017.
 */
public interface TeamDataService {
    TeamDataVO getTeam(Integer id);
    List<TeamDataVO> getAllTeams();
    List<TeamDataVO> getTeamsByDivision(Integer id);
    void saveTeam(TeamDataVO td);
    void deleteTeam(TeamDataVO td);
    void deleteTeam(Integer id);
    void deleteAllTeams();



}
