package com.worldlinetest.perfectnumber;

import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Random;

public class PerfectNumberTest {
    PerfectNumber perfectNumber = new PerfectNumber();

    @Test
    public void testSingleNumIsPerfectTrue() {

        int[] perfectNumArray = {6, 28, 496, 8128, 33550336};

        for(int i : perfectNumArray)
        {
            assertTrue(perfectNumber.numIsPerfect(i));
        }

    }

    @Test
    public void testSingleNumIsPerfectFalse(){
        int[] numArray = {4, 7, 200, 5021, 5400543};
        for(int i : numArray)
        {
            assertFalse(perfectNumber.numIsPerfect(i));
        }
    }



    @Test
    public void testPerfectNumberInRange(){
        Random rand = new Random();
        int firstNum = rand.nextInt(0, 30);
        int secondNum = rand.nextInt(firstNum, 10000);
        System.out.println(firstNum);
        System.out.println(secondNum);
        ArrayList<Integer> perfectNums = new ArrayList<>();
        perfectNums.add(6);
        perfectNums.add(28);
        perfectNums.add(496);
        perfectNums.add(8128);

        for(int i = firstNum; i < secondNum; i++)
        {
            //assertFalse(perfectNumber.numIsPerfect(i));
            if(perfectNumber.numIsPerfect(i))
            {
                assertTrue(perfectNums.contains(i));
            }
        }
    }



}