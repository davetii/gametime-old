package com.gametime.data.service;

import com.gametime.data.DataAccessApplication;
import com.gametime.data.entity.TeamEntity;
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
public class TeamDataServiceTest {

    @Autowired
    private TeamDataService service;

    @Before
    public void setup() {
        loadTeams();
    }

    @After
    public void cleanup(){
        service.deleteAllTeams();
    }

    @Test
    public void ensureSaveTeamWorks() {
        Assert.assertEquals(service.getAllTeams().size(), 16);
    }

    @Test
    public void ensureFilterByDivisionReturnsExpected() {
        List<TeamEntity> list = service.getTeamsByDivision(1);
        Assert.assertEquals(list.size(), 4);
    }

    private void loadTeams() {
        service.saveTeam(buildTeam( 1, "New York", "Fastbacks"));
        service.saveTeam(buildTeam(1, "Boston", "Steeds"));
        service.saveTeam(buildTeam(1, "Philadelphia", "Flames"));
        service.saveTeam(buildTeam(1, "Atlanta", "Ravens"));

        service.saveTeam(buildTeam( 2, "Michigan", "Panthers"));
        service.saveTeam(buildTeam(2, "Chicago", "Blackhawks"));
        service.saveTeam(buildTeam(2, "Cleveland", "Indians"));
        service.saveTeam(buildTeam(2, "Buffalo", "Sabres"));

        service.saveTeam(buildTeam( 3, "Dallas", "Bulls"));
        service.saveTeam(buildTeam(3, "Housten", "Wildcats"));
        service.saveTeam(buildTeam(3, "Saint Louis", "Devils"));
        service.saveTeam(buildTeam(3, "Tennennsse", "Running Rebels"));

        service.saveTeam(buildTeam( 4, "California", "Thunder"));
        service.saveTeam(buildTeam(4, "Los Angeles", "Kings"));
        service.saveTeam(buildTeam(4, "Phoenix", "Heat"));
        service.saveTeam(buildTeam(4, "Utah", "Aggies"));
    }

    private TeamEntity buildTeam(int div, String locale, String logo) {
        TeamEntity t = new TeamEntity();
        t.setDivisionId(div);
        t.setLocale(locale);
        t.setLogo(logo);
        return t;
    }

}
