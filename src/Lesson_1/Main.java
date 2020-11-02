package Lesson_1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    private static LinkedList <String> list01 = new LinkedList<>();
    private static String [] array02 = {"one", "two", "three"};

    public static void main(String[] args) {

        list01.add("one");
        list01.add("two");
        list01.add("three");
        list01.add("four");
        task01(list01, 3, 1);
        //print(list01);

        ArrayList arrayList = task02(array02);
        //print(arrayList);

        Box box1 = new Box ();
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Orange());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        //box1.addFruit(new Apple());
        //box1.addFruit(new Apple());

        Box box2 = new Box ();
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        //box2.addFruit(new Orange());

        //System.out.println(box1.getWeight());
        //System.out.println(box2.getWeight());
        //System.out.println(box1.compare(box2));

        Box box3 = new Box();
        Box box4 = new Box();
        box3.addFruit(new Orange());
        box1.pourOverFruit(box3);
        System.out.println(box2.getWeight());
        System.out.println(box3.getWeight());
    }

    private static void task01(LinkedList list, int a, int b) {
        Object oa = list.get(a);
        Object ob = list.get(b);
        list.remove(a);
        list.add(a, ob);
        list.remove(b);
        list.add(b, oa);
        list01 = list;
    }

    private static void print(LinkedList list) {
        for (Object o: list) {
            System.out.println(o);
        }
    }

    private static void print(ArrayList list) {
        for (Object o: list) {
            System.out.println(o);
        }
    }

    private static ArrayList task02(Object [] array) {
        ArrayList <Object> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }


}
