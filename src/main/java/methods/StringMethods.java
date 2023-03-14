package methods;

public class StringMethods {
    static String concatenateString(String s1,String s2){
        return (s1+s2).toUpperCase();


    }
    static int getLengthOf2Strings(String s,String s2){
        return (s+s2).length();

    }

    static boolean evenIteger(int num){
        if (num%2==0){
            return true;
        }
        return false;


    }
    static boolean divisibleIteger(int num){
       return num%10==0;
    }
    public static void TakesOneInt(int b){
        for (int i=1;i<10;i++ ){
            System.out.println(b+"*"+i+"="+(b*i));
        }

    }
    public static int averageReturn(int a,int b,int c, int d ){
        return (a+b+c+d)/4;

    }
    public static int sumOfNumbers(int a){
        int sum=0;
        for (int i=1; i<=a;i++){
            sum=sum+i;
        }
        return sum;

    }


}
