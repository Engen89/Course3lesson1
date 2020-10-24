package lesson1;

import lesson1.fruits.Fruits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxWithFruits <T extends Fruits> {
    private List<T> container;

    public BoxWithFruits() {
        this.container = new ArrayList<>();
    }

    public BoxWithFruits(T...fruits){
        this.container = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeight(){

        float mas = 0.0f;
        for (T fruits: container) {
            mas += fruits.getWeight();
        }
        return mas;
    }

    public boolean sameAvg(BoxWithFruits<?> another){
        return Math.abs(this.getWeight() - another.getWeight()) < 0.001;
    }

    public void transfer(BoxWithFruits<? super T> another){
        if(another.equals(this)){
            return;
        }
        another.container.addAll(this.container);
        this.container.clear();
    }

    public void add(T fruits){
        container.add(fruits);
    }
}
