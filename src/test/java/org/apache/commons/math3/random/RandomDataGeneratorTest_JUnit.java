package org.apache.commons.math3.random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RandomDataGeneratorTest_JUnit {

    // create instance of Random class
    RandomDataGenerator rand = new RandomDataGenerator();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void nextInt() {
        // Generate random integers in range 0 to 999
        int rand_int1 = rand.nextInt(1,100);
        int rand_int2 = rand.nextInt(1,100);
        assertTrue(rand_int1>1);
        assertTrue(rand_int1<100);
        assertTrue(rand_int2>1);
        assertTrue(rand_int2<100);
        // Print random integers
        System.out.println("Random Integers: "+rand_int1);
        System.out.println("Random Integers: "+rand_int2);
    }

    @Test
    public void nextLong() {
        double rand_lon1 = rand.nextLong(10000,19999);

        assertTrue(rand_lon1>10000);
        assertTrue(rand_lon1<19999);
        System.out.println("Random Doubles: "+rand_lon1);

       // double rand_lon2 = rand.nextLong(5,3);
       // System.out.println("Random Doubles: "+rand_lon2);
    }
}