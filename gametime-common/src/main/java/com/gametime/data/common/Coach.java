package com.gametime.data.common;

/**
 * Created by dave on 2/6/2017.
 */
public class Coach {

    private long id;
    private Person person;
    private CoachAttribute attributes;
    private CoachSkillSet SkillSet;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public CoachAttribute getAttributes() {
        return attributes;
    }

    public void setAttributes(CoachAttribute attributes) {
        this.attributes = attributes;
    }

    public CoachSkillSet getSkillSet() {
        return SkillSet;
    }

    public void setSkillSet(CoachSkillSet skillSet) {
        SkillSet = skillSet;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
