package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemain() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 900;

        int actual = cashback.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void boughtExactly1000() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;

        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}