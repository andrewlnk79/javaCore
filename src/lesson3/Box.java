package lesson3;

import java.util.ArrayList;

public class Box <T extends fruit> {
    private  ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;


    }
    public  float getWeight(){
        float result =0;
        for(T fruit:fruits){
            result+=fruit.weight;
        }
        return result;
    }
    public void  compare(Box<?> another){
        float currentWeight=getWeight();
        float anotherWeight= another.getWeight();
        if (currentWeight>anotherWeight){
            System.out.println("this box is havy");
        } else if (currentWeight<anotherWeight) {
            System.out.println("another box is havy");

        }
        else {
            System.out.println("boxes are the same by weight");
        }
    }
    public void append(T fruit){fruits.add(fruit);}
    public  void transferTo(Box<T> other){
        other.fruits.addAll(fruits);
        fruits.clear();
    }
}
