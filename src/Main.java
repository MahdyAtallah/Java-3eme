public class Main {

    public static void main(String[] args) {

        Animal lion = new Animal("test", "Lion", 5, true);

        Animal[] animals = new Animal[25];

        Zoo myZoo = new Zoo(animals, "Zoo Tunis", "Tunis", 20);

        myZoo.displayZoo();
        System.out.println(myZoo) ;
        System.out.println(myZoo.toString());

        System.out.println(lion.toString());

    }
}