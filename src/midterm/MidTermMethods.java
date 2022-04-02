package midterm;

import java.util.Arrays;

public class MidTermMethods {

    /**
     * Ques-1:
     * Create a method to return an int-array after sorting a given input-int-array
     * points: 10
     */
    /*
     *
     * eg:
     * input -> [32, 54, 12, 67, 2, 5]
     * returned array -> [2, 5, 12, 32, 54, 67]
     *
     * input -> [5, 4, 3, 1, 2]
     * returned array -> [1, 2, 3, 4, 5]
     *
     * input -> [90, 34, 12, 4]
     * returned array -> [4, 12, 34, 90]
     *
     * int[] inputArr = {32, 54, 12, 67, 2, 5};
     * int[] outputArr = sortArray(inputArr);   // {2, 5, 12, 32, 54, 67}
     *
     * int[] inputArr = {5, 4, 3, 1, 2};
     * int[] outputArr = sortArray(inputArr);   // {1, 2, 3, 4, 5}
     */



    public static int[] getSortedArray(int[]  inputarray){
        int temp = 0;



        for (int i =0; i<inputarray.length; i++){
            for (int j = i+1; j<inputarray.length; j++){
                if (inputarray[i]>inputarray[j]){
                    temp = inputarray[i];
                    inputarray[i]= inputarray[j];
                    inputarray[j]=temp;
                    temp++;



                }
            }
        }
        System.out.println("\nSolution1");


        return inputarray;
    }


    /**
     * Ques-2:
     * Create a method to return the sum of digits in input-int-value
     * points: 20
     */
    /*
     *
     * eg:
     * input -> 123
     * returned value -> 6  (1 + 2 + 3)
     *
     * input -> 323
     * returned value -> 8  (3 + 2 + 3)
     *
     * input -> 90
     * returned value -> 9  (9 + 0)
     *
     * int result1 = addDigits(123);    // result1 = 6
     *
     * int result2 = addDigits(575);    // result2 = 17
     *
     *
     *
     */

    public static int sumOfDigits(int input){
        String convertedString = Integer.toString(input);
        String[] stringDigits = convertedString.split("");
       // String sum = "";
        int sumOfDigits = 0;
        for (int i = 0; i<stringDigits.length; i++){
            sumOfDigits = sumOfDigits+Integer.parseInt(stringDigits[i]);


        }
        System.out.println("\nSolution2");
        return sumOfDigits ;

    }
    /**
     * Ques-3:
     * Create a method to return an int-array after removing input-int-value from an input-int-array
     * points: 30
     */
    /*
     *
     * eg:
     * input -> 23, {23, 54, 67, 12, 34, 23, 56}
     * returned array -> {54, 67, 12, 34, 56}
     *
     * input -> 5, {23, 5, 67, 87, 10, 5, 34, 98, 66, 55}
     * returned array -> {23, 67, 87, 10, 34, 98, 66, 55}
     *
     * input -> 11, {22, 33, 44, 55}
     * returned array -> {22, 33, 44, 55}
     *
     *
     * int[] inputArr = {23, 54, 67, 12, 34, 23, 56};
     * int[] outputArr = removeValueFromArray(23, inputArr);    // {54, 67, 12, 34, 56}
     *
     * int[] inputArr2 =  {23, 5, 67, 87, 10, 5, 34, 98, 66, 55}
     * int[] outputArr2 = removeValueFromArray(5, inputArr2);    // {23, 67, 87, 10, 34, 98, 66, 55}
     *
     */


    public static int[] getRemovalInt (int[] inputArray, int value){
        int count = 0;

        int[] newArr= null;


        for (int i = 0; i < inputArray.length-1; i++) {
            if(inputArray[i] == value){
                newArr = new int[inputArray.length - 1];
                for(int index = 0; index < i; index++){
                    newArr[index] = inputArray[index];
                }
                for(int j = i; j < inputArray.length - 1; j++){
                    newArr[j] = inputArray[j+1];
                }
                break;
            }
        }
        System.out.println("\nSolution3");
        return newArr;
    }







    /**
     * Ques-4:
     * Create a method to print the common Strings values in two input-String-arrays
     * points: 40
     * Note: two input-String-arrays can be of same size or different size
     */
    /*
     *
     * eg:
     * input -> {"happY", "king", "peace", "living standard"} , {"king kong", "Happy", "PEACE"}
     * Method should print ->
     * happy
     * peace
     *
     * input -> {“ab”, “abcd”, “abc”, “abcde”, “defg”, "koli”} , {“abcde”, “jhuy”, “plot”, “koli”}
     * Method should print ->
     * abcde
     * koli
     *
     * String[] inputArr1 = {"happY", "king", "peace", "living standard"};
     * String[] inputArr2 = {"king kong", "Happy", "PEACE"};
     *
     * printCommons(inputArr1, inputArr2);
     * happy
     * peace
     *
     *
     * String[] inputArr3 = {“ab”, “abcd”, “abc”, “abcde”, “defg”, "koli”};
     * String[] inputArr4 = {“abcde”, “jhuy”, “plot”, “koli”};
     *
     * printCommons(inputArr3, inputArr4);
     * abcde
     * koli
     *
     *
     *
     */



    public static void printCommonStrings (String[] arr1, String[] arr2){
        System.out.println("\nSolution4");
        System.out.println("Common Strings of the both arrays are following");
        for (int i = 0; i<arr1.length; i++){
            for (int j = 0; j<arr2.length; j++){
                if (arr2[j].equalsIgnoreCase(arr1[i])){
                    System.out.println(arr2[j]);

                }
            }
        }

    }

    public static void main(String[] args) {

        int[] inputArr = {32, 54, 12, 67, 2, 5};
        System.out.println("The sorted array is: "+ Arrays.toString(getSortedArray(inputArr)));

        int input= 123;
        System.out.println("Sum of digits of given int value is: "+ sumOfDigits(input));

        int[] inputArr2 =  {23, 5, 67, 87, 10, 5, 34, 98, 66, 55};
        System.out.println("After removing value new array is: "+Arrays.toString(getRemovalInt(inputArr2,5)));

        String[] inputArr1 = {"happY", "king", "peace", "living standard"};
        String[] inputArr3 = {"king kong", "Happy", "PEACE"};
        printCommonStrings(inputArr1,inputArr3);






    }




}
