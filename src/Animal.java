public class Animal {
    private String name;
    private int age;
    private String families;

    public Animal(String name, int age, String families) {
        this.name = name;
        this.age = age;
        this.families = families;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFamilies() {
        return families;
    }

    public void setFamilies(String families) {
        this.families = families;
    }


    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", families='" + families + '\'' +
                '}';
    }
}
