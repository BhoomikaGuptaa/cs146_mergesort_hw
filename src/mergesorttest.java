import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
// testing 
public class mergesorttest {
    @Test
    public void testCase1() { // test merging two sorted arrays of the same length 
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, mergesort.merge(a, b));
    }

    @Test
    public void testCase2() { // test merging when the first array is empty and the second array is non empty
        int[] a = {};
        int[] b = {1, 2, 3};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, mergesort.merge(a, b));
    }

    @Test
    public void testCase3() { // test merging when the second array is empty and the first array is not empty 
        int[] a = {1, 2, 3};
        int[] b = {};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, mergesort.merge(a, b));
    }

    @Test
    public void testCase4() {
        int[] a = {-5, -1, 0};
        int[] b = {-3, 2};
        int[] expected = {-5, -3, -1, 0, 2};
        assertArrayEquals(expected, mergesort.merge(a, b));
    }

    @Test
    public void testCase5() { // test merging when the second array is empty and the first array is not empty 
        int[] a = {};
        int[] b = {};
        int[] expected = {};
        assertArrayEquals(expected, mergesort.merge(a, b));
    }
}

