package homework;

import java.lang.reflect.Array;
import java.util.*;

public class Homework10 {
    public static void main(String[] args) {
        String[] inputStringArray = {"happy", "Happy new year", "happy", "peaceful", "we love you very much my friend"};

        System.out.println("There is duplicates present: "+isDuplicatePresent(inputStringArray));

        String[] names = {"abc", "abc", "DEF", "ABC", "XYZ", "def"};
        System.out.println("The duplicates values are: "+duplicates(names));


    }


    /**
     * Question-1:
     * Create a method that can return if a given-String-Array has duplicate values or not.
     * <p>
     * Input: String-Array
     * Return type: boolean
     * <p>
     * <p>
     * <p>
     * create String-List using given-String-Array
     * create a String-Set using String-List
     * compare size of Set and List
     */

    public static boolean isDuplicatePresent(String[] inputArray) {
        System.out.println("\n******01********");
        boolean isDuplicatePresent = false;

        List<String> values = new ArrayList<>();
        for (String val : inputArray) {
            values.add(val);
        }


        Set<String> setValues = new HashSet<>(values);


        if (values.size() != setValues.size()) {
            isDuplicatePresent = true;
        }
        return isDuplicatePresent;

    }


    /**
     * Question-2:
     * Create a method that would return the duplicate values of given-String-array (ignore the case)
     *
     * Input: String-Array
     * Return type:     (one of these -> Array, List, Set)
     *
     *
     * String[] names = {"abc" , "abc" , "DEF", "ABC", XYZ", "def"}
     *
     * "abc", "def"
     */



    public static Set<String> duplicates (String[] values){
        System.out.println("\n******01********");

        Set<String> duplicates = new HashSet<>();
        for (int i = 0; i<values.length-1; i++){
            for (int j= i+1; j<values.length; j++ ){
                if (values[i].equalsIgnoreCase(values[j])){
                    duplicates.add(values[i]);

                }
            }
        }
        return duplicates;
    }


}









