package com.gametime.api;

import com.gametime.common.Team;

/**
 * Created by dave on 2/6/2017.
 */
public interface TeamService {
    Team getTeam(Long teamId);
    /*
    List<Team> getAllTeams();
    List<Team> getTeamsByConference(int conferenceId);
    List<Team> getTeamsByDivision(int divisionId);
    */
}
