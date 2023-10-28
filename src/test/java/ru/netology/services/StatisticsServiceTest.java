
package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StatisticsServiceTest {

    @Test
    void testMoneysCase1() {
        StatisticsService service = new StatisticsService();

        int expected = 3;

        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void testMoneyCase2() {
        StatisticsService service = new StatisticsService();

        int expected = 2;

        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource (files = "src/test/resources/data_test.csv")
        public void testParams(int income, int expenses, int threshold, int expected){
        StatisticsService service = new StatisticsService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
        }
}