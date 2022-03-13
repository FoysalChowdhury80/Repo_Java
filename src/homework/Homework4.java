package homework;

public class Homework4 {
    public static void main(String[] args) {

        /**
         * Due date: Mar 13 (Sunday)
         */

        /**
         * Task -1
         * using Ternary operator assign value to int-variable
         *
         * Variable -> result1
         * if the length of sentence1-String is greater or equals to 5
         *      value in result1 should be 10
         * else
         *      value in result should be 15
         *
         * print:
         *      value of sentence1
         *      length of sentence1
         *      value of result1
         *
         *
         */


        String sentence1 = "We live in New York";
        System.out.println("\n'Task-1'\nSentence1--> "+ sentence1);

        int lengthOfSentence1 = sentence1.length();
        System.out.println("\nLength of Sentence1--> " + lengthOfSentence1);

        int result1 = lengthOfSentence1 >= 5 ? 10 : 15;
        System.out.println("\nWhen the length of the statement is greater than or equal to 5, than the result is " + result1);




        /**
         * Task - 2
         *
         * Create a String Variable and store your full name in it.
         * Print the following values:
         *  1. length of your full name
         *  2. check if your name ends with "a" (ignore the case)
         *  3. check if your name contains with "a" (ignore the case)
         *
         */


        String myFullName = "Foysal Chowdhury";
        int lengthOfFullName = myFullName.length();
        System.out.println("\n\'Task-2' \nLength of my full name is: " + lengthOfFullName);

        boolean doesNameEndswith_a = myFullName.toLowerCase().endsWith("a".toLowerCase());
        System.out.println("\nDoes my name ends with 'a'? " + doesNameEndswith_a);

        boolean doesMyNameContains_a = myFullName.toLowerCase().contains("a".toLowerCase());
        System.out.println("\nDoes my name contains 'a'? " + doesMyNameContains_a );




        /**
         * Print the results for:
         *  1. task3-value contains "king" (ignore cases)
         *  2. index of first occurrence of "EW" (ignore cases)
         *
         */

        String task3 = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";
        String toCompare = "king";
        boolean doesContain = task3.toLowerCase().contains(toCompare.toLowerCase());
        System.out.println("\n'Task-3' \nDoes the statement contains 'king' "+ doesContain);

        String indexOf_EW = "EW";
        int eW_Index = task3.toLowerCase().indexOf(indexOf_EW.toLowerCase());
        System.out.println("\nThe index of first occurrence of 'EW' is: " + eW_Index);





        /**
         * Convert the value in task4 variable into Titlecase
         *      (FirstCharacterUppercase and rest all in lowercase)
         *
         * "kINg" -> "King"
         * "QUEEN" -> "Queen"
         */

        String task4 = "kINg";
        String taskFourtoLowerCase = task4.toLowerCase();
        String toTitlecase = taskFourtoLowerCase.substring(0,1).toUpperCase() + taskFourtoLowerCase.substring(1);
        System.out.println("\n'Task-4' \nThe titlecase of task 4 is: " + toTitlecase);





    }
}
