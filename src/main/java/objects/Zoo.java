package objects;

public class Zoo {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.type = " Elephant ";
        animal1.isMammal = true;
        animal1.isCarnivore = false;
        animal1.age = 120;
        animal1.habitat = " Savannah ";

        Animal animal2 = new Animal();
        animal2.type = " Zebra ";
        animal2.isMammal = true;
        animal2.isCarnivore = false;
        animal2.age = 56;
        animal2.habitat = "Savannah ";

        Animal animal3 = new Animal();
        animal3.type = " Parrot ";
        animal3.isMammal = true;
        animal3.isCarnivore = false;
        animal3.age = 100;
        animal3.habitat = " Jungle ";

        Animal animal4 = new Animal();
        animal4.type = "Shark";
        animal4.isMammal = false;
        animal4.isCarnivore = true;
        animal4.age = 1000;
        animal4.habitat = " Ocean ";

    


    }
}
