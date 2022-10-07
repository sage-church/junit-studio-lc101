package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsContainingTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Testing this method]"));
    }

    @Test
    public void bracketsReversedReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void unbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void stringInArrayFormatReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[1, 2, 3]"));
    }

    @Test
    public void arrayOfArraysReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[1], [2], [3]]"));
    }

    @Test
    public void balancedCurlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{}"));
    }

    @Test
    public void unbalancedCurlyBrcketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{{}"));
    }

    @Test
    public void balancedMixOfBracketTypesReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[}"));
    }

    @Test
    public void objectNotationReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{key1: value1, key2: value2}"));
    }

    @Test
    public void arrayOfObjectsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[{key: value}, {key: value}, {key: value}]"));
    }

    @Test
    public void unclosedArrayReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[one, two, three"));
    }

}
