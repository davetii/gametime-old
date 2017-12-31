package com.gametime.common;

import com.gametime.data.PlayerDataVO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.gametime.common.PlayerAttributes.PlayerDataToAttributes;
import static com.gametime.common.PlayerTestData.buildPlayerData;

public class PlayerAttributesUnitTest {
    PlayerDataVO d;
    @Before
    public void setup() {
        d = buildPlayerData();
    }

    @Test
    public void ensureAttributesReturnExpected() {
        PlayerAttributes a = PlayerDataToAttributes(d);
        assertAttribute(a.getAgility(), d.getAgility());
        assertAttribute(a.getCharisma(), d.getCharisma());
        assertAttribute(a.getDesire(), d.getDesire());
        assertAttribute(a.getEgo(), d.getEgo());
        assertAttribute(a.getEndurance(), d.getEndurance());
        assertAttribute(a.getEnergy(), d.getEnergy());
        assertAttribute(a.getHandle(), d.getHandle());
        assertAttribute(a.getHealth(), d.getHealth());
        assertAttribute(a.getIntelligence(), d.getIntelligence());
        assertAttribute(a.getLuck(), d.getLuck());
        assertAttribute(a.getPerson(), d.getPerson());
        assertAttribute(a.getShotSelection(), d.getShotSelection());
        assertAttribute(a.getShotSkill(), d.getShotSkill());
        assertAttribute(a.getSize(), d.getSize());
        assertAttribute(a.getSpeed(), d.getSpeed());
        assertAttribute(a.getStrength(), d.getStrength());
    }

    private void assertAttribute(int a, int b) {
        Assert.assertEquals(a, b);
    }
}
