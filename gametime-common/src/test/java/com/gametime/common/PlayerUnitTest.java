package com.gametime.common;

import com.gametime.data.PlayerDataVO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;


import static com.gametime.common.PlayerTestData.buildPlayerData;

public class PlayerUnitTest {

    PlayerDataVO d;
    Player p;

    @Before
    public void setup() {
        d = buildPlayerData();
        p = new Player(d);
    }

    @Test
    public void ensurePlayerReturnsExpected() {
        Assert.assertEquals(p.getId(), Integer.valueOf(d.getId()));
        Assert.assertEquals(p.getTeamId(), Integer.valueOf(d.getTeamId()));
    }


    @Test
    public void ensurePersonReturnsExpected() {
        Assert.assertEquals(p.getPerson().getLastName(), d.getLastName());
        Assert.assertEquals(p.getPerson().getFirstName(), d.getFirstName());
        Assert.assertEquals(p.getPerson().getHeight(), d.getHeight());
        Assert.assertEquals(p.getPerson().getWeight(), d.getWeight());
        Assert.assertEquals(p.getPerson().getDateOfBirth().get(Calendar.YEAR), 1990);
        Assert.assertEquals(p.getPerson().getDateOfBirth().get(Calendar.MONTH), 10);
        Assert.assertEquals(p.getPerson().getDateOfBirth().get(Calendar.DATE), 7);
    }

}
