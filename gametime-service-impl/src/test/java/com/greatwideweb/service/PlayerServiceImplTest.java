package com.greatwideweb.service;

import com.gametime.common.Person;
import com.gametime.common.Player;
import com.gametime.common.PlayerAttributes;
import com.gametime.common.Team;
import com.gametime.data.PlayerDataVO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.gametime.api.PlayerDataService;

import java.util.Calendar;
import java.util.List;

public class PlayerServiceImplTest {

    private static java.sql.Date TEST_DATE_OF_BIRTH = null;
    {
        Calendar c = Calendar.getInstance();
        c.set(1990, Calendar.NOVEMBER, 7);
        TEST_DATE_OF_BIRTH = new java.sql.Date(c.getTimeInMillis());
    }

    private final String TEST_LAST_NAME= "TEST_LAST_NAME";
    private final String TEST_FIRST_NAME= "TEST_FIRST_NAME";
    private final String TEST_WEIGHT= "TEST_WEIGHT";
    private final int TEST_TEAMID= 456;
    private final int TEST_AGILITY = 3;
    private final int TEST_INTELLIGENCE = 2;
    private final int TEST_ENDURANCE = 7;
    private final int TEST_SPEED = 6;
    private final int TEST_STRENGTH = 9;
    PlayerServiceImpl service;
    private final int TEST_ID = 123;
    private final String TEST_HEIGHT = "TEST_HEIGHT";


    @Before
    public void setupTest() {
        service = new PlayerServiceImpl();
        service.playerDataService = new PlayerDataServiceMock();
    }

    @Test
    public void ensureGetPlayerReturnsExpected() {
        Player p = service.getPlayer(TEST_ID);
        Assert.assertEquals(Long.valueOf(p.getId()), Long.valueOf(TEST_ID));
        Assert.assertEquals(Long.valueOf(p.getTeamId()), Long.valueOf(TEST_TEAMID));

        Person pn = p.getPerson();
        Assert.assertEquals(pn.getLastName(), TEST_LAST_NAME);
        Assert.assertEquals(pn.getFirstName(), TEST_FIRST_NAME);

        PlayerAttributes a = p.getAttributes();
        Assert.assertEquals(a.getStrength(), TEST_STRENGTH);
        Assert.assertEquals(a.getSpeed(), TEST_SPEED);
        Assert.assertEquals(a.getEndurance(), TEST_ENDURANCE);
        Assert.assertEquals(a.getAgility(), TEST_AGILITY);
        Assert.assertEquals(a.getIntelligence(), TEST_INTELLIGENCE);
    }

    class PlayerDataServiceMock implements PlayerDataService {

        PlayerDataVO vo;

        PlayerDataServiceMock() {
            vo = new PlayerDataVO();
            vo.setId(TEST_ID);
            vo.setFirstName(TEST_FIRST_NAME);
            vo.setLastName(TEST_LAST_NAME);
            vo.setHeight(TEST_HEIGHT);
            vo.setWeight(TEST_WEIGHT);
            vo.setTeamId(TEST_TEAMID);
            vo.setDateOfBirth(TEST_DATE_OF_BIRTH);

            vo.setAgility(TEST_AGILITY);
            vo.setCharisma(TEST_AGILITY);
            vo.setDesire(TEST_INTELLIGENCE);
            vo.setEgo(TEST_INTELLIGENCE);
            vo.setEndurance(TEST_ENDURANCE);
            vo.setEnergy(TEST_ENDURANCE);
            vo.setHandle(TEST_AGILITY);
            vo.setHealth(TEST_INTELLIGENCE);
            vo.setIntelligence(TEST_INTELLIGENCE);
            vo.setLuck(TEST_ENDURANCE);
            vo.setPerson(TEST_INTELLIGENCE);
            vo.setShotSelection(TEST_AGILITY);
            vo.setShotSkill(TEST_ENDURANCE);
            vo.setSize(TEST_SPEED);
            vo.setSpeed(TEST_SPEED);
            vo.setStrength(TEST_STRENGTH);
        }
        
        @Override
        public List<PlayerDataVO> getAllPlayers() {
            return null;
        }

        @Override
        public PlayerDataVO getPlayer(Integer id) {
            return vo;
        }

        @Override
        public void savePlayer(Player p) {

        }

        @Override
        public List<PlayerDataVO> findByLastName(String lastName) {
            return null;
        }

        @Override
        public List<PlayerDataVO> findByTeam(Integer TeamId) {
            return null;
        }

        @Override
        public List<PlayerDataVO> findByTeam(Team team) {
            return null;
        }

        @Override
        public void deleteAllPlayers() {

        }

        @Override
        public void deletePlayer(Integer id) {

        }

        @Override
        public void deletePlayer(Player p) {

        }
    }





}
