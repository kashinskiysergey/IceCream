package com.company;


import java.util.Random;

public class IceCream {
    public IceCream( /**String color*/) {
        this.weight = getWeight();
        this.size = getSize();
        this.color = color;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "weight=" + weight +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = String.valueOf(taste);
    }

    public double getWeight() {
        Random r = new Random();
        int w = r.nextInt(400);
        return w;
    }

    public double getSize() {
        Random r = new Random();
        int size = r.nextInt(70);
        return size;
    }

    final double weight;
    double size;
    String taste;

    public String getColor() {
        return color;
    }

    String color;


    public static enum Taste {
        Appel, Coconut, Banan, Kivi, Orange;

        public static Taste getRandomTaste() {
            Random r = new Random();
            return values()[r.nextInt(values().length)];
        }

    }


}





