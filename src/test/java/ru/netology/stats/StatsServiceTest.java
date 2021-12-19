package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(180, service.calculateSum(purchases));
    }

    @Test
    void shouldCalcAverageSum() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(15, service.calcAverageSum(purchases));
    }

    @Test
    void shouldCalcMaxMonth() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(8, service.calcMaxMonth(purchases));
    }

    @Test
    void shouldCalcMinMonth() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(9, service.calcMinMonth(purchases));
    }

    @Test
    void shouldCalcMonthAverageSumMin() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(5, service.calcMonthAverageSumMin(purchases));
    }

    @Test
    void shouldCalcMonthAverageSumMax() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(5, service.calcMonthAverageSumMax(purchases));
    }
}