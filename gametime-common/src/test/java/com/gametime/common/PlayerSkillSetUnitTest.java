package com.gametime.common;

import org.junit.Assert;
import org.junit.Test;

import static com.gametime.common.PlayerTestData.*;

public class PlayerSkillSetUnitTest {

    private PlayerSkillSet s;

    @Test
    public void ensureAddActsAsExpected() {
        s = new PlayerSkillSet(buildBase());
        int[] ints = {1,2,3,4,5};
        Assert.assertEquals(s.add(ints), 15, 0d);
    }

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

    @Test
    public void ensureHighBallSecurityReturnsExpected() {
        s = new PlayerSkillSet(buildHighBallSecurity());
        Assert.assertEquals(s.getBallSecurity(), 10.6d, 0d);
    }

    @Test
    public void ensureLowBallSecurityReturnsExpected() {
        s = new PlayerSkillSet(buildLowBallSecurity());
        Assert.assertEquals(s.getBallSecurity(), .9d, 0d);
    }

    @Test
    public void ensureMixedBallSecurityReturnsExpected() {
        s = new PlayerSkillSet(buildMixedSecurity());
        Assert.assertEquals(s.getBallSecurity(), 4.9d, 0d);
    }

    @Test
    public void ensureHighDefenseReturnsExpected() {
        s = new PlayerSkillSet(buildHighDefense());
        Assert.assertEquals(s.getDefense(), 12.4d, 0d);
    }

    @Test
    public void ensureLowDefenseReturnsExpected() {
        s = new PlayerSkillSet(buildLowDefense());
        Assert.assertEquals(s.getDefense(), 1.1d, 0d);
    }

    @Test
    public void ensureMixedDefenseReturnsExpected() {
        s = new PlayerSkillSet(buildMixedDefense());
        Assert.assertEquals(s.getDefense(), 9.6d, 0d);
    }

    @Test
    public void ensureHighDefReboundreturnsExpected() {
        s = new PlayerSkillSet(buildHighDefReb());
        Assert.assertEquals(s.getDefenseRebound(), 10.0d, 0d);
    }

    @Test
    public void ensureLowDefReboundreturnsExpected() {
        s = new PlayerSkillSet(buildLowDefReb());
        Assert.assertEquals(s.getDefenseRebound(), 0.0d, 0d);
    }

    @Test
    public void ensureMixedDefReboundreturnsExpected() {
        s = new PlayerSkillSet(buildMixedDefReb());
        Assert.assertEquals(s.getDefenseRebound(), 3.1d, 0d);
    }

    @Test
    public void ensureHighDriveReturnsExpected() {
        s = new PlayerSkillSet(buildHighDrive());
        Assert.assertEquals(s.getDrive(), 13.1d, 0d);
    }

    @Test
    public void ensureLowDriveReturnsExpected() {
        s = new PlayerSkillSet(buildLowDrive());
        Assert.assertEquals(s.getDrive(), 1.0d, 0d);
    }

    @Test
    public void ensureMixedDriveReturnsExpected() {
        s = new PlayerSkillSet(buildMixedDrive());
        Assert.assertEquals(s.getDrive(), 6.8d, 0d);
    }

    @Test
    public void ensureHighFreeThrowsReturnsExpected() {
        s = new PlayerSkillSet(buildHighFreeThrows());
        Assert.assertEquals(s.getFreeThrows(), 10.9d, 0d);
    }

    @Test
    public void ensureLowFreeThrowsReturnsExpected() {
        s = new PlayerSkillSet(buildLowFreeThrows());
        Assert.assertEquals(s.getFreeThrows(), 0.7d, 0d);
    }

    @Test
    public void ensureHighPressureDefenseReturnsExpected() {
        s = new PlayerSkillSet(buildHighPressureDefense());
        Assert.assertEquals(s.getPressureDefense(), 10.3d, 0d);
    }

    @Test
    public void ensureLowPressureDefenseReturnsExpected() {
        s = new PlayerSkillSet(buildLowPressureDefense());
        Assert.assertEquals(s.getPressureDefense(), -0.9d, 0d);
    }

    @Test
    public void ensureMixedPressureDefenseReturnsExpected() {
        s = new PlayerSkillSet(PlayerTestData.buildMixedPressureDefense());
        Assert.assertEquals(s.getPressureDefense(), 4.8d, 0d);
    }

    @Test
    public void ensureHighLongRangeReturnsExpected() {
        s = new PlayerSkillSet(buildHighLongRange());
        Assert.assertEquals(s.getLongRange(), 8.9d, 0d);
    }

    @Test
    public void ensureLowLongRangeReturnsExpected() {
        s = new PlayerSkillSet(buildLowLongRange());
        Assert.assertEquals(s.getLongRange(), 0.3d, 0d);
    }

    @Test
    public void ensureMixedLongRangeReturnsExpected() {
        s = new PlayerSkillSet(buildMixedLongRange());
        Assert.assertEquals(s.getLongRange(), 7.1d, 0d);
    }

    @Test
    public void ensureHighOffenseReturnsExpected() {
        s = new PlayerSkillSet(PlayerTestData.buildHighOffense());
        Assert.assertEquals(s.getOffense(), 10.8d, 0d);
    }

    @Test
    public void ensureLowOffenseReturnsExpected() {
        s = new PlayerSkillSet(PlayerTestData.buildLowOffense());
        Assert.assertEquals(s.getOffense(), 0.1d, 0d);
    }

    @Test
    public void ensureMixedOffenseReturnsExpected() {
        s = new PlayerSkillSet(PlayerTestData.buildMixedOffense());
        Assert.assertEquals(s.getOffense(), 7.2d, 0d);
    }

}
