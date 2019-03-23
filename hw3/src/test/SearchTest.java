package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import program.PrintPrimes;

public class SearchTest {

    private PrintPrimes p;
    @Before
    public void setUp() throws Exception {
    	p= new PrintPrimes();
    }


    @Test
    public void test1() {
        p.printPrimes(5);
    }

}