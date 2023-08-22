package com.algo.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PlusOneTest {

    @Test
    void plusOne() {
        int origin1[] = {0};
        int result1[] = {1};

        int origin2[] = {9};
        int result2[] = {1,0};

        int origin3[] = {1,2,3};
        int result3[] = {1,2,4};

        int origin4[] = {1,2,9};
        int result4[] = {1,3,0};

        int origin5[] = {4,3,2,1};
        int result5[] = {4,3,2,2};

        assertArrayEquals(result1,PlusOne.plusOne(origin1));
        assertArrayEquals(result2,PlusOne.plusOne(origin2));
        assertArrayEquals(result3,PlusOne.plusOne(origin3));
        assertArrayEquals(result4,PlusOne.plusOne(origin4));
        assertArrayEquals(result5,PlusOne.plusOne(origin5));

    }

    @Test
    void plusOne2() {
        int origin1[] = {0};
        int result1[] = {1};

        int origin2[] = {9};
        int result2[] = {1,0};

        int origin3[] = {1,2,3};
        int result3[] = {1,2,4};

        int origin4[] = {1,2,9};
        int result4[] = {1,3,0};

        int origin5[] = {4,3,2,1};
        int result5[] = {4,3,2,2};

        assertArrayEquals(result1,PlusOne.plusOne(origin1));
        assertArrayEquals(result2,PlusOne.plusOne(origin2));
        assertArrayEquals(result3,PlusOne.plusOne(origin3));
        assertArrayEquals(result4,PlusOne.plusOne(origin4));
        assertArrayEquals(result5,PlusOne.plusOne(origin5));

    }
}
