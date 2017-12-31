package com.gametime.common;

/**
 * Created by dave on 2/6/2017.
 */
public class PlayerSkillSet {

    private final double acumen;
    private final double ballSecurity;
    private final double defense;
    private final double defenseRebound;
    private final double drive;
    private final double freeThrows;
    private final double longRange;
    private final double offense;
    private final double offenseRebound;
    private final double passing;
    private final double perimeter;
    private final double post;
    private final double pressureDefense;
    private final double teamDefense;

    public PlayerSkillSet(PlayerAttributes attribs) {
        acumen = calcAcumen(attribs);
        ballSecurity = 0;
        defense = 0;
        defenseRebound =0;
        drive =0;
        freeThrows = 0;
        pressureDefense = 0;
        longRange = 0;
        offense = 0;
        offenseRebound= 0;
        passing = 0;
        perimeter = 0;
        post= 0;
        teamDefense = 0;
    }

    public double calcAcumen(PlayerAttributes attribs) {
        return 0d;
    }

    public double getAcumen() {
        return acumen;
    }

    public double getBallSecurity() { return ballSecurity; }

    public double getDefense() {
        return defense;
    }

    public double getDefenseRebound() {
        return defenseRebound;
    }

    public double getDrive() {
        return drive;
    }

    public double getFreeThrows() {
        return freeThrows;
    }

    public double getPressureDefense() {
        return pressureDefense;
    }

    public double getLongRange() {
        return longRange;
    }

    public double getOffense() {
        return offense;
    }

    public double getOffenseRebound() {
        return offenseRebound;
    }

    public double getPassing() {
        return passing;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getPost() {
        return post;
    }

    public double getTeamDefense() {
        return teamDefense;
    }
}
