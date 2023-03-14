package ProblemSolving;

import java.util.Scanner;

public class AppleBanana {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String w1="word1";
        String w2="word2";
        w1=w1.toLowerCase();//apple
        w2=w2.toUpperCase();//banana
        System.out.println(w1+w2.toUpperCase().charAt(0)+w2.substring(1));

        w1=w1.toUpperCase();
        w2=w2.toUpperCase();
        System.out.println(w1+w2.toUpperCase().charAt(0)+w2.substring(1));


    }
}
