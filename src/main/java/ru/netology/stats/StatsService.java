package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum = sum + purchase;
        }
        return sum;
    }

    public long calcAverageSum(long[] purchases) {
        long averageSum = calculateSum(purchases) / purchases.length;
        return averageSum;
    }

    public long calcMaxMonth(long[] purchases) {
        long max = purchases[0];
        long monthMax = 0;
        for (long purchase : purchases) {
            if (max < purchase) {
                max = purchase;
            }
        }
        long month = 0;
        for (long purchase : purchases) {
            month++;
            if (max == purchase) {
                monthMax = month;
            }
        }
        return monthMax;
    }

    public long calcMinMonth(long[] purchases) {
        long min = purchases[0];
        long monthMin = 0;
        for (long purchase : purchases) {
            if (min > purchase) {
                min = purchase;
            }
        }
        long month = 0;
        for (long purchase : purchases) {
            month++;
            if (min == purchase) {
                monthMin = month;
            }
        }
        return monthMin;
    }

    public long calcMonthAverageSumMin(long[] purchases) {
        long monthCount = 0;
        for (long purchase : purchases) {
            if (purchase > calcAverageSum(purchases)) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public long calcMonthAverageSumMax(long[] purchases) {
        long monthCount = 0;
        for (long purchase : purchases) {
            if (purchase < calcAverageSum(purchases)) {
                monthCount++;
            }
        }
        return monthCount;
    }
}