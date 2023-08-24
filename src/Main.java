// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Shark("Shark", 12, "Triakidae");
        Turtle animal2 = new Turtle("Turtle", 5, "Malaclemys terrapin");
        Animal animal3 = new Eagle("Eagle", 9, "Haliaeetus leucocephalus");

        Animal[] animals = {animal,animal2, animal3};

        Shark[] sharks = new Shark[1];
        Turtle[] turtles = new Turtle[1];
        Eagle[] eagles = new Eagle[1];

        for (Animal animal4:animals) {
            if(animal4 instanceof Shark){
                sharks[0] = (Shark) animal4;
                System.out.println(sharks[0]);
                ((Shark) animal4).attac();
            }else if(animal4 instanceof Turtle){
                turtles[0] = (Turtle) animal4;
                System.out.println(turtles[0]);
                ((Turtle) animal4).swim();
            }else if (animal4 instanceof Eagle){
                eagles[0] = (Eagle) animal4;
                System.out.println(eagles[0]);
                ((Eagle) animal4).fly();
            }
        }
    }
    }
