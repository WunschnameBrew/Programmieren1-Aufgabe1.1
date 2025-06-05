import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUebungenTest {

    @Test
    void getSum() {
        int[] vals = new int[] {1,7,9,3};
        assertEquals(20, ArrayUebungen.getSum(vals));
        vals = new int[] {};
        assertEquals(0, ArrayUebungen.getSum(vals));
    }

    @Test
    void getSum_2d() {
        int[][] vals = new int[][] { {1,8,7,2}, {2, 2, 1}};
        assertEquals(23, ArrayUebungen.getSum(vals));
        vals = new int[][] { {}, {2, 2, 1}};
        assertEquals(5, ArrayUebungen.getSum(vals));
    }

    @Test
    void concatenate() {
        int[] arr1 = new int[] {1,5,2};
        int[] arr2 = new int[] {7, 3};
        assertArrayEquals(new int[] {1, 5, 2, 7, 3}, ArrayUebungen.concatenate(arr1, arr2));
        arr2 = new int[] {};
        assertArrayEquals(new int[] {1, 5, 2}, ArrayUebungen.concatenate(arr1, arr2));
    }

    @Test
    void filter() {
        int[] arr = new int[] {1, 5, 2, 9, 4, 0, 12, 3};
        assertArrayEquals(new int[] {5, 9, 4, 3}, ArrayUebungen.filter(arr, 3, 10));
    }
}