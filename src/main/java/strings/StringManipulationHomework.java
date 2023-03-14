package strings;

public class StringManipulationHomework {
    public static void main(String[]args){
        String massage="Hello everyone,Let`s do Java String exercises";
        int index = 10;
        char y=massage.charAt(index);
        System.out.println(y);
        int length=massage.length();
        System.out.println(length);

        String upper = massage.toUpperCase();
        System.out.println(upper);

        String lower= massage.toLowerCase();
        System.out.println(lower);


        String text=massage.substring(0,14);
        System.out.println(text);
        int index5=5;
        char at = massage.charAt(4);
        System.out.println(at);

        String letter =massage.substring(0,1);
        System.out.println(letter.lastIndexOf(0,39));










        String codewiser =massage.substring(0,1);
        System.out.println(codewiser.toLowerCase());








    }
}
