package Aquarium;

public class Fish {
    private String kindOfFish;
    private String color;
    private String feed;
    private double price;

    public Fish(String kindOfFish, String color, String feed, double price) {
        this.kindOfFish = kindOfFish;
        this.color = color;
        this.feed = feed;
        this.price = price;
    }

    public String getKindOfFish() {
        return kindOfFish;
    }

    public void setKindOfFish(String kindOfFish) {
        this.kindOfFish = kindOfFish;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "kindOfFish='" + kindOfFish + '\'' +
                ", color='" + color + '\'' +
                ", feed='" + feed + '\'' +
                ", price=" + price +
                '}';
    }
}
