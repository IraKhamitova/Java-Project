package strings;

public class SubStrings {
    public static void main(String[]args){
        String str1="hi";
        String str2="bye";
        System.out.println(str1+str2+str1+str2);


        System.out.println(str1+""
                +str2+str1.toUpperCase()+""+str1.toUpperCase()+""+str2.toUpperCase()+""+str2.toUpperCase()+str2+""+str1);


        String see="see";
        String hear="hear";

     System.out.println(see.substring(0,1)+hear.substring(1,4));
     System.out.println(hear.replace('h','s'));
     System.out.println(see.charAt(0)+hear.substring(1,4));



    }
}
