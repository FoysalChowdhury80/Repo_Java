package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Homework9 {


    public static void main(String[] args) {

            ArrayList<String> names = new ArrayList<>();
            names.add("Happy");         //  ["Happy"]
            names.add("GroW");          //  ["Happy", "GroW"]
            names.add("LeaRN");         //  ["Happy", "GroW", "LeaRN"]
            names.add("PeaCEfUL");      //  ["Happy", "GroW", "LeaRN", "PeaCEfUL"]
            names.add("Learning");      //  ["Happy", "GroW", "LeaRN", "PeaCEfUL", "Learning"]
            names.add("HAPPy");
            names.add("Growing");
            names.add("ListeN");
            names.add("PEACE");
            names.add("King KONG");
            names.add("happiness");
            names.add("greeN");
            names.add("SkiLLS");
            names.add("PRICELeSs");
            names.add("Health");
            names.add("NEW");
            names.add("LAUgh");
            names.add("QUeeN");
            names.add("YouNG");
            names.add("OLD");
            names.add("HAPPy");
            names.add("Growing");
            names.add("ListeN");
            names.add("PEACE");
            names.add("King KONG");
            names.add("happiness");
            names.add("greeN");
            names.add("SkiLLS");
            names.add("PRICELeSs");
            names.add("Health");
            names.add("NEW");
            names.add("LAUgh");
            names.add("King KONG");
            names.add("happiness");
            names.add("greeN");
            names.add("SkiLLS");
            names.add("PRICELeSs");
            names.add("Health");
            names.add("NEW");
            names.add("LAUgh");


            //System.out.println(names.size());

            // getCount("HAppY", names); should return 3
            // getCount("JAVA", names); should return 0



            // getContainsCount("HAp", names);  should returns 6
            // getContainsCount("A", names);  should returns 17


        int countOfString = getCount("happy", names );
        System.out.println("The given String is repeated in the list "+countOfString+ " times");


        int containsCount = getContainsCount("new", names);
        System.out.println("The given String is containing in the string values :" + containsCount+ " times");
        int[] inputArr2 =  {23, 55,5, 67, 87, 10, 5, 34, 98, 66, 55};

        System.out.println("After removing value from int array, the removal array is: "+Arrays.toString( removalArray(55,inputArr2)));





        }

        /**
         * Q1:
         *  Create method that will count (and return) the number of times a given String (ignoring the case) is present in given ArrayList
         *  name : getCount
         *  inputs : 2 (String, ArrayList<String>)
         *  return type : int
         */

        public static int getCount(String valToCheck, ArrayList<String> arr){
            System.out.println("\n*******01*********");

            int count = 0;

            for (int i = 0; i < arr.size(); i++){
                if (valToCheck.equalsIgnoreCase(arr.get(i))){
                    count++;
                }
            }
            return count;
        }




        /**
         * Q2:
         *  Create method that will return the number of ArrayList-values contains the given String (ignoring the case)
         *  name : getCount
         *  inputs : 2 (String, ArrayList<String>)
         *  return type : int
         */

        public static int getContainsCount(String valToCheck, ArrayList<String> arrayList) {
            System.out.println("\n*******02*********");
            int count = 0;

            for (int i= 0; i < arrayList.size(); i++){
                if (arrayList.get(i).toLowerCase().contains(valToCheck.toLowerCase())){
                    count++;
                }
            }
            return count;

        }

        /**
         * Q3:
         * Create a method to return an int-array after removing input-int-value from an input-int-array
         *
         * -> How to create List using Array and vice-versa
         *
         * create a List using values of input-int-array
         * remove the input-int-value from List
         * create an int-array using List-values
         * return int-array
         *
         */

        public static int[] removalArray (int value, int[] inputArray){
            System.out.println("\n*******03*********");

            List<Integer> convertedList = IntStream.of(inputArray).boxed().collect(Collectors.toList());

           for (int i = 0; i<convertedList.size(); i++){
               if (value== convertedList.get(i)){
                   convertedList.remove(i);
               }
           }

            int[] removal = convertedList.stream().mapToInt(Integer::intValue).toArray();

            return removal;

        }


    }

