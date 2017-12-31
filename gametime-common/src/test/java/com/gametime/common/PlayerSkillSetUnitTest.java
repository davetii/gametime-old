package com.gametime.common;

import org.junit.Assert;
import org.junit.Test;

public class PlayerSkillSetUnitTest {

    private PlayerSkillSet s;

    @Test
    public void ensureAcumenReturnsExepcted() {
        PlayerAttributes acumenFive = PlayerTestData.buildAcumenOfFive();
        Assert.assertEquals(s.calcAcumen(acumenFive), 5d, 0d);
    }

    @Test
    public void ensureAcumenReturnsExepcted2() {
        PlayerAttributes acumenFive = PlayerTestData.buildHighAcumen();
        Assert.assertEquals(s.calcAcumen(acumenFive), 12d, 0d);
    }


}
