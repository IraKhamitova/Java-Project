package strings;

public class StringToLowerCase {
    public static void main(String[]args){
        String word="Hello EverYONE! How Are you doinG";
        System.out.println(word);
        word=word.toLowerCase();
        System.out.println(word);

        String word2="hello guys,I`m good.AND you?";
        System.out.println(word2);
        word2=word2.toUpperCase();
        System.out.println(word2);

        String word3="hello everyone";
        String word4="HELLO EVERYONE";
        System.out.println(word3.toUpperCase().equals(word4));


    }
}
