package com.worldlinetest.perfectnumber;

import java.util.Scanner;

public class PerfectNumber {

    public static boolean numIsPerfect(int n)
    {
        //total stores the total sum of the divisors of the int n
        int total = 1;

        //Calculates all the divisors of the int n and adds them up to the int total

        for(int i = 2; i * i <= n; i++)
        {
            if(n % i == 0)
            {
                if(i * i != n)
                {
                    total = total + i + n / i;
                }
                else
                {
                    total = total + i;
                }
            }
        }

        //if both statements are true then int n is perfect and true is returned;
        //Otherwise int n isn't perfect and false is returned.
        return total == n && n != 1;
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("Do you want to: ");
        System.out.println("1. Check if number is perfect");
        System.out.println("2. Find every perfect number between two numbers");
        input = scanner.nextInt();
        if(input == 1) {
            System.out.println("Enter a number");
            input = scanner.nextInt();
            System.out.println(numIsPerfect(input));
        }
        else if(input == 2)
        {
            System.out.println("Enter the first number: ");
            int firstInt = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int secondInt = scanner.nextInt();

            System.out.println("All the perfect numbers between " + firstInt + " and " + secondInt);
            for(int i = firstInt; i < secondInt; i++)
            {
                if(numIsPerfect(i))
                {
                    System.out.println(i);
                }
            }
        }



    }
}
