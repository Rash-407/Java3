package Lesson_1;

import java.util.ArrayList;

public class Box {

    private ArrayList<Fruit> boxArray = new ArrayList<>();

    public float getWeight (){
        if (boxArray.isEmpty()) return 0;
        return (float) boxArray.get(0).getWeight() * boxArray.size();
    }

    public boolean compare (Box b) {
        if (getWeight()==b.getWeight()) return true;
        return false;
    }

    public void addFruit (Fruit f) {
        if (boxArray.isEmpty()) {
            boxArray.add(f);
            return;
        }
        if (boxArray.get(0).getClass() ==  f.getClass()) boxArray.add(f);
        else System.out.println("Это коробка для других фкуртов!");
    }

    public Fruit getFruit () {
        if (boxArray.isEmpty()) return null;
        return boxArray.get(0);
    }

    public void pourOverFruit (Box b) {
        if (b.getWeight()!=0 && !(boxArray.isEmpty()) && boxArray.get(0).getClass() !=  b.getFruit().getClass()) {
            System.out.println("Это коробка для других фкуртов! Возьмите другую коробку");
            return;
        }
        for (Fruit fruit: boxArray) {
            b.addFruit(fruit);
        }
        boxArray.clear();
    }
}
