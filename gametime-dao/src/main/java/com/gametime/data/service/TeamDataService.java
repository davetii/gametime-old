package com.gametime.data.service;

import com.gametime.data.entity.TeamEntity;

import java.util.List;

/**
 * Created by dave on 2/12/2017.
 */
public interface TeamDataService {
    TeamEntity getTeam(Long id);
    List<TeamEntity> getAllTeams();
    List<TeamEntity> getTeamsByDivision(Integer id);
    void saveTeam(TeamEntity td);
    void deleteTeam(TeamEntity td);
    void deleteTeam(Long id);
    void deleteAllTeams();



}
