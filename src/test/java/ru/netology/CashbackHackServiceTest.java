package ru.netology;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void findRemain() {
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findRemainFromMinAmount() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findRemainFromMaxAmount() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
}
