package homework;

import javax.sound.midi.Soundbank;

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


        /**
         *
         * 1.Create a String variable and assign value 'I am a Good progRammer'
         * 2. Find the length of the String
         * 3. Check the String contains 'Am'
         * 4. Convert the String to TitleCase
         * 5. Find the Index of 'am'
         * 6. Does the Sring ends with 'er'?
         * 7. Find the number of words in the String.
         *
         */

        System.out.println("\n\n.....Practice......");

        String sentence2 = "I am a Good progRammer";
        int lengthOfSentence2 = sentence2.length();

        System.out.println("\nLength of sentence2 is " + lengthOfSentence2);


        String contains_am = "Am";
        boolean doesSentence2Contain_Am = sentence2.toLowerCase().contains(contains_am.toLowerCase());

        System.out.println("\nSentence2 contain 'am' is " + doesSentence2Contain_Am);

        String titleCaseSentence2 = sentence2.substring(0,1).toUpperCase()+sentence2.substring(1).toLowerCase();
        System.out.println(titleCaseSentence2);

        String istringndex_am = "am";
        int index_am = sentence2.toLowerCase().indexOf(istringndex_am.toLowerCase());
        System.out.println(index_am);

        String ends_er = "er";
        boolean endsWith_er = sentence2.toLowerCase().endsWith(ends_er.toLowerCase());
        System.out.println(endsWith_er);

        String[] words = sentence1.split(" ");
        int noOfWords = words.length;
        System.out.println(noOfWords);


        /**
         * name of school is "Plank North Elementary School"
         * there is five classes in that school
         * My daughtrer studies in grade 2
         * Grade 2 has 20 students.
         * Michelle, Juliana, Jacob, Landon are some good friends of my daughter
         * Their teacher said if there is no rain tomorrow they will go outside
         *   or if it is snowing they will wear snow suit
         *       otherwise they will play indoor
         *
         */

        System.out.println("...Exercise.....");

        String nameOfSchool = "Plank North Elementary School";
        System.out.println("Name of school is: "+ nameOfSchool);
        int numberOFClass = 5;
        System.out.println("number of classes are :"+numberOFClass);

        String myDaughterClass = "grade2";
        System.out.println("My daughter reads in " + myDaughterClass);


        boolean isRaining = true;
        boolean isSnowing = true;

        if (isRaining==false){
            System.out.println("Student will go outside");
        }else if (isSnowing==false){
            System.out.println("Student will wear snowsuit and go outside");
        }else{
            System.out.println("Student will play indoor");
        }


        /**
         * find how many friends mahdiya has
         * List friends name starts with J
         *
         */








        /**
         * Create a method that will return names ends with a and b from the given array
         * String[] friendsOfMyDaughter = {"Michelle", "Juliana", "Jacob", "Landon"};
         *
         */


        String[] friendsOfMyDaughter = {"Michelle", "Juliana", "Jacob", "Landon"};

        for (int i=0; i< friendsOfMyDaughter.length; i++){
            if (friendsOfMyDaughter[i].toLowerCase().endsWith("a".toLowerCase())
                    || friendsOfMyDaughter[i].toLowerCase().endsWith("b".toLowerCase())){

                System.out.println(friendsOfMyDaughter[i]);
            }


        }
















        /**
         * List first Letters of all names and make them upper case
         */

        String firstLetter = "";

        for (int i=0; i< friendsOfMyDaughter.length; i++){
            firstLetter = firstLetter +friendsOfMyDaughter[i].substring(0,1).toUpperCase()+",";
        }

        System.out.println(firstLetter);

        /**
         * Arrange friend list in reverse order
         */













































    }
}
