import org.junit.Test;


import static org.junit.Assert.*;

public class listPartitioningTests {

    @Test
    public void TestCase1() {
        int[] numbers = {3, 9, 5, -5};
        assertFalse(listPartitioning.isSubsetSumEqual(numbers));
    }

    @Test
    public void TestCase2() {
        int[] numbers = {1, 1, 3, 4, 7};
        assertTrue(listPartitioning.isSubsetSumEqual(numbers));
    }

    @Test
    public void TestCase3() {
        int[] numbers = {2, 3, 4, 6};
        assertFalse(listPartitioning.isSubsetSumEqual(numbers));
    }

    @Test
    public void TestCase4() {
        int[] numbers = {1, 5, 11, 5};
        assertTrue(listPartitioning.isSubsetSumEqual(numbers));
    }

    @Test
    public void TestCase5() {
        int[] numbers = {1, 5, 3};
        assertFalse(listPartitioning.isSubsetSumEqual(numbers));
    }

    @Test
    public void TestCase6() {
        int[] numbers = {1, 5, 3, 9};
        assertTrue(listPartitioning.isSubsetSumEqual(numbers));
    }

}
