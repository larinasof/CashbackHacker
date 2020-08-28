package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {
    public CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainIfPaymentBoundary() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainIfPaymentLessThanBoundary() {
        int amount = 500;

        int actual = service.remain(amount);
        int expected = 500;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainIfPaymentZero() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(expected, actual);
    }
}