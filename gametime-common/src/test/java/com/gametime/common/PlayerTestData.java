package com.gametime.common;

import com.gametime.data.PlayerDataVO;

import java.sql.Date;
import java.util.Calendar;

public class PlayerTestData {

    private static final int AGILITY = 10;
    private static final int CHARISMA = 9;
    private static final int STRENGTH = 8;
    private static final int SPEED = 7;
    private static final int SHOT_SELECTION = 6;
    private static final int SHOT_SKILL = 5;
    private static final int SIZE = 4;
    private static final int PERSON = 4;
    private static final int LUCK = 3;
    private static final int INTELLIGENCE = 2;
    private static final int HEALTH = 6;
    private static final int HANDLE = 10;
    private static final int ENERGY = 4;
    private static final int EGO = 7;
    private static final int DESIRE = 8;

    static PlayerDataVO buildPlayerData() {
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

    private static Date createNov71990() {

        Calendar cal = Calendar.getInstance();

        // set Date portion to January 1, 1970
        cal.set( cal.YEAR, 1990 );
        cal.set( cal.MONTH, cal.NOVEMBER );
        cal.set( cal.DATE, 7);
        return new Date(cal.getTime().getTime());
    }

    static PlayerAttributes buildBase() {
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

    static PlayerAttributes buildHighAcumen() {
        PlayerAttributes a = buildBase();
        a.setIntelligence(10);
        return a;
    }

    static PlayerAttributes buildLowAcumen() {
        PlayerAttributes a = buildBase();
        a.setIntelligence(2);
        return a;
    }

    static PlayerAttributes buildHighBallSecurity() {
        PlayerAttributes a = buildBase();
        a.setIntelligence(10);
        a.setHandle(9);
        return a;
    }

    static PlayerAttributes buildLowBallSecurity() {
        PlayerAttributes a = buildBase();
        a.setIntelligence(2);
        a.setHandle(2);
        return a;
    }

    static PlayerAttributes buildMixedSecurity() {
        PlayerAttributes a = buildBase();
        a.setIntelligence(10);
        a.setHandle(2);
        return a;
    }

    static PlayerAttributes buildHighDefense() {
        PlayerAttributes a = buildBase();
        a.setStrength(10);
        a.setSize(10);
        return a;
    }

    static PlayerAttributes buildLowDefense() {
        PlayerAttributes a = buildBase();
        a.setStrength(2);
        a.setSize(2);
        return a;
    }

    static PlayerAttributes buildMixedDefense() {
        PlayerAttributes a = buildBase();
        a.setPerson(8);
        a.setStrength(9);
        a.setSize(10);
        a.setSpeed(2);
        return a;
    }

    static PlayerAttributes buildHighDefReb() {
        PlayerAttributes a = buildBase();
        a.setDesire(8);
        a.setStrength(8);
        a.setSize(9);
        a.setEnergy(9);
        return a;
    }

    static PlayerAttributes buildLowDefReb() {
        PlayerAttributes a = buildBase();
        a.setDesire(2);
        a.setEnergy(1);
        return a;
    }

    static PlayerAttributes buildMixedDefReb() {
        PlayerAttributes a = buildBase();
        a.setDesire(2);
        a.setStrength(8);
        a.setSize(9);
        a.setEnergy(2);
        return a;
    }

    static PlayerAttributes buildHighDrive() {
        PlayerAttributes a = buildBase();
        a.setEgo(10);
        a.setAgility(9);
        a.setShotSkill(9);
        a.setHandle(9);
        return a;
    }

    static PlayerAttributes buildLowDrive() {
        PlayerAttributes a = buildBase();
        a.setAgility(2);
        a.setShotSkill(2);
        return a;
    }

    static PlayerAttributes buildMixedDrive() {
        PlayerAttributes a = buildBase();
        a.setEgo(10);
        a.setAgility(2);
        a.setSpeed(2);
        a.setShotSkill(10);
        return a;
    }

    static PlayerAttributes buildHighFreeThrows() {
        PlayerAttributes a = buildBase();
        a.setShotSkill(10);
        return a;
    }

    static PlayerAttributes buildLowFreeThrows() {
        PlayerAttributes a = buildBase();
        a.setShotSkill(1);
        return a;
    }

    static PlayerAttributes buildHighPressureDefense() {
        PlayerAttributes a = buildBase();
        a.setDesire(8);
        a.setSpeed(9);
        a.setEnergy(9);
        return a;
    }

    static PlayerAttributes buildLowPressureDefense() {
        PlayerAttributes a = buildBase();
        a.setDesire(2);
        a.setSpeed(2);
        a.setEnergy(2);
        return a;
    }

    static PlayerAttributes buildMixedPressureDefense() {
        PlayerAttributes a = buildBase();
        a.setDesire(8);
        a.setSpeed(1);
        a.setEnergy(7);
        return a;
    }

    static PlayerAttributes buildHighLongRange() {
        PlayerAttributes a = buildBase();
        a.setShotSkill(8);
        a.setShotSelection(9);
        return a;
    }

    static PlayerAttributes buildLowLongRange() {
        PlayerAttributes a = buildBase();
        a.setShotSkill(2);
        a.setShotSelection(2);
        return a;
    }

    static PlayerAttributes buildMixedLongRange() {
        PlayerAttributes a = buildBase();
        a.setShotSkill(9);
        a.setLuck(9);
        a.setShotSelection(2);
        return a;
    }

    static PlayerAttributes buildHighOffense() {
        PlayerAttributes a = buildBase();
        a.setPerson(9);
        a.setLuck(9);
        a.setHandle(9);
        return a;
    }

    static PlayerAttributes buildLowOffense() {
        PlayerAttributes a = buildBase();
        a.setEgo(9);
        a.setLuck(2);
        a.setHandle(2);
        return a;
    }

    static PlayerAttributes buildMixedOffense() {
        PlayerAttributes a = buildBase();
        a.setEgo(9);
        a.setLuck(9);
        a.setHandle(9);
        return a;
    }

    static PlayerAttributes buildHighOffensRebounds() {
        PlayerAttributes a = buildBase();
        a.setDesire(9);
        a.setStrength(10);
        a.setAgility(9);
        return a;
    }

    static PlayerAttributes buildLowOffenseRebounds() {
        PlayerAttributes a = buildBase();
        a.setDesire(2);
        a.setStrength(2);
        a.setEnergy(2);
        return a;
    }

    static PlayerAttributes buildMixedOffenseRebounds() {
        PlayerAttributes a = buildBase();
        a.setDesire(2);
        a.setStrength(10);
        a.setAgility(9);
        a.setEnergy(9);
        return a;
    }

    static PlayerAttributes buildHighPassing() {
        PlayerAttributes a = buildBase();
        a.setHandle(9);
        a.setIntelligence(9);
        return a;
    }

    static PlayerAttributes buildLowPassing() {
        PlayerAttributes a = buildBase();
        a.setHandle(2);
        a.setIntelligence(2);
        return a;
    }

    static PlayerAttributes buildMixedPassing() {
        PlayerAttributes a = buildBase();
        a.setHandle(9);
        a.setIntelligence(2);
        return a;
    }

    static PlayerAttributes buildHighPerimeter() {
        PlayerAttributes a = buildBase();
        a.setShotSkill(9);
        a.setShotSelection(9);
        return a;
    }

    static PlayerAttributes buildLowPerimeter() {
        PlayerAttributes a = buildBase();
        a.setShotSkill(2);
        a.setShotSelection(2);
        return a;
    }

    static PlayerAttributes buildMixedPerimeter() {
        PlayerAttributes a = buildBase();
        a.setShotSkill(9);
        a.setShotSelection(2);
        return a;
    }

    static PlayerAttributes buildHighPost() {
        PlayerAttributes a = buildBase();
        a.setStrength(10);
        a.setDesire(9);
        a.setShotSelection(9);
        return a;
    }

    static PlayerAttributes buildLowPost() {
        PlayerAttributes a = buildBase();
        a.setStrength(2);
        a.setShotSelection(2);
        return a;
    }

    static PlayerAttributes buildMixedPost() {
        PlayerAttributes a = buildBase();
        a.setStrength(2);
        a.setDesire(9);
        a.setShotSelection(10);
        return a;
    }

    static PlayerAttributes buildHighTeamDefense() {
        PlayerAttributes a = buildBase();
        a.setPerson(9);
        a.setEndurance(9);
        return a;
    }

    static PlayerAttributes buildLowTeamDefense() {
        PlayerAttributes a = buildBase();
        a.setPerson(2);
        a.setEndurance(2);
        return a;
    }

    static PlayerAttributes buildMixedTeamDefense() {
        PlayerAttributes a = buildBase();
        a.setPerson(10);
        a.setEndurance(2);
        return a;
    }
}
