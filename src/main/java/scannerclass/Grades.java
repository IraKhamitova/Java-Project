package scannerclass;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        Scanner grading = new Scanner(System.in);
        System.out.println("Enter your grade:");
        int grade = grading.nextInt();

        if (grade>=0 && grade <=20){
            System.out.println("bad, study everithing again!");
        } else if (grade>=21 && grade<= 40) {
            System.out.println("ok, study more");
        } else if (grade>=41 && grade<= 60) {
            System.out.println("good, study more");
        } else if (grade>=61 && grade<= 80) {
            System.out.println("very good, keep up");

        } else if (grade>=81 && grade<= 95) {
            System.out.println("perfect, good job");
        } else if (grade>= 96 && grade <= 100) {
            System.out.println("exeptional, proud of you");
        }





        /*
        int grade = 0 to 100

if grade is between 0 and 20
print "bad, study everything again!"

if grade is between 21 and 40
print "ok, study more"

if grade is between 41 and 60
print "good, study more"

if grade is between 61 and 80
print "very good, keep up"

if grade is between 81 and 95
print "perfect, good job"

if grade is between 96 and 100
print "exceptional, proud of you"
         */

    }
}
