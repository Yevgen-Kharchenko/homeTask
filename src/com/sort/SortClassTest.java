package com.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortClassTest {

    @org.junit.jupiter.api.Test
    public void testSort() {
        long[] arr = {3,1,2};
        long[] expected = {1,2,3};
        assertArrayEquals(expected, SortClass.sort(arr));
    }

}