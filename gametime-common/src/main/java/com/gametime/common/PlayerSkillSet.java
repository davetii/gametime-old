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

    public PlayerSkillSet(PlayerAttributes a) {
        acumen = calcAcumen(a);
        ballSecurity = calcBallSecurity(a);
        defense = calcDefense(a);
        defenseRebound =calcDefenseRebound(a);
        drive = calcDrive(a);
        freeThrows = calcFreeThrows(a);
        pressureDefense = calcPressureDefense(a);
        longRange = calcLongRange(a);
        offense = calcOffense(a);
        offenseRebound= calcOffenseRebounds(a);
        passing = calcPassing(a);
        perimeter = calcPerimeter(a);
        post= calcPost(a);
        teamDefense = calcTeamDefense(a);
    }

    private double calcTeamDefense(PlayerAttributes a) {
        // intell, desire, person, health, charisma, strength, speed, endurance,
        double base = (a.getIntelligence() + a.getDesire() + a.getPerson() + a.getHealth() + a.getCharisma()
        + a.getStrength() + a.getSpeed() + a.getEndurance()) / 8d;
        return base;
    }

    private double calcPost(PlayerAttributes a) {
        double base = ( (a.getShotSkill() * 2) + a.getShotSelection() + a.getIntelligence() + a.getLuck() + a.getDesire()
                + a.getAgility() + (a.getStrength() * 2) + (a.getSize() * 2) + a.getEnergy() + a.getEgo() + a.getEndurance()) / 14d;
        return base;
    }

    private double calcPerimeter(PlayerAttributes a) {
        double base = ((a.getShotSkill() * 2) + (a.getShotSelection() * 3) + a.getIntelligence() + a.getLuck()
                + a.getSpeed() + a.getHandle() + a.getAgility()) / 10d;
        return base;
    }

    private double calcPassing(PlayerAttributes a) {
        // handle * 3, speed, intel * 2, shotselect,
        double base = ((a.getHandle() * 3) + a.getSpeed() + a.getShotSelection() + (a.getSpeed() * 2)) / 7d;
        return base;
    }

    private double calcOffenseRebounds(PlayerAttributes a) {
        // strength * 3, energy * 2, desire * 2, luck * 2, endurance, size * 2, speed,
        double base = ( (a.getStrength() * 3) + (a.getEnergy() * 2) + (a.getDesire() * 2) + (a.getLuck() * 2)
        + a.getEndurance() + (a.getSize() * 2) + a.getSpeed()) / 13d;
        return base;
    }

    private double calcOffense(PlayerAttributes a) {
        // intel, speed, strenght, person * 2, handle * 2, shot select, endurance, luck *2
        double base = (a.getIntelligence() + a.getSpeed() + a.getStrength() + a.getShotSelection() + a.getCharisma()
        + (a.getPerson() * 2) + (a.getHandle() * 2) + a.getEndurance() + (a.getLuck() * 2) + a.getHealth())  / 13d;
        // high ego is a negqtive
        return base;
    }

    private double calcLongRange(PlayerAttributes a) {
        // shot skill, shot select, intel, luck, speed, handle,
        double base = ((a.getShotSkill() * 3) + (a.getShotSelection() * 2) + a.getIntelligence() + a.getLuck()
                + a.getSpeed() + a.getHandle()) / 9d;
        return base;
    }

    private double calcPressureDefense(PlayerAttributes a) {
        // (desire *2, ego, energy *2, stregnth, speed, intel
        double base = ( (a.getDesire() * 2) + a.getEgo() + (a.getEnergy() * 2) + a.getStrength() + a.getSpeed() + a.getIntelligence()) / 8d;
        return base;
    }

    private double calcFreeThrows(PlayerAttributes a) {
        //shot select, (shot skill * 4), luck, ego,
        double base = (a.getShotSelection() + (a.getShotSkill() * 4) + a.getLuck() + a.getEgo()) / 7d;
        base = adjustPositiveBase(base, a.getShotSkill(), 7);
        base = adjustNegativeBase(base, a.getShotSkill(), 3);
        return base;
    }

    private double calcDrive(PlayerAttributes a) {
        // energy, ego, luck, agility (*3), speed, strenght (*2, handle, shotSkill, ShotSelection
        double base = (a.getEnergy() + a.getEgo() + a.getLuck() + (a.getAgility() *3)
                + a.getSpeed() + (a.getStrength() *2) + a.getHandle() + a.getShotSkill() + a.getShotSelection()) / 12d;
        //adjustments
        return base;
    }

    private double calcDefenseRebound(PlayerAttributes a) {
        // strength, desire, size, agility, endurance, luck, ego, energy,
        double base = ((a.getStrength() * 2) + (a.getDesire() * 2) + a.getSize() + a.getAgility() + a.getEndurance()
                + a.getLuck() + a.getEgo() + a.getEnergy()) / 10d;

        // adjustments
        return base;
    }

    private double calcDefense(PlayerAttributes a) {
        // intel, strength, desire, person *2, speed
        double base = (a.getIntelligence() + (a.getStrength() * 2) + a.getDesire() + (a.getPerson() *2) + a.getSpeed()) / 7d;

        base = adjustPositiveBase(base, a.getStrength(), 7);
        base = adjustPositiveBase(base, a.getSize(), 7);
        base = adjustPositiveBase(base, a.getSpeed(), 7);

        base = adjustNegativeBase(base, a.getStrength(), 4);
        base = adjustNegativeBase(base, a.getSpeed(), 4);
        base = adjustNegativeBase(base, a.getSize(), 3);
        return base;
    }

    private double calcBallSecurity(PlayerAttributes a) {
        // intel, speed, luck, desire, ego, handle * 2, shotSkill
        double base =  (a.getIntelligence() + a.getSpeed() + a.getLuck() + a.getDesire()
        + a.getEgo() + (a.getHandle() *2) + a.getShotSkill()) / 8d;

        base = adjustPositiveBase(base, a.getHandle(), 7);
        base = adjustPositiveBase(base, a.getIntelligence(), 8);
        base = adjustNegativeBase(base, a.getHandle(), 4);
        base = adjustNegativeBase(base, a.getIntelligence(), 3);
        return round(base);

    }

    protected double adjustPositiveBase(double base, int attribute, int adjust) {
        if (attribute > adjust) { base += attribute - adjust; }
        return base;
    }

    protected double adjustNegativeBase(double base, int attribute, int adjust) {
        if (attribute < adjust) { base -= adjust - attribute; }
        return base;
    }

    private double calcAcumen(PlayerAttributes a) {
        double base = (a.getIntelligence() + a.getIntelligence() + a.getDesire()
                + a.getLuck() + a.getShotSelection() + a.getSpeed() + a.getPerson()) / 7d;
        base = adjustPositiveBase(base, a.getIntelligence(), 7);
        base = adjustNegativeBase(base, a.getIntelligence(), 4);
        return round(base);
    }

    protected double round(double d) {
        return (double) Math.round(d * 10) / 10;
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
