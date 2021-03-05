package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        long [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(purchases);

        assertEquals(expected,actual);
    }

    @Test
    void shouldCalcAverageSum() {
        StatsService service = new StatsService();
        long [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calcAverageSum(purchases);

        assertEquals(expected,actual);
    }

    @Test
    void shouldCalcMaxMonth() {
        StatsService service = new StatsService();
        long [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.calcMaxMonth(purchases);

        assertEquals(expected,actual);
    }

    @Test
    void shouldCalcMinMonth() {
        StatsService service = new StatsService();
        long [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.calcMinMonth(purchases);

        assertEquals(expected,actual);
    }

    @Test
    void shouldCalcMonthAverageSumMin() {
        StatsService service = new StatsService();
        long [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calcMonthAverageSumMin(purchases);

        assertEquals(expected,actual);
    }

    @Test
    void shouldCalcMonthAverageSumMax() {
        StatsService service = new StatsService();
        long [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calcMonthAverageSumMax(purchases);

        assertEquals(expected,actual);
    }
}