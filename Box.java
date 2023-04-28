import java.util.ArrayList;
import java.util.List;

class Box<T extends Fruit> {
    private List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float weight = 0;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

public void transfer(Box<T> otherBox) {
    if (this == otherBox) {
        return;
    }
    for (T fruit : fruits) {
        otherBox.addFruit(fruit);
    }
    fruits.clear();
}
class Fruit {
    protected float weight;

    public float getWeight() {
        return weight;
    }
}

class Apple extends Fruit {
    public Apple() {
        weight = 1.0f;
    }
}

class Orange extends Fruit {
    public Orange() {
        weight = 1.5f;
    }
}

}