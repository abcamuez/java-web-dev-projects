package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void LaunchCodeReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void launchCodeAlsoReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void launchCodeWithBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void emptyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void hasNoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void hasTwoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void hasOneBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void hasJustOneBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void hasJustTwoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));
    }

}