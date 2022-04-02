package midterm;

import java.util.Arrays;

public class Test {

    /**
     * create a method to return duplicates from an int Array
     */
     // accessmodifier static datatype/void name (userInpu){//code......return...}


    /**
     *
     *
     *
     *
     *
     *
     */
    public static int[] getDuplicates(int[] input){

        int count = 0;

        for (int i = 0; i<input.length-1; i++){
            for (int j = i+1; j<input.length; j++){
                if (input[i] == input[j]){
                    count++;
                }
            }
        }
        int[] duplicates = new int[count];

        int k=-1;

        for (int i = 0; i<input.length-1; i++){
            for (int j = i+1; j<input.length; j++){
                if (input[i] == input[j]){
                    k++;
                    duplicates[k]= input[j];
                }
            }
        }
        return duplicates;


    }




    /**
     * create a method to return duplicates from a String Array
     */

    public static String[] findDuplicates(String[] input){

        int count = 0;

        for (int i = 0; i<input.length-1; i++){
            for (int j = i + 1; j<input.length; j++){
                if (input[i] == input[j]){
                    count++;
                }
            }
        }

        String[] duplicates = new String[count];

        int k = -1;

        for (int i = 0; i<input.length-1; i++){
            for (int j = i + 1; j<input.length; j++){
                if (input[i] == input[j]){
                   k++;

                   duplicates[k] = input[j];
                }
            }
        }
        return duplicates;

    }















    /**
     * create a method to find missing numbers in an int Array
     */
    public static int[] getMissingNumbers(int[] numbers){

        int count = 0;

        int[] register = new int[numbers.length];

        for (int i : numbers){
            register[i] = 1;
        }
        //System.out.println(Arrays.toString(register));
        for (int i = 0; i < register.length; i++){
            if (register[i]==0){
                count++;
            }
        }
        //System.out.println(count);

        int[] missingNumbers = new int[count];

        int j =-1;

        for (int i = 0; i < register.length; i++){
            if (register[i]==0){
                j++;
                missingNumbers[j]=i;
                //System.out.println(i);
            }
        }

        return missingNumbers;



    }



}
