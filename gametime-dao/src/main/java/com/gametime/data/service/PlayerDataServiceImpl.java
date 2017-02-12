package com.gametime.data.service;

import com.gametime.data.dao.PlayerDAO;
import com.gametime.data.dto.PlayerData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by dave on 2/12/2017.
 */
@Component
public class PlayerDataServiceImpl implements PlayerDataService {

    @Autowired
    PlayerDAO dao;

    @Override
    public List<PlayerData> getAllPlayers() {
        return (List<PlayerData>) dao.findAll();
    }

    @Override
    public PlayerData getPlayer(Long id) {
        return dao.findOne(id);
    }

    @Override
    public void savePlayer(PlayerData p) {
        dao.save(p);
    }

    @Override
    public List<PlayerData> findByLastName(String lastName) {
        return dao.findByLastName(lastName);
    }

    @Override
    public void deleteAllPlayers() {
        dao.deleteAll();
    }

    @Override
    public void deletePlayer(Long id) {
        dao.delete(id);
    }

    @Override
    public void deletePlayer(PlayerData p) {
        dao.delete(p);
    }
}
