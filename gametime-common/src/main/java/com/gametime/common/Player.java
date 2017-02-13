package com.gametime.common;

/**
 * Created by dave on 2/6/2017.
 */
import com.gametime.data.PlayerDataVO;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Component
public class Player {

    private long id;
    private long teamId;
    private Person person;
    private PlayerAttributes attributes;
    private PlayerSkillSet skillSet;

    public Player() {

    }

    public Player(PlayerDataVO data) {
        id = data.getId();
        teamId = data.getTeamId();
        Calendar dob = null;
        if (data.getDateOfBirth() != null) {
            dob = new GregorianCalendar();
            dob.setTime(data.getDateOfBirth());
        }
        person = new Person(data.getFirstName(), data.getLastName(),
                data.getHeight(), data.getWeight(), dob);
        attributes = PlayerAttributes.PlayerDataToAttributes(data);
    }

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

    public long getTeamId() { return teamId; }
    public void setTeamId(long teamId) { this.teamId = teamId; }

}

