package ifElse;

public class IfElseDay2 {
    public static void main(String[]args) {
        int day1 = 1;
        int day2 = 2;
        int day3 = 3;
        int day4 = 4;
        int day5 = 5;
        int day6 = 6;
        int day7 = 7;

        if (day1 == 1) {
            System.out.println("Monday");

            String day0fWeek = "Thursday";
            System.out.println("Thusday");
            if (day0fWeek == "Thursday") {
                System.out.println("4");
            } else if (day0fWeek == "4") {
                System.out.println("Thursday");


                byte time1 = 18;
                byte time2 = 9;
                byte time3 = 17;
                byte time4 = 19;


                if (time2 == time3) {
                    System.out.println("WORK HOURS");
                } else if (time1 == time4) {
                    System.out.println("COMMUTE HOURS");
                }


            }
        }



                    int day = -3;

        /*
        day = 1 print Monday
        day = 2 print Tuesday
        ...
        day = 7 print sunday

        if number is not in range from 1 to 7, print Invalid day
         */

                    if (day == 1){
                        System.out.println("Monday!");
                    }
                    else if (day == 2){
                        System.out.println("Tuesday");
                    }
                    else if (day == 3){
                        System.out.println("Wednesday");
                    }
                    else if (day == 4){
                        System.out.println("Thursday");
                    }
                    else if (day == 5){
                        System.out.println("Friday");
                    }
                    else if (day == 6) {
                        System.out.println("Saturday");
                    }
                    else if (day == 7){
                        System.out.println("Sunday");
                    }
                    else {
                        System.out.println("Invalid day");
                    }

                    String dayOfWeek = "Tuesday";
                    //tuesday, TUESDAY, tuesDAY


                    if (dayOfWeek.equalsIgnoreCase("monday")){
                        System.out.println(1);
                    }
                    else if (dayOfWeek.equalsIgnoreCase("tuesday")){
                        System.out.println(2);
                    }
                    else if (dayOfWeek.equalsIgnoreCase("wednesday")){
                        System.out.println(3);
                    }
                    else if (dayOfWeek.equalsIgnoreCase("thursday")){
                        System.out.println(4);
                    }
                    else if (dayOfWeek.equalsIgnoreCase("friday")){
                        System.out.println(5);
                    }
                    else if (dayOfWeek.equalsIgnoreCase("saturday")){
                        System.out.println(6);
                    }
                    else if (dayOfWeek.equalsIgnoreCase("sunday")){
                        System.out.println(7);
                    }
                    else{
                        System.out.println(-1);
                    }


                    byte time = 25;

        /*
        if time is between 9 and 17 - print WORK HOURS
        if time is between 7 and 9 and between 18 and 19 - print COMMUTE HOURS
        if time is between 6 and 8 - print BREAKFAST TIME
        if time is between 12 and 13 - print LUNCH TIME
        if time is between 20 and 22 - print DINNER TIME
        if time is between 22 and 24 - LATE HOURS
        if time is between 0 and 6 - print SLEEP TIME
        else {
        print "INVALID TIME, enter time between 0 and 24"
         */

                    if (time >= 9 && time <= 17) {
                        if (time >= 12 && time <= 13) {
                            System.out.println("Lunch time");
                        }
                        System.out.println("Work hours");
                    }
                    else if (time >= 7 && time <= 9 || time >= 18 && time <= 19) {

                        System.out.println("Commute hours");
                    }
                    else if (time >= 6 && time <= 8) {
                        System.out.println("Breakfast time");
                    }

                    else if (time >= 20 && time <= 22) {
                        System.out.println("Dinner time");
                        if (time == 22) {
                            System.out.println("Late hours");
                        }
                    }
                    else if (time >= 22 && time <= 24) {
                        System.out.println("Late hours");
                    }
                    else if (time >= 0 && time <= 6) {
                        System.out.println("Sleep time");
                    }
                    else {
                        System.out.println("Invalid time");
                    }






                }
            }







