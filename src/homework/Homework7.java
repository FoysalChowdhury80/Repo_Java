package homework;

public class Homework7 {
    // Due Date: Mar 27 2022



    public static void main(String[] args) {

        String statement = "happy birthday to you";
        String result = makeAbbreviation(statement);
        System.out.println("The abbreviation of the statement is..> "+result);

        String userInput = "HappY nEW YEAR to YoU dEAr";
        String statement2 = titlecase(userInput);
        System.out.println("The tile case of the statement is...> " + statement2);

        int[] numbers = {3466654,23, 54, 76, 12, 67, 90, 23, 170, 199769};
        int maximumValue = getMaximumValue(numbers);
        System.out.println("The maximum value in the Array is : "+maximumValue);

        String input = "Level";
        System.out.println("Is the given statement a Palindrome: "+isPlindrome(input));

        String[] inputStringArray ={"It is our duty to serve the nation unconditionally when it is needed","happy", "Happy new year", "peaceful", "we love you very much my friend" };
        String longestString = getLongestString(inputStringArray);
        System.out.println("The longest string in the Array is : "+longestString);

    }

    /**
     * Q1:
     * Create a method to make abbreviation for a given sentence
     * Method should return
     *
     * Questions to answer before creating a method:
     *  1. what is the purpose of the method?   -   makeAbbreviation
     *  2. do I need any input from user?   -   1 (String)
     *  3. should we return any value in the end of method? - Yes
     *      If yes, then what is the datatype of returned value? - String
     *
     */

    private static String makeAbbreviation(String inputString){

        String[] words = inputString.split(" ");
        String abbreviation ="";
        for (int i= 0; i< words.length; i++){
          abbreviation = abbreviation +  words[i].substring(0,1).toUpperCase();

        }
        System.out.println("*****Solution 01****");
        return abbreviation;
    }



    /**
     * Q2:
     * Create a method that will change the given sentence in Titlecase
     * Method should return
     *
     * HappY nEW YEAR to YoU dEAr -> Happy New Year To You Dear
     * gooD morNING -> Good Morning
     * make AMERICA GreAT AgAIn -> Make America Great Again
     *
     */

    private static String titlecase(String inputString){

        String titleString = "";
        String[] words = inputString.split(" ");
        for (int i=0; i< words.length; i++){
            titleString = titleString + words[i].substring(0,1).toUpperCase()+words[i].substring(1).toLowerCase()+ " ";
        }
        System.out.println("\n****Solution 02*****");
        return titleString;
    }






    /**
     * Q3:
     * Create method to find the maximum value from given int-array
     * Method should return
     *
     * int[] = {23, 54, 76, 12, 67, 90, 23}     ->  90
     *
     * int[] = {23, 54, 76, 12}     ->  76
     *
     * int[] = {-2, -9, -4, -7, -9, -55}     ->  -2
     *
     * Questions to answer before creating a method:
     *  1. what is the purpose of the method? - findMaxInArray
     *  2. do I need any input from user? - 1 (int[])
     *  3. should we return any value in the end of method? - yes
     *      If yes, then what is the datatype of returned value? - int
     *

     */


    private static int getMaximumValue(int[] inputArray){

        int maxNum = inputArray[0];
        for (int i = 0; i < inputArray.length; i++){
            for (int j = 0; j < inputArray.length; j++){
                if (inputArray[j] > inputArray[i]){
                    maxNum = inputArray[j];

                }

            }

        }
        System.out.println("\n****Solution 03*****");
        return maxNum;
    }





    /**
     * Q4:
     * Create a method to find if the given string is palindrome (DO NOT ignore case)
     * Method should return (boolean)
     *
     * "hello" -> "olleh"   (not palindrome)
     * "eye" -> "eye"       (palindrome)
     *
     *
     * "level" -> true
     * "eye" -> true
     * "fall" -> false
     * "Level" -> false
     * "eYe" -> true
     * Eye -> false
     */





    private static boolean isPlindrome(String inputString){

        String reverse = "";
        boolean isPalindrome = false;

        String[] letter = inputString.split("");
        for (int i = letter.length-1; i >= 0; --i){
            reverse = reverse + letter[i];
            if (reverse.toLowerCase().equals(inputString.toLowerCase())){
                isPalindrome = true;
            }
        }
        System.out.println("\n****Solution 04*****");
        return isPalindrome;
    }



    /**
     * Q5:
     * Create a method to find the longest String in the given String-array
     * Method should return (String)
     *
     * ["happy", "Happy new year", "peaceful" , "king kong"]    ->    "Happy new year"
     *
     * Questions to answer before creating a method:
     *  1. what is the purpose of the method? - findMaxString
     *  2. do I need any input from user? - 1 (String[])
     *  3. should we return any value in the end of method? - yes
     *      If yes, then what is the datatype of returned value? - String
     */

    private static String getLongestString(String[] inputArray){
        String longestString = "";
        for (int i = 0; i<inputArray.length; i++){
            for (int j=0; j<inputArray.length; j++){
                if (inputArray[j].length()>inputArray[i].length()){
                    longestString = inputArray[j];
                }
            }
        }
        System.out.println("\n****Solution 05*****");
        return longestString;
    }



}
