package com.gametime.data.service;

import com.gametime.data.DataAccessApplication;
import com.gametime.data.common.Player;
import com.gametime.data.dto.PlayerData;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by dave on 2/12/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataAccessApplication.class)
public class PlayerDataServiceTest {

    @Autowired
    private PlayerDataService service;

    @Before
    public void setupTest() {
        loadTestPlayers();
    }

    @After
    public void cleanup() {
        service.deleteAllPlayers();
    }

    @Test
    public void ensurePlayerSavesAsExpected(){
        service.deleteAllPlayers();
        service.savePlayer(createPlayerData("Ben", "Wallace"));
        Assert.assertEquals(1, service.getAllPlayers().size());
    }

    @Test
    public void ensureGetByLastNameWorksAsExpected() {
        List<PlayerData> list = service.findByLastName("Morris");
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void ensureDeletesPlayerViaIDFunctrionsAsExpected(){
        PlayerData p = service.getAllPlayers().get(0);
        String lastName = p.getLastName();
        service.deletePlayer(p.getId());
        Assert.assertEquals(0, service.findByLastName(lastName).size());
    }

    @Test
    public void ensureDeletesPlayerFunctrionsAsExpected(){
        PlayerData p = service.getAllPlayers().get(0);
        String lastName = p.getLastName();
        service.deletePlayer(p);
        Assert.assertEquals(0, service.findByLastName(lastName).size());
    }

    @Test
    public void ensureUpdatePlayerFunctionsAsExpected(){
        PlayerData p = service.getAllPlayers().get(0);
        Assert.assertEquals(0, p.getAgility());
        p.setAgility(10);
        service.savePlayer(p);
        p = service.getPlayer(p.getId());
        Assert.assertEquals(10, p.getAgility());
    }

    private PlayerData createPlayerData(String firstName, String lastName) {
        PlayerData p = new PlayerData();
        p.setFirstName(firstName);
        p.setLastName(lastName);
        return p;
    }

    private void loadTestPlayers() {
        service.savePlayer(createPlayerData("Andre", "Drummond"));
        service.savePlayer(createPlayerData("Kentavius", "Pope"));
        service.savePlayer(createPlayerData("Marcus", "Morris"));
        service.savePlayer(createPlayerData("Jon", "Leur"));
        service.savePlayer(createPlayerData("Tobias", "Harris"));
        service.savePlayer(createPlayerData("Reggie", "Jackson"));
        service.savePlayer(createPlayerData("Stanly", "Johnson"));
        service.savePlayer(createPlayerData("Ish", "Smith"));
        service.savePlayer(createPlayerData("Aaron", "Baynes"));
    }


}

