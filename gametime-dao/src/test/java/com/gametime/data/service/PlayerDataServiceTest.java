package com.gametime.data.service;

import com.gametime.common.Person;
import com.gametime.common.Player;
import com.gametime.data.DataAccessApplication;
import com.gametime.data.PlayerDataVO;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.GregorianCalendar;
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
        service.savePlayer(createPlayerData(1l, "Ben", "Wallace"));
        Assert.assertEquals(1, service.getAllPlayers().size());
    }

    @Test
    public void ensureGetByLastNameWorksAsExpected() {
        List<PlayerDataVO> list = service.findByLastName("Morris");
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void ensureDeletesPlayerViaIDFunctionsAsExpected(){
        PlayerDataVO p = service.getAllPlayers().get(0);
        String lastName = p.getLastName();
        service.deletePlayer(p.getId());
        Assert.assertEquals(0, service.findByLastName(lastName).size());
    }

    @Test
    public void ensureDeletesPlayerFunctionsAsExpected(){
        PlayerDataVO p = service.getAllPlayers().get(0);
        String lastName = p.getLastName();
        service.deletePlayer(new Player(p));
        Assert.assertEquals(0, service.findByLastName(lastName).size());
    }

    @Test
    public void ensureUpdatePlayerFunctionsAsExpected(){
        PlayerDataVO p = service.getAllPlayers().get(0);
        Assert.assertEquals(0, p.getAgility());
        p.setAgility(10);
        service.savePlayer(new Player(p));
        p = service.getPlayer(p.getId());
        Assert.assertEquals(10, p.getAgility());
    }

    public void findByTeamIdFunctionsAsExpected() {
        Assert.assertEquals(0, service.findByTeam(9l));
        Assert.assertEquals(3, service.findByTeam(1l));
        Assert.assertEquals(1, service.findByTeam(2l));
        Assert.assertEquals(2, service.findByTeam(4l));
    }

    private Player createPlayerData(Long teamId, String firstName, String lastName) {
        Player p = new Player();
        p.setTeamId(teamId);
        Person person = new Person(firstName, lastName, null, null, new GregorianCalendar());
        p.setPerson(person);
        return p;
    }

    private void loadTestPlayers() {
        service.savePlayer(createPlayerData(1l, "Andre", "Drummond"));
        service.savePlayer(createPlayerData(1l, "Kentavius", "Pope"));
        service.savePlayer(createPlayerData(1l, "Marcus", "Morris"));
        service.savePlayer(createPlayerData(2l, "Jon", "Leur"));
        service.savePlayer(createPlayerData(3l, "Tobias", "Harris"));
        service.savePlayer(createPlayerData(4l, "Reggie", "Jackson"));
        service.savePlayer(createPlayerData(4l, "Stanly", "Johnson"));
        service.savePlayer(createPlayerData(5l, "Ish", "Smith"));
        service.savePlayer(createPlayerData(6l, "Aaron", "Baynes"));
    }


}

