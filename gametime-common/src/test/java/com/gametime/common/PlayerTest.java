package com.gametime.common;

import com.gametime.data.PlayerDataVO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PlayerTest {

    PlayerDataVO d;
    Player p;

    @Before
    public void setup() {
        d = new PlayerDataVO();
        d.setDateOfBirth(createNov71990());
        d.setFirstName("Dave");
        d.setLastName("Turner");
        d.setId(123);
        d.setHeight("AA");
        d.setWeight("BB");
        d.setTeamId(321);
        d.setAgility(10);
        d.setCharisma(9);
        d.setStrength(8);
        d.setSpeed(7);
        d.setShotSelection(6);
        d.setShotSkill(5);
        d.setSize(4);
        d.setPerson(4);
        d.setLuck(3);
        d.setIntelligence(2);
        d.setHealth(6);
        d.setHandle(10);
        d.setEnergy(4);
        d.setEgo(12);
        d.setDesire(32);
        p = new Player(d);
    }

    @Test
    public void ensurePlayerReturnsExpected() {
        Assert.assertEquals(p.getId(), Integer.valueOf(d.getId()));
        Assert.assertEquals(p.getTeamId(), Integer.valueOf(d.getTeamId()));
    }


    @Test
    public void ensurePersonReturnsExpected() {
        Assert.assertEquals(p.getPerson().getLastName(), d.getLastName());
        Assert.assertEquals(p.getPerson().getFirstName(), d.getFirstName());
        Assert.assertEquals(p.getPerson().getHeight(), d.getHeight());
        Assert.assertEquals(p.getPerson().getWeight(), d.getWeight());
        Assert.assertEquals(p.getPerson().getDateOfBirth().get(Calendar.YEAR), 1990);
        Assert.assertEquals(p.getPerson().getDateOfBirth().get(Calendar.MONTH), 10);
        Assert.assertEquals(p.getPerson().getDateOfBirth().get(Calendar.DATE), 7);
    }

    @Test
    public void ensureAttributesReturnExpected() {
        Assert.assertEquals(p.getAttributes().getAgility(), d.getAgility());
        Assert.assertEquals(p.getAttributes().getCharisma(), d.getCharisma());
        Assert.assertEquals(p.getAttributes().getDesire(), d.getDesire());
        Assert.assertEquals(p.getAttributes().getEgo(), d.getEgo());
        Assert.assertEquals(p.getAttributes().getEndurance(), d.getEndurance());
        Assert.assertEquals(p.getAttributes().getEnergy(), d.getEnergy());
        Assert.assertEquals(p.getAttributes().getHandle(), d.getHandle());
        Assert.assertEquals(p.getAttributes().getHealth(), d.getHealth());
        Assert.assertEquals(p.getAttributes().getIntelligence(), d.getIntelligence());
        Assert.assertEquals(p.getAttributes().getLuck(), d.getLuck());
        Assert.assertEquals(p.getAttributes().getPerson(), d.getPerson());
        Assert.assertEquals(p.getAttributes().getShotSelection(), d.getShotSelection());
        Assert.assertEquals(p.getAttributes().getShotSkill(), d.getShotSkill());
        Assert.assertEquals(p.getAttributes().getSize(), d.getSize());
        Assert.assertEquals(p.getAttributes().getSpeed(), d.getSpeed());
        Assert.assertEquals(p.getAttributes().getStrength(), d.getStrength());
    }

    @Test
    public void ensureSkillSetsReturnExpected() {
    }


    private Date createNov71990() {
        Calendar cal = Calendar.getInstance();

        // set Date portion to January 1, 1970
        cal.set( cal.YEAR, 1990 );
        cal.set( cal.MONTH, cal.NOVEMBER );
        cal.set( cal.DATE, 7);
        return new Date(cal.getTime().getTime());
    }
}
