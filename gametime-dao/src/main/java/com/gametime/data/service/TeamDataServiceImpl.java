package com.gametime.data.service;

import com.gametime.data.dao.TeamDAO;
import com.gametime.data.entity.TeamEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by dave on 2/12/2017.
 */
@Component
public class TeamDataServiceImpl implements TeamDataService {

    @Autowired
    private TeamDAO dao;

    @Override
    public TeamEntity getTeam(Integer id) {
        return dao.findOne(id);
    }

    @Override
    public List<TeamEntity> getAllTeams() {
        return (List<TeamEntity>) dao.findAll();
    }

    @Override
    public List<TeamEntity> getTeamsByDivision(Integer id) {
        return dao.getTeamsByDivisionId(id);
    }

    @Override
    public void saveTeam(TeamEntity td) {
        dao.save(td);
    }

    @Override
    public void deleteTeam(TeamEntity td) {
        dao.delete(td);
    }

    @Override
    public void deleteTeam(Integer id) {
        dao.delete(id);
    }

    @Override
    public void deleteAllTeams() {
        dao.deleteAll();
    }
}
