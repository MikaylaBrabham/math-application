package com.pluralsight;


import static java.lang.Math.*;

public class MathApp {
    public static void main(String[] args) {

        // given system
        // Question 1:
        //declare variables
        //code solution
        //use sout display
        // sout "the answer is " + answer


        // notes:
            // code legible and meaningful
            // comment and line spacing to sep each question
            // meaningful comment name and messages so user has all context

        //repeat next exercise



        // Display Question 1:
        System.out.println("Question 1: ");

        // create variable for bob salary in float bobSalary
        //initial salary variables any value using system input and output
       float bobSalary = 82000;

        // create variable for gary salary in float garySalary
        //initial salary variables any value using system input and output
        float garySalary = 67500;

        // create variable called highestSalary
        float highestSalary;

        // do math using Math.Max to determines who salary is higher; stored in highestSalary
        highestSalary = Math.max(bobSalary, garySalary);

        // the math here is average = (a + b) / 2

        // display highestSalary using "The highest salary is " + highestSalary
        System.out.println("The highest salary is $" + highestSalary + ", which belongs to Bob!");


    //Display Question 2 using sout
        System.out.println("Question 3:");

        // set variable for price of the car
        double carPrice = 24123.89;

        // set variable for price of the truck
        double truckPrice = 38000.25;

        //complete comparison to get cheapest option
        double cheapestValue = min(carPrice, truckPrice);

        // display smallest value of the two variables
        System.out.println("The car has the cheapest value of " + Math.round(cheapestValue) + ".");



        //Display Question 3 using sout
        System.out.println("Question 3:");

        // radius of circle is given float and the math is area = pi * r^2
        double radius = 7.25;

        //diameter = Math.pow(radius, 2) and area = Math.PI * diameter;
        double area = (Math.pow(radius, 2)) * Math.PI;

        // display answer
        System.out.println("The area of the circle is " + Math.round(area));


        //display question 4
        System.out.println("Question 4:");

        //display given variable information of 5.0 float
        double givenVariable = 5.0;
        // complete math for square root and assign variable
        double squareRootGivenVar = Math.sqrt(givenVariable);
        //display square root of variable in a sentence
        System.out.println(" The square root of the given variable is "
                + Math.round(squareRootGivenVar) + "." );


        //display question 5
        System.out.println("Question 5:");
        // create variables for the first given points
        double aPointX = 5, aPointY = 10;
        // create variables for the second given points
        double bPointX = 85, bPointY = 50;
        // Math to get the distance using Math.power & math.Power and put into variable totalDistance
        //start first part of math (x2-x1)^2 + (y2 - y1)^2
        double differenceTotal = (Math.pow(bPointX - aPointX, 2)) + Math.pow(bPointY - aPointY, 2);
        // square roots the first part
        double totalDistance = Math.round(Math.sqrt(differenceTotal));

        // display total distance
        System.out.println("The total distance between the two given points are "
                + totalDistance + ".");


        // display question 6
        System.out.println("Question 6:");

        // create variable for given variable
       double myGivenNumber = -3.8;

       // create a variable to store math to get positive absolute value
        double positiveAbsolute = Math.abs(myGivenNumber);

        //display the result
        System.out.println("The positive absolute value for the given value -3.8 is " +
                positiveAbsolute + ".");


        //display question 7
        System.out.println("Question 7:");
        //create a variable for random number and add math
        double myRandom = random();
        // display the random value
        System.out.println("The random value I received was " + myRandom + ".");

        //display question 8
        System.out.println("Question 8:");
        // create variables for amount milliseconds in seconds
        long seconds = 60;
        // create variables for amount seconds in minute
        long minutes = 60;
        // create variables for amount minutes in hour
        long hour = 60;
        // create variables for amount hours in a day
        long day = 24;
        //create variable for the given amount of days
        long givenDay = 24;
        // do math to get amount minutes in 24 days and store in new variable
        long minutesInDay = (day * minutes) * givenDay;
        //display total minutes in 24 days
        System.out.println("There are " + minutesInDay + (" minutes in 24 days!"));
        //display amount milliseconds in 24 days
        long milliSecondDays = (seconds * 1000 * minutesInDay);
        //display amount milliseconds in 24 days
        System.out.println("There are " + milliSecondDays + " Milliseconds in 24 days!");


    }
}
