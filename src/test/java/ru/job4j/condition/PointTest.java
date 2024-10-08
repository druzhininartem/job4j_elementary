package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double result = a.distance(b);
        double expected = 2;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus10toMinus20then1() {
        Point a = new Point(-1, 0);
        Point b = new Point(-2, 0);
        double result = a.distance(b);
        double expected = 1;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus2Minus2toMinus2Minus2then0() {
        Point a = new Point(-2, -2);
        Point b = new Point(-2, -2);
        double result = a.distance(b);
        double expected = 0;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when67to910then4Dot24() {
        Point a = new Point(6, 7);
        Point b = new Point(9, 10);
        double result = a.distance(b);
        double expected = 4.24;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when000to222then3Dot46() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 2, 2);
        double result = a.distance3d(b);
        double expected = 3.46;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when123to456then5Dot2() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double result = a.distance3d(b);
        double expected = 5.2;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus1Minus2Minus3to1Minus1Minus1then3() {
        Point a = new Point(-1, -2, -3);
        Point b = new Point(1, -1, -1);
        double result = a.distance3d(b);
        double expected = 3;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

}