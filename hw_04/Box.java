package hw_04;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    List<T> fruits = new ArrayList<T>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {
        double weight = 0;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public void moveTo(Box<? super T> anotherBox) {
        for (T fruit : fruits) {
            anotherBox.add(fruit);
        }
        fruits = new ArrayList<T>();
    }

}
