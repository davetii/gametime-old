package com.gametime.data.service;

import com.gametime.common.Player;
import com.gametime.common.Team;
import com.gametime.data.PlayerDataVO;
import com.gametime.data.dao.PlayerDAO;
import com.gametime.data.entity.PlayerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dave on 2/12/2017.
 */
@Component
public class PlayerDataServiceImpl implements PlayerDataService {

    @Autowired
    PlayerDAO dao;

    @Override
    public List<PlayerDataVO> getAllPlayers() {
        return entityListToDataList(dao.findAll());
    }

    @Override
    public PlayerDataVO getPlayer(Integer id) {
        return dao.findOne(id).toDataVO();
    }

    @Override
    public void savePlayer(Player p) {
        dao.save(new PlayerEntity(p));
    }

    @Override
    public List<PlayerDataVO> findByLastName(String lastName) {
        return entityListToDataList(dao.findByLastName(lastName));
    }

    @Override
    public void deleteAllPlayers() {
        dao.deleteAll();
    }

    @Override
    public void deletePlayer(Integer id) {
        dao.delete(id);
    }

    @Override
    public void deletePlayer(Player p) {
        dao.delete(new PlayerEntity(p));
    }

    @Override
    public List<PlayerDataVO> findByTeam(Integer teamId) {
        return entityListToDataList(dao.findByTeamId(teamId));
    }

    @Override
    public List<PlayerDataVO> findByTeam(Team team) {
        return findByTeam(team.getId());
    }

    private List<PlayerDataVO> entityListToDataList(Iterable<PlayerEntity> input) {
        List<PlayerDataVO> list = new ArrayList<>();
        for (PlayerEntity p : input) {
            list.add(p.toDataVO());
        }
        return list;
    }




}
