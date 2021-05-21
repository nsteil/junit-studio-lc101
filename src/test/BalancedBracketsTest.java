package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void bracketNestIsTrue(){

        assertTrue(BalancedBrackets.hasBalancedBrackets("({[{}]})"));
    }

    @Test
    public void bracketsNestIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("{{[}}}"));
    }

    @Test
    public void twoBalancedWords(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Banana] [Bread]"));
    }

    @Test public void twoWordsDifferntBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{Pancake} [Waffle]"));
    }

    @Test
    public void facingAway(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]][["));
    }

    @Test
    public void noBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("no brackets"));
    }

    @Test
    public void bracketsConcatenated(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[this is test" + " 8 billion]]"));
    }

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void concatAPair(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[" + " ]"));
    }

    @Test
    public void subSomeCurlys(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]{]"));
    }

    @Test
    public void lotsOfBracketPairs() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[This is] m[y long]est tes[t] yet [but] i th[in]k its fine[]"));
    }
}
