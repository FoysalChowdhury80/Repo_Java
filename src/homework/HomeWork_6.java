package homework;

public class HomeWork_6 {

    public static void main(String[] args) {

        /**
         * Q1:
         * Create the abbreviation
         *
         * make America great again -> MAGA
         * Good Morning -> GM
         * happy birthday to you dear friend -> HBTYDF
         * hEllo -> H
         * Air ballon -> AB
         *
         *
         * hint: split, charAt, toUppercase
         *      split, subString, toUppercase
         *
         */



        System.out.println("\n.......Homework 6.........");
        System.out.println("\n.......01.........");
        String sentence1 = "happy birthday to you dear friend ";

        String[] words =  sentence1.split(" ");
        String abbreviation = "";

        for (int i= 0; i<words.length; i++){
            abbreviation = abbreviation + words[i].substring(0,1).toUpperCase();
        }
        System.out.println("\nAbbreviation of the statement is: " + abbreviation);



        /**
         * Q2:
         * Reverse the given String
         *
         * make america great again -> again great america make
         * good Morning -> Morning good
         * learn -> learn
         * happy birthday to you -> you to birthday happy
         *
         */

        System.out.println("\n.......02.........");
        String statement = "make america great again";
        String[] words1 = statement.split(" ");

        String reverse = "";

        for (int i = words1.length-1; i>= 0; --i){
            reverse = reverse + words1[i]+ " ";
        }
        System.out.println("\nReverse string is: " + reverse);



        /**
         * Q3:
         * Convert the String value in to Titlecase
         *
         * make america great again -> Make America Great Again
         * gOOd morNING -> Good Morning
         * learn -> Learn
         * happy birTHday TO yOu -> Happy Birthday To You
         *
         */



        System.out.println("\n.......03.........");

        String statement2 = "make america great again";
        String[] words_Statement2 = statement2.split(" ");
        String titleCase = "";

        for (int i = 0; i < words_Statement2.length; i++){
            titleCase = titleCase + words_Statement2[i].substring(0,1).toUpperCase()+
                    words_Statement2[i].substring(1).toLowerCase()+ " ";
        }
        //System.out.println(Arrays.toString(words_Statement2));

        System.out.println("\nThe titlecase is : " + titleCase);




        /**
         * Q4:
         * Find the minimum value from the given array
         *
         * int[] numbers = {-1, 1};     ->  -1
         * int[] numbers = {1, 21, 87, 23};     -> 1
         * int[] numbers = {87, 23, 89, 0, 54, 23}; -> 0
         */


        System.out.println("\n.......04.........");
        int[] numbers = {87, 23, 89, 0, 54, 23};
        int min = numbers[0];

        for (int i= 0; i<numbers.length; i++){
            if (numbers[i]< min){
                min = numbers[i];
            }
        }
        System.out.println("\n The Minimum value is : " +min);



    }
}
