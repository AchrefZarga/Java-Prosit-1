public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal snake = new Animal("Reptile", "Snake", 2, false);

        Zoo myZoo = new Zoo("My Zoo", "Tunis", 20);

        myZoo.animals[0] = lion;
        myZoo.animals[1] = snake;

        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(lion);
        // Q8: Without overriding toString(), Java prints ClassName@MemoryAddress
    }
}
