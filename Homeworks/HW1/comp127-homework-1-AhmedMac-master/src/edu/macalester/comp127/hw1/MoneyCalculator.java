package edu.macalester.comp127.hw1;

import java.util.Scanner;

public class MoneyCalculator {
    /**
     * Takes in user integer input, a dollar amount, and returns the most efficient way of organizing
     * that dollar amount in physical bills and coins. The user can either continue the program by
     * entering Y or N if they would like to quit.
     **/
    public static void main(String [] args){
        String userAnswer = "";
        Scanner scan = new Scanner(System.in);
        while (!(userAnswer.equals("N"))){

            System.out.println("How many dollars do you have ? ");

            double totalCents = scan.nextDouble() * 100;

            int tenBills = (int) Math.floor(totalCents / 1000);
            totalCents -= tenBills * 1000;
            int fiveBills = (int) Math.floor(Math.floor(totalCents/ 500));
            totalCents -= fiveBills * 500;
            int singleBills = (int) Math.floor(totalCents / 100);
            totalCents -= singleBills * 100;
            int quarters = (int) Math.floor(totalCents / 25);
            totalCents -= quarters * 25;
            int dimes = (int) Math.floor(totalCents / 10);
            totalCents -= dimes * 10;
            int nickels = (int) Math.floor(totalCents / 5);
            totalCents -= nickels * 5;
            int pennies = (int) Math.floor(totalCents / 1);
            totalCents -= pennies;

            if (tenBills > 1){
                System.out.println(tenBills + " ten dollar bills");
            }
            else{
                System.out.println(tenBills + " ten dollar bill");
            }
            if (fiveBills > 1){
                System.out.println(fiveBills + " five dollar bills");
            }
            else{
                System.out.println(fiveBills + " five dollar bill");
            }
            if (singleBills > 1){
                System.out.println(singleBills + " one dollar bills");
            }
            else{
                System.out.println(fiveBills + " one dollar bill");
            }
            if (quarters > 1){
                System.out.println(quarters + " quarters");
            }
            else{
                System.out.println(quarters + " quarter");
            }
            if (dimes > 1){
                System.out.println(dimes + " dimes");
            }
            else{
                System.out.println(dimes + " dime");;
            }
            if (nickels > 1){
                System.out.println(nickels + " nickels");
            }
            else{
                System.out.println(nickels + " nickel");
            }
            if (pennies > 1){
                System.out.println(pennies + " pennies");
            }
            else {
                System.out.println(pennies + " penny");
            }

            System.out.println("Would you like to calculate another dollar amount? Enter Y or N :  ");
            userAnswer = scan.next();

        }
    }
}
