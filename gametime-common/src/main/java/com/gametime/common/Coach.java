package com.gametime.common;

/**
 * Created by dave on 2/6/2017.
 */
public class Coach {



    long id;
    Person person;
    CoachAttribute attributes;
    CoachSkillSet SkillSet;

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
