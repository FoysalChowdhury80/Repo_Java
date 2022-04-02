package homework;

import java.util.Arrays;

public class LabClass_Fara {

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


        public static String getStudentGrade (double inputStScore, int inputMax){

            String studentGrade ="";

            double avg = (inputStScore/inputMax)*100;

            if (inputStScore >= 0 && inputStScore <= inputMax && inputMax> 0){
                if (avg >= 91 && avg<= 100){
                    studentGrade+= "A";
                }else if (avg >= 81 && avg<= 90.99){
                    studentGrade =studentGrade+ "B";
                }else if (avg >= 71 && avg<= 80.99){
                    studentGrade =studentGrade+ "C";
                }else if (avg >= 61 && avg<= 70.99) {
                    studentGrade = studentGrade + "D";
                }else if (avg <= 60.99) {
                    studentGrade = studentGrade + "E";
                }
            }else {
                studentGrade = studentGrade+ "Invalid Grade";
            }
            return studentGrade;

        }


    public static void main(String[] args) {

        System.out.println(getStudentGrade(91,100));
        int[] numbers ={1, 1, 2, 4,6};
        System.out.println(Arrays.toString(getDuplicates(numbers)));
        System.out.println("\n" +Arrays.toString(getMissingNumbers(numbers)));



    }

    /**
     * find duplicate numbers in an Array
     */

    private static int[] getDuplicates (int[] inputArray) {
        int count = 0;

        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = i+1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    count++;
                }
            }
        }

        int[] duplicates = new int[count];

        int k = -1;

        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = i+1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    k++;
                    duplicates[k] = inputArray[j];
                }
            }


        }
        return duplicates;
    }






    /**
     * Create a method to return an int Array by finding missing numbers in an int Array
     * int[] numbers ={1, 2, 3,2,4,7, 4, 5, 7, 9, 11}    //6,8,10
     */


    private static int[] getMissingNumbers (int[] inputArray){

        int count = 0;

        int[] register = new int[inputArray.length];

       for (int i : inputArray){
           register[i] = 1;
       }
       // System.out.println(Arrays.toString(register));
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

    /**
     *
     *
     * Array in ascending order
     * Array in descending order
     *
     */

    /**
     * Create a method to return a String[] with values endsWith "a" and "b"
     *
     */









































}
