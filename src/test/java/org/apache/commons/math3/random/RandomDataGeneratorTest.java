package org.apache.commons.math3.random;
public class RandomDataGeneratorTest {
    public static void main(String args[])
    {
        // create instance of Random class
        RandomDataGenerator rand = new RandomDataGenerator();

        // Generate random integers in range 0 to 999
        int rand_int1 = rand.nextInt(1,100);
        int rand_int2 = rand.nextInt(1,100);

        // Print random integers
        System.out.println("Random Integers: "+rand_int1);
        System.out.println("Random Integers: "+rand_int2);

        // Generate Random doubles
        // Print random doublesr
        double rand_lon1 = rand.nextLong(10000,19999);

        System.out.println("Random Doubles: "+rand_lon1);
        //double rand_lon2 = rand.nextLong(5,3);

        //System.out.println("Random Doubles: "+rand_lon2);
    }

}
