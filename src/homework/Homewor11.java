package homework;

import java.util.*;

public class Homewor11 {
    /**
     *
     * Due Date: April-16 2022
     *
     * Question-1:
     * Create a HashMap with
     *      Integer as key and
     *      String as value
     *
     *  { (101 = "HAppy") , (102 = "King") , (103 = "HAPPY") , (104 = "live") , (105 = "Happy"), (106 = "Live") }
     *
     *  Create a method that will take the HashMap<Integer, String> as Input
     *  print the keys with common values (ignoring cases)
     *
     *      "Happy" is present with keys = 101, 103, 105
     *      "Live" is present with keys = 104, 106
     *
     *  { (101 = "HAppy") , (102 = "King") , (103 = "HAPPiness") , (104 = "life") , (105 = "king and queen"), (106 = "Live") }
     *  When no keys are having common values, method should print,
     *      "No keys have common values"
     *
     *
     */


    public static void getCommonValuesWithKeys(Map<Integer, String> inputMap) {

        System.out.println("***Solution01****");

        Set<Integer> allkeys = inputMap.keySet();
        Set<Integer> commonValueKeys = new HashSet<>();
        Map<String, String> output = new HashMap<>();

        for (Integer key : allkeys) { // key = 102
            commonValueKeys.clear();
            for (Integer innerKey : allkeys) {  // innerKey = 101, 103, 104, 105, 106
                if(!key.equals(innerKey) && inputMap.get(key).equalsIgnoreCase(inputMap.get(innerKey))) {
                    commonValueKeys.add(key);
                    commonValueKeys.add(innerKey);
                }
            }
            if (commonValueKeys.size() > 0) {
                output.put(inputMap.get(key).toUpperCase(), commonValueKeys.toString());
            }
        }
        if (output.size() > 0) {
            Set<String> commonKeys = output.keySet();
            for (String commonKey : commonKeys) {
                System.out.println(commonKey + " is present with keys = " + output.get(commonKey));
            }
        } else {
            System.out.println("No keys have common values");
        }


    }

/**
 * Question-2:
 *
 * String[] colorNames = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
 *             "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
 *             "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
 *             "green", "green"};
 *
 *
 * Create a method that will return the name(s) of color appearing max number of times in the array.
 */

    public static Map<String, Integer> findDuplicateWordWithCount(String[] words) {
        System.out.println("***Solution02****");
        Map<String, Integer> duplicateCount = new HashMap<>();

        for (int i=0 ; i < words.length ; i++) {
            if (!duplicateCount.containsKey(words[i])) {
                int count = 1;
                for (int j=i+1 ; j < words.length ; j++) {
                    if (words[j].equalsIgnoreCase(words[i])) {
                        count++;
                    }
                }
                if (count > 1) {
                    duplicateCount.put(words[i], count);
                }
            }
        }
        return duplicateCount;
    }

    public static Set<String> getColorMaxTimes(String[] colors) {


        Map<String, Integer> colorCount = findDuplicateWordWithCount(colors);


        Collection<Integer> allColorCount = colorCount.values();
        Integer maxValue = 0;

        for (Integer value : allColorCount) {
            if (value > maxValue) {
                maxValue = value;
            }
        }


        Set<String> allColorNames = colorCount.keySet();
        Set<String> maxColor = new HashSet<>();

        for (String colorName : allColorNames) {
            if (colorCount.get(colorName) == maxValue) {
                maxColor.add(colorName);
            }
        }

        return maxColor;
    }


    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Deepak");
        studentMap.put(2, "Imam");
        studentMap.put(3, "deepak");
        studentMap.put(4, "Philip");
        studentMap.put(5, "philip");
        studentMap.put(6, "Fara");
        studentMap.put(7, "Robin");

        getCommonValuesWithKeys(studentMap);

        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green","red","red","red","red","red","red"};
        System.out.println(getColorMaxTimes(arr));
    }
}
