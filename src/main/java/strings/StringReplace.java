package strings;

public class StringReplace {
    public static void main(String[]args) {
        String word = "Apple banana strawberry";
        word = word.replace('a', 'e');
        System.out.println(word);
        System.out.println(word.replace('e', 'a'));


        String foods="hot lentil soup,hot plov,cold kompot";
        foods=foods.replace("hot","teasty");
        System.out.println(foods);


    }

}
