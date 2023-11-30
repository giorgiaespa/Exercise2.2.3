import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("mango");
        Fruit f2 = new Fruit("apple");
        Fruit f3 = new Fruit("strawberry");
        Fruit f4 = new Fruit("peach");
        Fruit f5 = new Fruit("pear");

        LinkedList <Fruit> fruits = fill(f1, f2, f3, f4, f5);
        System.out.println("linkedlist iniziale: \n" + fruits);
        System.out.println("----------------------");
        System.out.println("linkedlist aggiornata: \n" + addFirstandLast(fruits));
    }

    public static LinkedList <Fruit> fill (Fruit f1, Fruit f2, Fruit f3, Fruit f4, Fruit f5){
        return new LinkedList<>(Arrays.asList(f1, f2, f3, f4, f5));
    }

    public static LinkedList<Fruit> addFirstandLast (LinkedList<Fruit> list){
        Fruit f0 = new Fruit("cherry");
        Fruit f6 = new Fruit("pineapple");
        list.addFirst(f0);
        list.addLast(f6);
        return list;
    }
}