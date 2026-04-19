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




        //Display Question 3 using sout
        System.out.println("Question 3:");
        // radius of circle is given float and the math is area = pi * r^2
        double radius = 7.25;
        //diameter = Math.pow(radius, 2) and area = Math.PI * diameter;
        double area = (Math.pow(radius, 2)) * Math.PI;
        // display answer
        System.out.println("The area of the circle is " + Math.round(area));

    }
}
