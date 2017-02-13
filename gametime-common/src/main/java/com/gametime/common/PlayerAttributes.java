package com.gametime.common;

import com.gametime.data.PlayerDataVO;

/**
 * Created by dave on 2/6/2017.
 */
public class PlayerAttributes {

    private int agility;
    private int charisma;
    private int desire;
    private int ego;
    private int endurance;
    private int energy;
    private int handle;
    private int health;
    private int intelligence;
    private int luck;
    private int person;
    private int shotSelection;
    private int shotSkill;
    private int size;
    private int speed;
    private int strength;

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getDesire() {
        return desire;
    }

    public void setDesire(int desire) {
        this.desire = desire;
    }

    public int getEgo() {
        return ego;
    }

    public void setEgo(int ego) {
        this.ego = ego;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHandle() {
        return handle;
    }

    public void setHandle(int handle) {
        this.handle = handle;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public int getShotSelection() {
        return shotSelection;
    }
    public void setShotSelection(int shotSelection) {
        this.shotSelection = shotSelection;
    }

    public int getShotSkill() {
        return shotSkill;
    }
    public void setShotSkill(int shotSkill) {
        this.shotSkill = shotSkill;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }


    public static PlayerAttributes PlayerDataToAttributes(PlayerDataVO data) {
        PlayerAttributes a = new PlayerAttributes();

        a.setAgility(data.getAgility());
        a.setCharisma(data.getCharisma());
        a.setDesire(data.getDesire());
        a.setEgo(data.getEgo());
        a.setEndurance(data.getEndurance());
        a.setEnergy(data.getEnergy());
        a.setHandle(data.getHandle());
        a.setHealth(data.getHealth());
        a.setIntelligence(data.getIntelligence());
        a.setLuck(data.getLuck());
        a.setPerson(data.getPerson());
        a.setStrength(data.getStrength());
        a.setSize(data.getSize());
        a.setSpeed(data.getSpeed());
        a.setShotSkill(data.getShotSkill());
        a.setShotSelection(data.getShotSelection());
        return a;
    }
}
