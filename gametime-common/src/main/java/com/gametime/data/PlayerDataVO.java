package com.gametime.data;

import org.springframework.stereotype.Component;

import java.sql.Date;

/**
 * Created by dave on 2/12/2017.
 */
@Component
public class PlayerDataVO {

    private Long id;
    private Long teamId;
    private String firstName;
    private String lastName;
    private String height;
    private String weight;
    private java.sql.Date dateOfBirth;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

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
}
