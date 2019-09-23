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

		 final double INCH_TO_MM = 25.4;
		 final double WIDTH = 8.5;
		 final double HEIGHT = 11;
		 double widthMM = WIDTH * INCH_TO_MM;
		 double heightMM = HEIGHT * INCH_TO_MM;
		 double area = widthMM * heightMM;
		 System.out.printf("\n%,.2f square millimeters.\n", area);

        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */

		final double INCH_TO_CM = 2.54;
		double widthCM = WIDTH * INCH_TO_CM;
		double heightCM = HEIGHT * INCH_TO_CM;
		double perimeter = (widthCM * 2) + (heightCM * 2);
		System.out.printf("\n%.2f centimeters.\n", perimeter);

        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */

		 double widthSquared = WIDTH * WIDTH;
		 double heightSquared = HEIGHT * HEIGHT;
		 double bigNumber = widthSquared + heightSquared;
		 double diagonal = Math.sqrt(bigNumber);
		 System.out.printf("\n%.2f inches.\n", diagonal);

        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */

		 final double HOMEWORK_WEIGHT = 0.15;
		 final double QUIZ_WEIGHT = 0.35;
		 final double TEST_WEIGHT = 0.5;

		 int homework1 = 88;
		 int homework2 = 91;
		 int homework3 = 0;
		 double homework1Percent = homework1 * HOMEWORK_WEIGHT;
		 double homework2Percent = homework2 * HOMEWORK_WEIGHT;
		 double homework3Percent = homework3 * HOMEWORK_WEIGHT;
		 double totalHomeworkPercent = (homework1Percent + homework2Percent + homework3Percent) / 3;

		 int quiz1 = 84;
		 int quiz2 = 89;
		 int quiz3 = 93;
		 double quiz1Percent = quiz1 * QUIZ_WEIGHT;
		 double quiz2Percent = quiz2 * QUIZ_WEIGHT;
		 double quiz3Percent = quiz3 * QUIZ_WEIGHT;
		 double totalQuizPercent = (quiz1Percent + quiz2Percent + quiz3Percent) / 3;

		 int test1 = 74;
		 int test2 = 87;
		 int test3 = 82;
		 double test1Percent = test1 * TEST_WEIGHT;
		 double test2Percent = test2 * TEST_WEIGHT;
		 double test3Percent = test3 * TEST_WEIGHT;
		 double totalTestPercent = (test1Percent + test2Percent + test3Percent) / 3;

		 double finalgrade = totalHomeworkPercent + totalQuizPercent + totalTestPercent;
		 System.out.printf("\n%.2f%%.\n", finalgrade);

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

		 double mondayMoney = monday * wage;
		 double tuesdayMoney = tuesday * wage;
		 double wednesdayMoney = wednesday * wage;
		 double thursdayMoney = thursday * wage;
		 double fridayMoney = friday * wage;
		 double saturdayMoney = saturday * wage;
		 double sundayMoney = sunday * wage;

		 double totalMoney = sundayMoney + mondayMoney + tuesdayMoney + wednesdayMoney
		   + thursdayMoney + fridayMoney + saturdayMoney + sundayMoney;
		 System.out.printf("\n$%.2f.\n", totalMoney);

        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */

		 final double YEARLY_SALARY = 117000;
		 final double FEDERAL_TAX = 0.24;
		 final double STATE_TAX = 0.0637;
		 final double FOUR01K = 0.07;
		 double taxableSalary = YEARLY_SALARY / 24;

		 double moneyForFOUR01K = taxableSalary * FOUR01K;
		 taxableSalary = taxableSalary - moneyForFOUR01K;

		 double moneyForFed = taxableSalary * FEDERAL_TAX;
		 taxableSalary = taxableSalary - moneyForFed;

		 double moneyForState = taxableSalary * STATE_TAX;
		 taxableSalary = taxableSalary - moneyForState;

		 System.out.printf("\n$%,.2f.\n", taxableSalary);

        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */

		 final int STUDENTS = 273;
		 final int TEACHERS = 28;
		 final int BUS_CAPACITY = 54;

		 int totalPeople = STUDENTS + TEACHERS;
		 int lastBusNum = totalPeople % BUS_CAPACITY;
		 double peoplePerBus = ((double)totalPeople) / ((double)BUS_CAPACITY);
		 double numOfBuses = Math.ceil(peoplePerBus);

		 System.out.printf("\n%.0f buses are needed, with %d passengers on the last bus.\n", numOfBuses, lastBusNum);

        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */

		 // Use a constant to represent the length of the board.
		 // Use a constant to represent the width of the board.
		 // Use a constant to represent the diameter of the hole.
		 // Round the square inches to two decimals.
		 // Format the square inches with separating commas.

		 final int CORNHOLE_LENGTH = 48;
		 final int CORNHOLE_WIDTH = 24;
		 final int CORNHOLE_DIAMETER = 6;

		 int radius = CORNHOLE_DIAMETER / 2;
		 int cornholeArea = CORNHOLE_WIDTH * CORNHOLE_LENGTH;
		 double cornholeHoleArea = Math.PI * radius * radius;
		 double finalCornholeArea = cornholeArea - cornholeHoleArea;

		 System.out.printf("\n%,.2f square inches.\n", finalCornholeArea);

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
