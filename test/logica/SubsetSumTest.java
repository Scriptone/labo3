package logica;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * AUTHOR: Van Hecke
 * DATE: 12/10/2023
 * PROJECT: labo3
 **/
class SubsetSumTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Test 1")
    void Test1() {
        int[] getallen = { 3, 7, 21, 21, 41, 18, 9, 22, 32, 8, 17, 24, 34 };
        boolean result = SubsetSum.subsetSum(getallen, 37, 0, 0, new int[getallen.length]);
        assertTrue(result);
    }

    @Test
    @DisplayName("Test 2")
    void Test2() {
        int[] getallen = { 4, 5, 3, 8, 2, 9 };
        boolean result = SubsetSum.subsetSum(getallen, 15, 0, 0, new int[getallen.length]);
        assertTrue(result);
    }

    @Test
    @DisplayName("Test 3")
    void Test3() {
        int[] getallen = { 12, 10, 2, 7, 4 };
        boolean result = SubsetSum.subsetSum(getallen, 11, 0, 0, new int[getallen.length]);
    }


    @Test
    @DisplayName("Test 4")
    void Test4() {
        int[] getallen = { 15, 12, 3, 8, 7 };
        boolean result = SubsetSum.subsetSum(getallen, 9, 0, 0, new int[getallen.length]);
        assertFalse(result);
    }

    @Test
    @DisplayName("Test 5")
    void Test5() {
        int[] getallen = { 15, 12, 3, 7, 7 };
        boolean result = SubsetSum.subsetSum(getallen, 12, 0, 0, new int[getallen.length]);
        assertTrue(result);
    }
}