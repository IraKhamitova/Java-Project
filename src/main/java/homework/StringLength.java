package homework;

public class StringLength {
    public static void main(String[] args) {
        /*
        Write a program that prints the length of a given string.
         */
        String str = "This is a random string for testing purposes";
        int length = str.length();
        System.out.println("Length of the string is: " + length);

        /*
        Write a program that prints the second character of a given string.
         */
        String str1 = "This is a random string for testing purposes";
        char secondChar = str.charAt(1);
        System.out.println("The second character of the string is: " + secondChar);

        /*
        Write a program that prints the last character of a given string.
         */
        String str2 = "This is a random string for testing purposes";
        char lastChar = str.charAt(43);
        System.out.println("The second character of the string is: " + lastChar);

        /*
        Write a program that replaces all occurrences of a letter "o" in a given string with a letter"i" and prints it.
         */
        String str3 = "This is a random string for testing purposes";
        String replacedStr = str.replaceAll("o", "i");
        System.out.println(replacedStr);

        /*
        Write a program that removes all spaces from a given string and prints it.
         */

        String str4 = "This is a random string for testing purposes";
        str = str.replaceAll("\\s", ""); // removes all spaces
        System.out.println(str); // prints the modified string

        /*
        Write a program that extracts as substring from a given string word "random".
         */
        int startIndex = str.indexOf("random");
        String substring = str.substring(startIndex);
        System.out.println(substring); // prints "random string for testing purposes"

        /*
        Write a program that that reverses the result of task 6 and prints it in capital letters
         */

        String str6 = "This is a random string for testing purposes";
        String reversed = new StringBuilder(str).reverse().toString();
        String uppercase = reversed.toUpperCase();
        System.out.println(uppercase);
    }
}











