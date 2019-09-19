/*
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.lang.Math;

public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         * Exercise 1.
         *
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */

		 final double inchToMM = 25.4;
		 final double width = 8.5;
		 final double height = 11;
		 double widthmm = width * inchToMM;
		 double heightmm = height * inchToMM;
		 double area = widthmm * heightmm;
		 System.out.println(String.format("\n%,.2f", area) + " square millimeters.");

        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */

		final double inchToCM = 2.54;
		double widthcm = width * inchToCM;
		double heightcm = height * inchToCM;
		double perimeter = (widthcm * 2) + (heightcm * 2);
		System.out.println(String.format("\n%.2f", perimeter) + " centimeters.");

        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */

		 double widthsquared = width * width;
		 double heightsquared = height * height;
		 double bignumber = widthsquared + heightsquared;
		 double diagonal = Math.sqrt(bignumber);
		 System.out.println(String.format("\n%.2f", diagonal) + " inches.");

        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */

		 final double homeworkweight = 0.15;
		 final double testweight = 0.5;
		 final double quizweight = 0.35;

		 int homework1 = 88;
		 int homework2 = 91;
		 int homework3 = 0;
		 double homework1percent = homework1 * homeworkweight;
		 double homework2percent = homework2 * homeworkweight;
		 double homework3percent = homework3 * homeworkweight;
		 double totalhomeworkpercent = (homework1percent + homework2percent + homework3percent) / 3;

		 int quiz1 = 84;
		 int quiz2 = 89;
		 int quiz3 = 93;
		 double quiz1percent = quiz1 * quizweight;
		 double quiz2percent = quiz2 * quizweight;
		 double quiz3percent = quiz3 * quizweight;
		 double totalquizpercent = (quiz1percent + quiz2percent + quiz3percent) / 3;

		 int test1 = 74;
		 int test2 = 87;
		 int test3 = 82;
		 double test1percent = test1 * testweight;
		 double test2percent = test2 * testweight;
		 double test3percent = test3 * testweight;
		 double totaltestpercent = (test1percent + test2percent + test3percent) / 3;

		 double finalgrade = totalhomeworkpercent + totalquizpercent + totaltestpercent;
		 System.out.println(String.format("\n%.2f", finalgrade) + "%.");

        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

		 final double wage = 12.50;
		 double monday = 7.5;
		 double tuesday = 8;
		 double wednesday = 10.5;
		 double thursday = 9.5;
		 double friday = 6;
		 double saturday = 11.5;
		 double sunday = 0;

		 double mondaymoney = monday * wage;
		 double tuesdaymoney = tuesday * wage;
		 double wednesdaymoney = wednesday * wage;
		 double thursdaymoney = thursday * wage;
		 double fridaymoney = friday * wage;
		 double saturdaymoney = saturday * wage;
		 double sundaymoney = sunday * wage;

		 double totalmoney = sundaymoney + mondaymoney + tuesdaymoney + wednesdaymoney + thursdaymoney + fridaymoney + saturdaymoney + sundaymoney;
		 System.out.println(String.format("\n$%.2f", totalmoney) + ".");

        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */



        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */



        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */



        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */



        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */



    }
}
