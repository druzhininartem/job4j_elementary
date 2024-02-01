package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumNumbersFrom0To5Then15() {
        int start = 0;
        int finish = 5;
        int sum = Counter.sum(start, finish);
        int expected = 15;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersFrom0To10Then55() {
        int start = 0;
        int finish = 10;
        int sum = Counter.sum(start, finish);
        int expected = 55;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersFrom0To100Then5050() {
        int start = 0;
        int finish = 100;
        int sum = Counter.sum(start, finish);
        int expected = 5050;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersFrom20To77Then2813() {
        int start = 20;
        int finish = 77;
        int sum = Counter.sum(start, finish);
        int expected = 2813;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersFrom5To0Then0() {
        int start = 5;
        int finish = 0;
        int sum = Counter.sum(start, finish);
        int expected = 0;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int sum = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom3To8Then18() {
        int start = 3;
        int finish = 8;
        int sum = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom1To1Then0() {
        int start = 1;
        int finish = 1;
        int sum = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom10To1Then0() {
        int start = 10;
        int finish = 1;
        int sum = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(sum).isEqualTo(expected);
    }
}