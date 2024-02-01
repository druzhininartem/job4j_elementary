package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void sumOut0to5() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void sumOut0to10() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void sumOut0to100() {
        int start = 0;
        int finish = 100;
        int expected = 5050;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void sumOut20to77() {
        int start = 20;
        int finish = 77;
        int expected = 2813;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void sumOut5to0() {
        int start = 5;
        int finish = 0;
        int expected = 0;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }
}