package com.gametime.data.service;

import com.gametime.api.TeamDataService;
import com.gametime.data.DataAccessApplication;
import com.gametime.data.TeamDataVO;
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
    public void ensureTeamsLoadAsExpected() { assertGetAllTeamsSize(16); }

    @Test
    public void ensureFilterByDivisionReturnsExpected() {
        List<TeamDataVO> list = service.getTeamsByDivision(1);
        Assert.assertEquals(list.size(), 4);
        Assert.assertTrue(assertTeamIdExistsInList(list, 1));
        Assert.assertTrue(assertTeamIdExistsInList(list, 2));
        Assert.assertTrue(assertTeamIdExistsInList(list, 3));
        Assert.assertTrue(assertTeamIdExistsInList(list, 4));
    }

    @Test
    public void ensuredeleteAllTeamsReturnsExpected() {
        service.deleteAllTeams();
        assertGetAllTeamsSize(0);
    }

    @Test
    public void ensureDeleteTeamReturnsExpected() {
        List<TeamDataVO> list = service.getAllTeams();
        Assert.assertEquals(list.size(), 16);
        service.deleteTeam(list.get(0).getId());
        service.deleteTeam(list.get(1));
        assertGetAllTeamsSize(14);
    }

    @Test
    public void ensureGetTeamByIdFunctionsAsExpected() {
        TeamDataVO t = service.getTeam(7);
        Assert.assertEquals(t.getId(), Integer.valueOf(7));
        Assert.assertEquals(t.getLocale(), "Cleveland");
        Assert.assertEquals(t.getDivisionId(), Integer.valueOf(2));
        Assert.assertEquals(t.getLogo(), "Indians");
    }

    @Test
    public void ensureUpdateTeamFunctionsAsExpected() {
        TeamDataVO t = service.getTeam(7);
        Assert.assertEquals(t.getLogo(), "Indians");
        t.setLogo("Browns");
        service.saveTeam(t);
        TeamDataVO t2 = service.getTeam(7);
        Assert.assertEquals(t2.getLogo(), "Browns");
    }

    private void assertGetAllTeamsSize(int i) {
        Assert.assertEquals(service.getAllTeams().size(), i);
    }


    private void loadTeams() {
        service.saveTeam(buildTeam( 1, 1, "NY", "New York", "Fastbacks"));
        service.saveTeam(buildTeam(2, 1, "","Boston", "Steeds"));
        service.saveTeam(buildTeam(3, 1, "","Philadelphia", "Flames"));
        service.saveTeam(buildTeam(4, 1, "ATL","Atlanta", "Ravens"));

        service.saveTeam(buildTeam(5,  2, "MI","Michigan", "Panthers"));
        service.saveTeam(buildTeam(6, 2, "","Chicago", "Blackhawks"));
        service.saveTeam(buildTeam(7, 2, "","Cleveland", "Indians"));
        service.saveTeam(buildTeam(8, 2, "","Buffalo", "Sabres"));

        service.saveTeam(buildTeam(9, 3,"", "Dallas", "Bulls"));
        service.saveTeam(buildTeam(10, 3, "","Housten", "Wildcats"));
        service.saveTeam(buildTeam(11, 3, "STL", "Saint Louis", "Devils"));
        service.saveTeam(buildTeam(12, 3, "Tenn", "Tennennsse", "Running Rebels"));

        service.saveTeam(buildTeam(13, 4, "CA", "California", "Thunder"));
        service.saveTeam(buildTeam(14, 4, "LA","Los Angeles", "Kings"));
        service.saveTeam(buildTeam(15, 4, "","Phoenix", "Heat"));
        service.saveTeam(buildTeam(16, 4, "UT","Utah", "Aggies"));
    }

    private TeamDataVO buildTeam(int id, int div, String localeShort, String locale, String logo) {
        TeamDataVO t = new TeamDataVO();
        t.setId(id);
        t.setLocaleShort(localeShort);
        t.setDivisionId(div);
        t.setLocale(locale);
        t.setLogo(logo);
        return t;
    }

    private boolean assertTeamIdExistsInList(List<TeamDataVO> list, int i) {
        for (TeamDataVO t : list) {
            if (t.getId() == i) { return true; }
        }
        return false;
    }

}
