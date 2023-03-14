package objects;

public class Animal {
    String type;
    boolean isMammal;
    boolean isCarnivore;
    int age;
    String habitat;


    public void eating() { System.out.println(isCarnivore+"is eating");

    }public  void sleeping() {
        System.out.println(type + age + habitat + isMammal+"is sleeping" );

    }public void play() {
        System.out.println(type + age + habitat + isCarnivore+"playing" );
        System.out.println();
    }

    }


