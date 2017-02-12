package com.gametime.data.common;

/**
 * Created by dave on 2/6/2017.
 */
import org.springframework.stereotype.Component;

@Component
public class Player {

    private long id;
    private Person person;
    private PlayerAttributes attributes;
    private PlayerSkillSet skillSet;

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

