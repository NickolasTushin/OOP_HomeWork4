import java.util.Random;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        Box<Apple> appleBox1 = new Box<>();
        for (int i = 0; i < random.nextInt(10)+1; i++) {
            appleBox1.addFruit(new Apple());
        }
 
        Box<Apple> appleBox2 = new Box<>();
        for (int i = 0; i < random.nextInt(20)+1; i++) {
            appleBox2.addFruit(new Apple());
        }
 
        Box<Orange> orangeBox = new Box<>();
        for (int i = 0; i < random.nextInt(15)+1; i++) {
            orangeBox.addFruit(new Orange());
        }

        System.out.println("Вес - коробка №1 яблоки: " + appleBox1.getWeight());
        System.out.println("Вес - коробка №2 яблоки: " + appleBox2.getWeight());
        System.out.println("Вес - коробка №3 апельсины: " + orangeBox.getWeight());

        System.out.println("Сравнение веса коробки с яблоками №1 и коробки с апельсинами: " + appleBox1.compare(orangeBox));
        System.out.println("Сравнение веса коробки с яблоками №2 и коробки с апельсинами: " + appleBox2.compare(orangeBox));

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Выберите коробку, в которую нужно добавить фрукты (1,2(apple) или 3(orange)): ");
        int choice = scanner.nextInt(); 
    
        System.out.println("Введите количество фруктов:");
        int count = scanner.nextInt();
        System.out.println("Введите название фрукта (apple или orange):");
        String fruitName = scanner.next();

        if (fruitName.equals("apple")) {
            if (choice == 1) {
                for (int i = 0; i < count; i++) {
                    appleBox1.addFruit(new Apple());
                }
                System.out.println("Вес коробки с яблоками №1 после добавления фруктов: " + appleBox1.getWeight());
            } else if (choice == 2) {
                for (int i = 0; i < count; i++) {
                    appleBox2.addFruit(new Apple());
                }
                System.out.println("Вес коробки с яблоками №2 после добавления фруктов: " + appleBox2.getWeight());
            } else if (choice == 3) {
                for (int i = 0; i < count; i++) {
                    orangeBox.addFruit(new Orange());
                }
                System.out.println("Вес коробки с апельсинами №3 после добавления фруктов: " + orangeBox.getWeight());
            } else {
                System.out.println("Неверный выбор коробки");
            }
        } else if (fruitName.equals("orange")) {
            if (choice == 3) {
                for (int i = 0; i < count; i++) {
                    orangeBox.addFruit(new Orange());
                }
            } else {
                System.out.println("  !!!  Неверный выбор коробки  !!!  ");
            }
        } else {
            System.out.println("Неверное название фрукта");
        }      
        System.out.println("Вес коробки с яблоками №1: " + appleBox1.getWeight());
        System.out.println("Вес коробки с яблоками №2: " + appleBox2.getWeight());

        appleBox1.transfer(appleBox2);

        System.out.println("Вес коробки с яблоками №1 после пересыпания: " + appleBox1.getWeight());
        System.out.println("Вес коробки с яблоками №2 после пересыпания: " + appleBox2.getWeight());
        System.out.println("Вес - коробки с апельсинами: " + orangeBox.getWeight());
        
    }
}