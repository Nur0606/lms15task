public class Turtle extends Animal{
    public Turtle(String name, int age, String families) {
        super(name, age, families);
    }

    public  void swim(){
        System.out.println("Turtle swim");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}