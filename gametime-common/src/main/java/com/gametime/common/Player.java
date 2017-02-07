package com.gametime.common;

/**
 * Created by dave on 2/6/2017.
 */
public class Player {

    long id;
    Person person;
    PlayerAttributes attributes;
    PlayerSkillSet skillSet;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public PlayerAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(PlayerAttributes attributes) {
        this.attributes = attributes;
    }

    public PlayerSkillSet getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(PlayerSkillSet skillSet) {
        this.skillSet = skillSet;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
