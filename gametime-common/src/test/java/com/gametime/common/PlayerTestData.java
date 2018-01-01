package com.gametime.common;

import com.gametime.data.PlayerDataVO;

import java.sql.Date;
import java.util.Calendar;

public class PlayerTestData {

    public static final int AGILITY = 10;
    public static final int CHARISMA = 9;
    public static final int STRENGTH = 8;
    public static final int SPEED = 7;
    public static final int SHOT_SELECTION = 6;
    public static final int SHOT_SKILL = 5;
    public static final int SIZE = 4;
    public static final int PERSON = 4;
    public static final int LUCK = 3;
    public static final int INTELLIGENCE = 2;
    public static final int HEALTH = 6;
    public static final int HANDLE = 10;
    public static final int ENERGY = 4;
    public static final int EGO = 7;
    public static final int DESIRE = 8;

    protected static PlayerDataVO buildPlayerData() {
        PlayerDataVO d = new PlayerDataVO();
        d.setDateOfBirth(createNov71990());
        d.setFirstName("Dave");
        d.setLastName("Turner");
        d.setId(123);
        d.setHeight("AA");
        d.setWeight("BB");
        d.setTeamId(321);
        d.setAgility(AGILITY);
        d.setCharisma(CHARISMA);
        d.setStrength(STRENGTH);
        d.setSpeed(SPEED);
        d.setShotSelection(SHOT_SELECTION);
        d.setShotSkill(SHOT_SKILL);
        d.setSize(SIZE);
        d.setPerson(PERSON);
        d.setLuck(LUCK);
        d.setIntelligence(INTELLIGENCE);
        d.setHealth(HEALTH);
        d.setHandle(HANDLE);
        d.setEnergy(ENERGY);
        d.setEgo(EGO);
        d.setDesire(DESIRE);
        return d;
    }

    protected static PlayerAttributes buildAttributes() {
        PlayerDataVO d = buildPlayerData();
        return PlayerAttributes.PlayerDataToAttributes(d);
    }

    private static Date createNov71990() {

        Calendar cal = Calendar.getInstance();

        // set Date portion to January 1, 1970
        cal.set( cal.YEAR, 1990 );
        cal.set( cal.MONTH, cal.NOVEMBER );
        cal.set( cal.DATE, 7);
        return new Date(cal.getTime().getTime());
    }

    public static PlayerAttributes buildBase() {
        PlayerAttributes a = new PlayerAttributes();
        a.setSize(5);
        a.setEnergy(5);
        a.setEndurance(5);
        a.setEgo(5);
        a.setCharisma(5);
        a.setAgility(5);
        a.setPerson(5);
        a.setSpeed(5);
        a.setLuck(5);
        a.setDesire(5);
        a.setIntelligence(5);
        a.setShotSelection(5);
        a.setShotSkill(5);
        a.setStrength(5);
        a.setHealth(5);
        a.setHandle(5);
        return a;
    }

    public static PlayerAttributes buildHighAcumen() {
        PlayerAttributes a = buildBase();
        a.setIntelligence(10);
        return a;
    }

    public static PlayerAttributes buildLowAcumen() {
        PlayerAttributes a = buildBase();
        a.setIntelligence(2);
        return a;
    }

    public static PlayerAttributes buildHighBallSecurity() {
        PlayerAttributes a = buildBase();
        a.setIntelligence(10);
        a.setHandle(9);
        return a;
    }

    public static PlayerAttributes buildLowBallSecurity() {
        PlayerAttributes a = buildBase();
        a.setIntelligence(2);
        a.setHandle(2);
        return a;
    }

    public static PlayerAttributes buildMixedSecurity() {
        PlayerAttributes a = buildBase();
        a.setIntelligence(10);
        a.setHandle(2);
        return a;
    }

    public static PlayerAttributes buildHighDefense() {
        PlayerAttributes a = buildBase();
        a.setStrength(10);
        a.setSize(10);
        return a;
    }

    public static PlayerAttributes buildLowDefense() {
        PlayerAttributes a = buildBase();
        a.setStrength(2);
        a.setSize(2);
        return a;
    }

    public static PlayerAttributes buildMixedDefense() {
        PlayerAttributes a = buildBase();
        a.setPerson(8);
        a.setStrength(9);
        a.setSize(10);
        a.setSpeed(2);
        return a;
    }

    public static PlayerAttributes buildHighDefReb() {
        PlayerAttributes a = buildBase();
        a.setDesire(8);
        a.setStrength(8);
        a.setSize(9);
        a.setEnergy(9);
        return a;
    }

    public static PlayerAttributes buildLowDefReb() {
        PlayerAttributes a = buildBase();
        a.setDesire(2);
        a.setEnergy(1);
        return a;
    }

    public static PlayerAttributes buildMixedDefReb() {
        PlayerAttributes a = buildBase();
        a.setDesire(2);
        a.setStrength(8);
        a.setSize(9);
        a.setEnergy(2);
        return a;
    }

    public static PlayerAttributes buildHighDrive() {
        PlayerAttributes a = buildBase();
        a.setEgo(10);
        a.setAgility(9);
        a.setShotSkill(9);
        a.setHandle(9);
        return a;
    }

    public static PlayerAttributes buildLowDrive() {
        PlayerAttributes a = buildBase();
        a.setAgility(2);
        a.setShotSkill(2);
        return a;
    }

    public static PlayerAttributes buildMixedDrive() {
        PlayerAttributes a = buildBase();
        a.setEgo(10);
        a.setAgility(2);
        a.setSpeed(2);
        a.setShotSkill(10);
        return a;
    }

    public static PlayerAttributes buildHighFreeThrows() {
        PlayerAttributes a = buildBase();
        a.setShotSkill(10);
        return a;
    }

    public static PlayerAttributes buildLowFreeThrows() {
        PlayerAttributes a = buildBase();
        a.setShotSkill(1);
        return a;
    }

    public static PlayerAttributes buildHighPressureDefense() {
        PlayerAttributes a = buildBase();
        a.setDesire(8);
        a.setSpeed(9);
        a.setEnergy(9);
        return a;
    }

    public static PlayerAttributes buildLowPressureDefense() {
        PlayerAttributes a = buildBase();
        a.setDesire(2);
        a.setSpeed(2);
        a.setEnergy(2);
        return a;
    }

    public static PlayerAttributes buildMixedPressureDefense() {
        PlayerAttributes a = buildBase();
        a.setDesire(8);
        a.setSpeed(1);
        a.setEnergy(7);
        return a;
    }
}
