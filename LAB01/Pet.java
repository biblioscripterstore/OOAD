public class Pet {
    private String name;
    private String animal;
    private int age;

    public Pet() {
        this.name = "";
        this.animal = "";
        this.age = 0;
    }
    public Pet(String name, String animal, int age) {
        this.name = name;
        this.animal = animal;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAnimal() {
        return animal;
    }
    public void setAnimal(String animal) {
        this.animal = animal;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void copy(Pet p) {
        p.setName(this.name);
        p.setAnimal(this.animal);
        p.setAge(this.age);
    }

    public boolean compare(Pet p) {
        return this.name.equals(p.getName()) && this.animal.equals(p.getAnimal()) && this.age == p.getAge();
    }

    public void display() {
        System.out.println("---------- Pet Detail ----------");
        System.out.println("Name: " + this.name);
        System.out.println("Animal: " + this.animal);
        System.out.println("Age: " + this.age);
    }

    @Override
    public String toString() {
        return "\"" + name + ", " + animal + ", " + age + "\"";
    }
}
