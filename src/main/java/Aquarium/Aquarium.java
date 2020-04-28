package Aquarium;

import java.util.ArrayList;
import java.util.Iterator;

public class Aquarium {
    private ArrayList<Fish> aquarium = new ArrayList();

    public void addFish(Fish fish) {
        aquarium.add(fish);
    }

    public void printAll() {
        Iterator var1 = this.aquarium.iterator();
        while (var1.hasNext()) {
            Fish fish = (Fish) var1.next();
            System.out.println(fish);
        }
    }

    public void removeFish(Integer num) {
        aquarium.remove(aquarium.remove(aquarium.get(num)));
        System.out.println("One " + aquarium.get(num).getKindOfFish() + " was was sold or died");
    }

    public void feedTheFish(Integer num) {
        System.out.println("One " + aquarium.get(num).getKindOfFish() + "ate " + aquarium.get(num).getFeed());
    }

    public void changeKindOfFish(Integer num, String newKind) {
        aquarium.get(num).setKindOfFish(newKind);
    }

    public void changeColor(Integer num, String newColor) {
        aquarium.get(num).setColor(newColor);
    }

    public void changePrice(Integer num, double newPrice) {
        aquarium.get(num).setPrice(newPrice);
    }

    public void changeFeed(Integer num, String newFeed) {
        aquarium.get(num).setFeed(newFeed);
    }
}
