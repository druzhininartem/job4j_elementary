package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenManHeight180ThenWeight92() {
        short input = 180;
        double expected = 92.0;
        double output = Fit.manWeight(input);
        assertThat(output).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenManHeight160ThenWeight69() {
        short input = 160;
        double expected = 69.0;
        double output = Fit.manWeight(input);
        assertThat(output).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenWomanHeight170ThenWeight69() {
        short input = 170;
        double expected = 69.0;
        double output = Fit.womanWeight(input);
        assertThat(output).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenWomanHeight150ThenWeight46() {
        short input = 150;
        double expected = 46.0;
        double output = Fit.womanWeight(input);
        assertThat(output).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenManHeight200Then115() {
        short input = 200;
        double expected = 115.0;
        double output = Fit.manWeight(input);
        assertThat(output).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenWomanHeight190Then92() {
        short input = 190;
        double expected = 92.0;
        double output = Fit.womanWeight(input);
        assertThat(output).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenManHeight100Then0() {
        short input = 100;
        double expected = 0.0;
        double output = Fit.manWeight(input);
        assertThat(output).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenWomanHeight110Then0() {
        short input = 110;
        double expected = 0.0;
        double output = Fit.womanWeight(input);
        assertThat(output).isCloseTo(expected, within(0.01));
    }
}