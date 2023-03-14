package homework;

public class Method {
    /*
    Create a public static method that takes two integers and returns the multiplication of 2 ints.
     */
    public static int sumOfNumbers(int a, int b) {
        return a * b;
    }

    /*
    Create a public instance method that takes a String and returns a new String with all lowercase letters.
     */
    public String toLowerCase(String input) {
        return input.toLowerCase();
    }

    /*
    Create a public instance method that takes two integers, divides one int by another and returns the result as a double.
     */
    public double Double(int a, int b) {
        return (double) a / b;
    }

    /*
    Create a static method that takes a string and returns true
    if it is a palindrome (reads the same forwards and backwards) and false otherwise.
*/
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }

    /*
    Create an instance method that takes a double and returns that double multiplied by 100.
     */
    public double aDouble(double num) {
        return num * 100;


    }

    /*
    Create a static method that takes a char and returns true
    if it is a consonant (a letter that is not a vowel) and false otherwise.
     */
    public static boolean vowel(char ch) {
        ch = Character.toLowerCase(ch);
        if (Character.isLetter(ch)) {
            return !("aeiou".indexOf(ch) != -1);
        }
        return false;

        }
        /*
        Create a public instance method that takes two integers and returns true
        if difference between them equals to 5 or -5, else false.
         */
    public static boolean Difference(int a, int b){
        return (Math.abs(a-b)==5);

    }
    /*
    Create an instance method that takes a String and returns true
    if it is a valid email address format (contains "@" and ".") and false otherwise.
     */
    public boolean ValidEmail(String Email){
        if (Email == null) {
            return false;
        }
        if (Email.contains("@") && Email.contains(".")) {
            if (Email.indexOf("@") < Email.lastIndexOf(".")) {
                return true;
            }
        }

        return false;
    }
    /*
    Create a public instance method that takes an integer and returns true
     if it is a prime number and false otherwise.
     */
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
    /*
    Create a static method that takes two integers and returns true
    if they have the same parity (both even or both odd) and false otherwise.
     */
    public static boolean Parity(int a, int b) {
        return (a % 2 == b % 2);
    }







}













