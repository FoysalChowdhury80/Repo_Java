package homework;

public class HomeWork1 {
    public static void main(String[] args) {
        /**
         *
         * Due: Mar 6 (Sunday)
         *
         * Store values for below scenario in an appropriate variable, and print the same in Console.
         *  1. number of hours in a day
         *  2. max no. of days in an year
         *  3. total number of employees in an organization
         *  4. Population in a country
         *  5. Mortgage rate
         *  6. Balance in an bank account
         *  7. does the sun rise from the West?
         *  8. Initials of your name (Use: char)    // My initials are DS
         *  9. Store your full name (Use: String)
         */
        /**
         * byte, short, long, int , double, int, char, String, boolean
         *
         * Syntax: dataType varName = value;
         */

        /**
         * 1. number of hours in a day
         */

        byte hoursInADay = 24;
        System.out.println("There are "+hoursInADay +" hours in a day.");


        /**
         * 2. max no. of days in an year
         */
        short daysInAYear = 365;
        System.out.println("\nThere are "+ daysInAYear +" days in an year.");

        /**
         *  3. total number of employees in an organization
         */

        byte employeesInOrganization = 100;
        System.out.println("\nWe have "+ employeesInOrganization +" employees in our organization.");

        /**
         * 4. Population in a country
         */

        int populationUSA = 332403650;
        System.out.println("\nThe total population of USA is "+populationUSA+".");

        /**
         * 5. Mortgage rate
         */

        double mortgageRate = 2.50;
        System.out.println("\nMy morgtgage rate is: "+mortgageRate+".");

        /**
         * 6. Balance in an bank account
         */

        double balance = 890.50;
        System.out.println("\nThe balance of bank account is "+balance+".\n");

        /**
         * 7. does the sun rise from the West?
         */

        boolean doesSunRiseFromWest = false;
        System.out.println("Sun rises from the West is a "+doesSunRiseFromWest+ " statement.\n");


        /**
         * 8. Initials of your name (Use: char)    // My initials are FC
         */

        char firstLetterFirstName = 'F';
        char firstLetterLastName = 'C';

        System.out.println("My initials are "+firstLetterFirstName+firstLetterLastName+".\n");

        /**
         * 9. Store your full name (Use: String)
         */

        String myFullName = "Foysal Chowdhury";
        System.out.println("My full name is "+ myFullName+".\n");




    }
}
