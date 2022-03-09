package homework;

import java.sql.SQLOutput;

public class Homework3 {

    public static void main(String[] args) {
        /**
         *
         * Due date: Mar 8 2022
         *
         * Refer for formula: https://www.rapidtables.com/convert/temperature/celsius-to-fahrenheit.html
         *
         * C -> F
         * C -> K
         *
         * F -> C
         * F -> K
         *
         * K -> C
         * K -> F
         *
         */




        /**
         * Conversion: Celsius to Farenheit
         * T(°F) = T(°C) × 9/5 + 32
         */

        double cesius  = 7;
        double farenheit = cesius * 9/5 +32;
        System.out.println("Converted temparature from Celsius to Farenheit is : " + farenheit+"˚");


        /**
         * Conversion: Celsius to Kelvin
         * T(K) = T(°C) + 273.15
         */


        double kelvin = cesius + 273.15;
        System.out.println("\nConverted temperature from Celsius to Kelvin is : " + kelvin+"˚");



        /**
         * Conversion: Farenheit to Celsius
         * T(°C) = (T(°F) - 32) × 5/9
         */

        cesius = (farenheit - 32) * 5/9;
        System.out.println("\nConverted temperature from Farenheit to Celsius is : " + cesius+"˚");


        /**
         * Conversion: Farenheit to Kelvin
         * T(K) = (T(°F) + 459.67)× 5/9
         */

        kelvin = (farenheit + 459.67) * 5/9;
        System.out.println("\nConverted temperature from Farenheit to Kelvin is : " + kelvin+"˚");


        /**
         * Conversion: Kelvin to Celsius
         * T(°C) = T(K) - 273.15
         */

        cesius = (kelvin) - 273.15;
        System.out.println("\nConverted temperature from Kelvin to Celsius is : " + cesius+"˚");

        /**
         * Conversion: Kelvin to Farenheit
         * T(°F) = T(K) × 9/5 - 459.67
         */

        farenheit = (kelvin) * 9/5 - 459.67;
        System.out.println("\nConverted temperature from Kelvin to Farenheit is : " + farenheit+"˚");










    }
}
