package com.gametime.common;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.gametime.common.PlayerTestData.buildBase;
import static com.gametime.common.PlayerTestData.buildHighAcumen;
import static com.gametime.common.PlayerTestData.buildLowAcumen;

public class PlayerSkillSetUnitTest {

    private PlayerSkillSet s;

    @Test
    public void ensureSkillSetRoundWorksAsExpected() {
        s = new PlayerSkillSet(buildBase());
        Assert.assertEquals(s.round(10.3543), 10.4, 0d);
        Assert.assertEquals(s.round(10.3443), 10.3, 0d);
        Assert.assertEquals(s.round(10.1453), 10.1, 0d);
    }

    @Test
    public void ensureAdjustPositiveReturnsExpected() {
        s = new PlayerSkillSet(buildBase());
        Assert.assertEquals( s.adjustPositiveBase(10.0d, 1, 7), 10.0d, 0d);
        Assert.assertEquals( s.adjustPositiveBase(10.0d, 5, 7), 10.0d, 0d);
        Assert.assertEquals( s.adjustPositiveBase(10.0d, 7, 7), 10.0d, 0d);
        Assert.assertEquals( s.adjustPositiveBase(10.0d, 8, 7), 11.0d, 0d);
        Assert.assertEquals( s.adjustPositiveBase(10.1d, 9, 7), 12.1d, 0d);
    }

    @Test
    public void ensureAdjustNegativeReturnsExpected() {
        s = new PlayerSkillSet(buildBase());
        Assert.assertEquals( s.adjustNegativeBase(10.0d, 10, 4), 10.0d, 0d);
        Assert.assertEquals( s.adjustNegativeBase(10.0d, 7, 4), 10.0d, 0d);
        Assert.assertEquals( s.adjustNegativeBase(10.0d, 5, 4), 10.0d, 0d);
        Assert.assertEquals( s.adjustNegativeBase(10.0d, 4, 4), 10.0d, 0d);
        Assert.assertEquals( s.adjustNegativeBase(10.0d, 3, 4), 9.0d, 0d);
        Assert.assertEquals( s.adjustNegativeBase(10.0d, 2, 4), 8.0d, 0d);
    }

    @Test
    public void ensureBaseValuesReturnExpected() {
        s = new PlayerSkillSet(buildBase());
        Assert.assertEquals(s.getAcumen(), 5d, 0d);
        Assert.assertEquals(s.getBallSecurity(), 5d, 0d);
        Assert.assertEquals(s.getDefense(), 5d, 0d);
        Assert.assertEquals(s.getDefenseRebound(), 5d, 0d);
        Assert.assertEquals(s.getDrive(), 5d, 0d);
        Assert.assertEquals(s.getFreeThrows(), 5d, 0d);
        Assert.assertEquals(s.getLongRange(), 5d, 0d);
        Assert.assertEquals(s.getOffense(), 5d, 0d);
        Assert.assertEquals(s.getOffenseRebound(), 5d, 0d);
        Assert.assertEquals(s.getPassing(), 5d, 0d);
        Assert.assertEquals(s.getPerimeter(), 5d, 0d);
        Assert.assertEquals(s.getPost(), 5d, 0d);
        Assert.assertEquals(s.getPressureDefense(), 5d, 0d);
        Assert.assertEquals(s.getTeamDefense(), 5d, 0d);
    }


    @Test
    public void ensureHighAcumenReturnsExpected() {
        s = new PlayerSkillSet(buildHighAcumen());
        Assert.assertEquals(s.getAcumen(), 9.4d, 0d);
    }

    @Test
    public void ensureLowAcumenReturnsExpected() {
        s = new PlayerSkillSet(buildLowAcumen());
        Assert.assertEquals(s.getAcumen(), 2.1d, 0d);
    }



    /*
    @Test
    public void ensureHighBallSecurityReturnsExpected() {
        s = new PlayerSkillSet(PlayerTestData.buildHighBallSecurity());
        Assert.assertEquals(s.getBallSecurity(), 6d, 0d);

    }


    @Test
    public void ensureLowBallSecurityReturnsExpected() {
        s = new PlayerSkillSet(PlayerTestData.buildLowBallSecurity());
        Assert.assertEquals(s.getBallSecurity(), 6d, 0d);

    }

    @Test
    public void ensureMixedBallSecurityReturnsExpected() {
        s = new PlayerSkillSet(PlayerTestData.buildMixedSecurity());
        Assert.assertEquals(s.getBallSecurity(), 6d, 0d);

    }
    */



}
