public class RunPet {
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        System.out.println("Default constructor:");
        pet1.display();

        Pet pet2 = new Pet("Buddy", "Dog", 3);
        System.out.println("\nConstructor with parameters:");
        pet2.display();

        pet1.setName("Kitty");
        pet1.setAnimal("Cat");
        pet1.setAge(5);
        System.out.println("\nAfter using setters:");
        pet1.display();

        System.out.println("\nUsing getters:");
        System.out.println("Name: " + pet1.getName());
        System.out.println("Animal: " + pet1.getAnimal());
        System.out.println("Age: " + pet1.getAge());

        System.out.println("\nCopying pet2 to pet1:");
        pet1.copy(pet2);
        System.out.println("Pet1 after copy:");
        pet1.display();

        System.out.println("\nComparing pets:");
        System.out.println("Are pet1 and pet2 equal? " + pet1.compare(pet2));

        System.out.println("\nUsing toString method:");
        System.out.println("Pet2 details: " + pet2);
    }
}