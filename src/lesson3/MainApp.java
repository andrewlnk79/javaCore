package lesson3;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        Box<Apple> appleBox= new Box<>(makeNewApples(10));
        Box<Orange> orangeBox = new Box<>(makeNewOranges(10));
        Box<Orange> secondOrangeBox = new Box<>(makeNewOranges(0));

        appleBox.compare(orangeBox);
        appleBox.compare(secondOrangeBox);
        orangeBox.transferTo(secondOrangeBox);
        appleBox.compare(orangeBox);
        appleBox.compare(secondOrangeBox);

    }
    public static ArrayList<Apple> makeNewApples(int count) {
        ArrayList<Apple> fruits = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            fruits.add(new Apple());
        }
        return fruits;

        public static ArrayList<Orange> makeNewOranges(int count) {
            ArrayList<Orange> fruits = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                fruits.add(new Orange());
            }
            return fruits;

}
