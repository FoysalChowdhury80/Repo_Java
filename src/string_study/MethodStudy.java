package string_study;

import java.util.Arrays;

public class MethodStudy {

    /**
     * Create a method that will return names ends with a and b from the given array
     * String[] friendsOfMyDaughter = {"Michelle", "Juliana", "Jacob", "Landon"};
     *
     */

    public static String[] names(String[] inputArrray, String checkingEnd1, String checkingEnd2){

        int count = 0;
        String[] newNames = new String[inputArrray.length-count];
        for (int i =0; i<inputArrray.length; i++){
            if (inputArrray[i].toLowerCase().endsWith(checkingEnd1.toLowerCase()) &&
            inputArrray[i].toLowerCase().endsWith(checkingEnd2)){
                count++;
                newNames[inputArrray.length-count] = inputArrray[i];


            }
        }
        return newNames;
    }


    public static void main(String[] args) {
        String[] friendsOfMyDaughter = {"Michelle", "Juliana", "Jacob", "Landon"};
        String str1 = "a";
        String str2 = "b";
        System.out.println(Arrays.toString(names(friendsOfMyDaughter,str1,str2)));
    }
}
