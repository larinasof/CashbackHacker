package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    public CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainIfPaymentBoundary() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainIfPaymentLessThanBoundary() {
        int amount = 500;

        int actual = service.remain(amount);
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainIfPaymentZero() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }
}