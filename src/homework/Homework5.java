package homework;

import java.util.Arrays;

import static java.lang.System.*;

public class Homework5 {
    public static void main(String[] args) {

        // Due date: Sunday Mar 20
        /**
         * Q1:
         * Store a country name in a variable.
         * Print the name of country
         * Print the length of country name (NOTE: you CANNOT use length()-method from String class)
         *
         * Hint: you need to use split() method and length-variable (from Array)
         */

        System.out.println(".............Home Work 5............");
        System.out.println("\n01");

        String country = "Bangladesh";
        System.out.println("\nName of country is " + country);

        String[] letters = country.split("");
        int lengthOf_String = letters.length;
        System.out.println("Number of letters in country name " + country + " is: " + lengthOf_String);


        /**
         * Q2:
         * Print the number of words in the sentence2-value
         */

        System.out.println("\n 02");
        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";

        String[] words = sentence2.split(" ");
        int numberOf_Words = words.length;
        System.out.println("\nNumber of words of sentence2 is " + numberOf_Words);


        /**
         * Q3:
         * Create the abbreviation for 4-word sentence
         *
         * make America great again -> MAGA
         * outfit of the day -> OOTD
         * happy birthday to you -> HBTY
         *
         * hint: split, charAt, toUppercase
         *      split, subString, toUppercase
         *
         */


        /**
         * We need to have word separately
         * first letter of every word
         * make them uppercase letter
         * add them together
         */
        System.out.println("\n 03");


        String sentence3 = "outFit OF the DAY";
        String[] wordsOf_Sentence3 = sentence3.split(" ");
        String firstLetterOf_FirstWord = wordsOf_Sentence3[0].substring(0, 1).toUpperCase();
        String firstLetterOfthe_SecondWord = wordsOf_Sentence3[1].substring(0, 1).toUpperCase();
        String firstLetterOfThe_ThirdWord = wordsOf_Sentence3[2].substring(0, 1).toUpperCase();
        String firstLetterOfThe_fourthWord = wordsOf_Sentence3[3].substring(0, 1).toUpperCase();

        String abbreviation = firstLetterOf_FirstWord + firstLetterOfthe_SecondWord +
                firstLetterOfThe_ThirdWord + firstLetterOfThe_fourthWord;

        System.out.println("\nThe abbreviation of sentence3 is " + abbreviation);

        //another way

        System.out.println("\n......Another Way using for loop........");

        String sentence4 = "happy birthday to you";
        String[] words_Sentence4 = sentence4.split(" ");

        String abb_sentence4 = "";

        for (int i = 0; i < words_Sentence4.length; i++) {
            abb_sentence4 = abb_sentence4 + words_Sentence4[i].substring(0, 1).toUpperCase();
        }

        System.out.println("\nAbbreviation of sentence 4 is : " + abb_sentence4);


        /**
         * Q4:
         * Create an int-variable and store any value in it
         * if the value is divisible by 5, print "divisible by 5"
         * if the value is divisible by 3, print "divisible by 3"
         * if the value is divisible by 5 and 3, print "divisible by 5 and 3"
         * if the value is NOT divisible by 5 and 3, print "NOT divisible by 5 and 3"
         *
         * int num = 32
         */


        System.out.println("\n04");

        int num = 32;

        if (num % 5 == 0) {
            System.out.println("\ndivisible by 5");
        } else if (num % 3 == 0) {
            System.out.println("\ndivisible by 3");
        } else if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("\ndivisible by 5 and 3");
        } else {
            System.out.println("\nNot divisible by 5 and 3");
        }


        /**
         * Q5:
         * Create two variables to store student-score and max-score (max score a student can get)
         * based on student percentage, print the grade:
         *
         * 91-100%      -> Grade A
         * 81-90.99%    -> Grade B
         * 71-80.99%    -> Grade C
         * 61-70.99%    -> Grade D
         * below 60.99% -> Grade E
         *
         * double studentScore = -5 (studentScore <= maxScore)
         * int maxScore = -1 (maxScore > 0)
         *
         * (studentScore/maxScore)*100 = 92.2
         *
         * Your grade = A, percentage = 92.2
         * if student-score is invalid, print "Invalid student score entered"
         * if max-score is invalid,  print "Invalid max score entered"
         *
         */

        System.out.println("\n05");

        double studentScore = 85.5;
        int maxScore = 100;
        double avgScore = (studentScore / maxScore) * 100;

        //We roled out negative scoring thats why put studentScore >= 0 this condition


        if (studentScore >= 0 && studentScore <= maxScore && maxScore > 0) {

            if (avgScore >= 91 && avgScore <= 100) {
                System.out.println("\nStudent Grade is 'A'");
            } else if (avgScore >= 81 && avgScore <= 90.00) {
                System.out.println("\nStudent Grade is 'B'");
            } else if (avgScore >= 71 && avgScore <= 80.99) {
                System.out.println("\nStudent Grade is 'C'");
            } else if (avgScore >= 61 && avgScore <= 70.99) {
                System.out.println("\nStudent Grade is 'D'");
            } else if (avgScore <= 60.99) {
                System.out.println("Student Grade is 'E'");
            }
        } else {
            System.out.println("Invalid score");
        }

        /**
         * Q6:
         * String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live" , "give", "living standard", "life"}
         * print the values which has length greater than 5 and starts with l
         *
         * expected ans:
         * learning
         * living standard
         *
         */

        System.out.println("\n06");
        String[] words_N = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live" , "give", "living standard"};

        /**
         * Need to get words
         * Have to check all words in which lengthg is greater than five and sarts with l
         *
         */


        for (int i = 0; i < words_N.length; i++){
            if (words_N[i].length() > 5
                              &&
               words_N[i].toLowerCase().startsWith("l".toLowerCase())){
                System.out.println("\nWords that starts with 'l' and has more than Five letters are : "+words_N[i]);
            }
        }


    }
}






