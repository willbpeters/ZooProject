public class Testing
{
    public static void main(String[] args)
    {
        // create the linked list
        LinkedList zoo = new LinkedList();
        LinkedList emptyZoo = new LinkedList();

        // create 10 animals
        Animal a1 = new Animal(1, "Scruffy", "Ringtail", Category.MAMMAL, Diet.OMNIVORE, 180);
        Animal a2 = new Animal(2, "Goldie", "Goldfish", Category.AQUATIC, Diet.HERBIVORE, 20);
        Animal a3 = new Animal(3, "Rex", "Iguana", Category.ECTOTHERM, Diet.HERBIVORE, 35);
        Animal a4 = new Animal(4, "Buzzy", "Honeybee", Category.BUG, Diet.HERBIVORE, 10);
        Animal a5 = new Animal(5, "Polly", "Parrot", Category.BIRD, Diet.OMNIVORE, 45);
        Animal a6 = new Animal(6, "Dumbo", "Elephant", Category.MAMMAL, Diet.HERBIVORE, 900);
        Animal a7 = new Animal(7, "Nemo", "Clownfish", Category.AQUATIC, Diet.CARNIVORE, 30);
        Animal a8 = new Animal(8, "Shelley", "Tortoise", Category.ECTOTHERM, Diet.HERBIVORE, 60);
        Animal a9 = new Animal(9, "Webby", "Tarantula", Category.BUG, Diet.CARNIVORE, 15);
        Animal a10 = new Animal(10, "Leo", "Lion", Category.MAMMAL, Diet.CARNIVORE, 700);


        // Add animals To the list using both AddHead and AddTail
        zoo.AddTail(a1);
        zoo.AddTail(a2);
        zoo.AddTail(a3);
        zoo.AddHead(a4);
        zoo.AddHead(a5);
        zoo.AddTail(a6);
        zoo.AddTail(a7);
        zoo.AddHead(a8);
        zoo.AddTail(a9);
        zoo.AddTail(a10);

        // print the full list
        System.out.println("=== Full List ===");
        System.out.println(zoo.ToList());

        // remove 2 animals from the head and print them
        System.out.println("=== Removing 2 from head ===");
        Animal r1 = zoo.RemoveHead();
        System.out.println(r1.description());
        Animal r2 = zoo.RemoveHead();
        System.out.println(r2.description());
        
        // print the list after removals
        System.out.println("\n=== List After Removals ===");
        System.out.println(zoo.ToList());

        // check for emtpy list
        System.out.println("=== Checking for empty list ===");
        System.out.println("Is the zoo empty? " + zoo.IsEmpty());
        System.out.println("Is the empty zoo empty? " + emptyZoo.IsEmpty());

    }
}