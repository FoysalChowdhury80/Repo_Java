package midtermsolution;

import java.util.Arrays;

public class CorrectedSolution3 {

    public static int[] removalArray (int[] input, int number){
        int count = 0;
        for (int i = 0; i<input.length; i++){
            if (input[i]==number){
                count++;
            }
        }
        System.out.println("Corrected solution for Solution3");

        int[] newArray = new int[input.length-count];
        //System.out.println(Arrays.toString(newArray));
        int k =-1;

        for (int i = 0; i<input.length; i++){
            if (input[i]!=number){
                k++;
                newArray[k]=input[i];
            }
        }
        return newArray;

    }

    public static void main(String[] args) {
        int[] inputArr2 =  {23, 5, 67, 87, 10, 5, 34, 98, 66, 55};
        System.out.println("Array after removing input '5' from given Array : " +Arrays.toString(removalArray(inputArr2,5)));
    }


}
