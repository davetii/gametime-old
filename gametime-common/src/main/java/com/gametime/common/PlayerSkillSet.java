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
        double base = add(a.getIntelligence(), a.getDesire(), a.getPerson(), a.getHealth(),
                a.getCharisma(), a.getStrength(), a.getSpeed(), a.getEndurance()) / 8d;
        return base;
    }

    private double calcPost(PlayerAttributes a) {
        double base = add( (a.getShotSkill() * 2), a.getShotSelection(), a.getIntelligence(), a.getLuck(),
                a.getDesire(), a.getAgility(), (a.getStrength() * 2), (a.getSize() * 2),
                a.getEnergy(), a.getEgo(), a.getEndurance()) / 14d;
        return base;
    }

    private double calcPerimeter(PlayerAttributes a) {
        double base = add((a.getShotSkill() * 2), (a.getShotSelection() * 3), a.getIntelligence(),
                a.getLuck(), a.getSpeed(), a.getHandle(), a.getAgility()) / 10d;
        return base;
    }

    private double calcPassing(PlayerAttributes a) {
        double base = add((a.getHandle() * 3), a.getSpeed(), a.getShotSelection(), (a.getSpeed() * 2)) / 7d;
        return base;
    }

    private double calcOffenseRebounds(PlayerAttributes a) {
        double base = add( (a.getStrength() * 3), (a.getEnergy() * 2), (a.getDesire() * 2),
                (a.getLuck() * 2), a.getEndurance(), (a.getSize() * 2), a.getSpeed()) / 13d;
        return base;
    }

    private double calcOffense(PlayerAttributes a) {
        double base = add(a.getIntelligence(), a.getSpeed(), a.getStrength(),
                a.getShotSelection(), a.getCharisma(), (a.getPerson() * 2),
                (a.getHandle() * 2), a.getEndurance(), (a.getLuck() * 2), a.getHealth())  / 13d;
        // high ego is a negqtive
        return base;
    }

    private double calcLongRange(PlayerAttributes a) {
        double base = add((a.getShotSkill() * 3), (a.getShotSelection() * 2), a.getIntelligence(),
                a.getLuck(), a.getSpeed(), a.getHandle()) / 9d;
        return base;
    }

    private double calcPressureDefense(PlayerAttributes a) {
        double base = add( (a.getDesire() * 2), a.getEgo(), (a.getEnergy() * 2), a.getStrength(),
                a.getSpeed() + a.getIntelligence()) / 8d;
        return base;
    }

    private double calcFreeThrows(PlayerAttributes a) {
        double base = add(a.getShotSelection(), (a.getShotSkill() * 4), a.getLuck(), a.getEgo()) / 7d;
        base = adjustPositiveBase(base, a.getShotSkill(), 7);
        base = adjustNegativeBase(base, a.getShotSkill(), 3);
        return base;
    }

    private double calcDrive(PlayerAttributes a) {
        double base = add(a.getEnergy(), a.getEgo(), a.getLuck(), (a.getAgility() *3), a.getSpeed(),
                (a.getStrength() *2), a.getHandle(), a.getShotSkill(), a.getShotSelection());
        base = base /12d;
        //adjustments
        return base;
    }

    private double calcDefenseRebound(PlayerAttributes a) {
        double base = add((a.getStrength() * 2), (a.getDesire() * 2), a.getSize(), a.getAgility(),
                a.getEndurance(), a.getLuck(), a.getEgo(), a.getEnergy()) / 10d;
        // adjustments
        return base;
    }

    private double calcDefense(PlayerAttributes a) {
        double base = add(a.getIntelligence(), (a.getStrength() * 2), a.getDesire(),
                (a.getPerson() *2), a.getSpeed()) / 7d;

        base = adjustPositiveBase(base, a.getStrength(), 7);
        base = adjustPositiveBase(base, a.getSize(), 7);
        base = adjustPositiveBase(base, a.getSpeed(), 7);

        base = adjustNegativeBase(base, a.getStrength(), 4);
        base = adjustNegativeBase(base, a.getSpeed(), 4);
        base = adjustNegativeBase(base, a.getSize(), 3);
        return base;
    }

    private double calcBallSecurity(PlayerAttributes a) {
        double base = add(a.getIntelligence(), a.getSpeed(), a.getLuck(),
                a.getDesire(), a.getEgo(), (a.getHandle() *2), a.getShotSkill());
        base = base /8d;
        base = adjustPositiveBase(base, a.getHandle(), 7);
        base = adjustPositiveBase(base, a.getIntelligence(), 8);
        base = adjustNegativeBase(base, a.getHandle(), 4);
        base = adjustNegativeBase(base, a.getIntelligence(), 3);
        return round(base);
    }

    private double calcAcumen(PlayerAttributes a) {
        double base = add(a.getIntelligence(), a.getIntelligence(), a.getDesire(),
                a.getLuck(), a.getShotSelection(), a.getSpeed(), a.getPerson()) / 7d;
        base = adjustPositiveBase(base, a.getIntelligence(), 7);
        base = adjustNegativeBase(base, a.getIntelligence(), 4);
        return round(base);
    }

    protected double add(int... i) {
        double result =0d;
        for (int x : i) {
            result += x;
        }
        return result;
    }

    protected double adjustPositiveBase(double base, int attribute, int adjust) {
        if (attribute > adjust) { base += attribute - adjust; }
        return base;
    }

    protected double adjustNegativeBase(double base, int attribute, int adjust) {
        if (attribute < adjust) { base -= adjust - attribute; }
        return base;
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
