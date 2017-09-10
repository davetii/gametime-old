package com.gametime.data.service;

import com.gametime.api.TeamDataService;
import com.gametime.data.TeamDataVO;
import com.gametime.data.dao.TeamDAO;
import com.gametime.data.entity.TeamEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by dave on 2/12/2017.
 */
@Component
public class TeamDataServiceImpl implements TeamDataService {

    @Autowired
    private TeamDAO dao;

    @Override
    public TeamDataVO getTeam(Integer id) { return dao.findOne(id).toDataVO();}

    @Override
    public List<TeamDataVO> getAllTeams() { return dataList((List<TeamEntity>) dao.findAll()); }

    @Override
    public List<TeamDataVO> getTeamsByDivision(Integer id) { return dataList(dao.getTeamsByDivisionId(id)); }

    @Override
    public void saveTeam(TeamDataVO td) { dao.save(entity(td)); }

    @Override
    public void deleteTeam(TeamDataVO td) { dao.delete(entity(td)); }

    @Override
    public void deleteTeam(Integer id) {
        dao.delete(id);
    }

    @Override
    public void deleteAllTeams() {
        dao.deleteAll();
    }

    private TeamEntity entity(TeamDataVO td) {
        TeamEntity e = new TeamEntity();
        e.setId(td.getId());
        e.setLogo(td.getLogo());
        e.setDivisionId(td.getDivisionId());
        e.setLocale(td.getLocale());
        e.setLocaleShort(td.getLocaleShort());
        return e;
    }

    private List<TeamDataVO> dataList(List<TeamEntity> list) {
        return list.stream().map(teamEntity -> teamEntity.toDataVO()).collect(Collectors.toList());
    }

}
