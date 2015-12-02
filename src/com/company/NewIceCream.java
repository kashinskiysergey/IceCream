package com.company;

import java.util.Random;

public class NewIceCream implements InterIceCream{
    private String taste  = getTaste();
    private String form = getForm();
    private String color = getColor();
    protected double weight = gerWeight();
    protected double size = getSize();

    @Override
    public String toString() {
        return "NewIceCream{" +
                "taste='" + taste + '\'' +
                ", form='" + form + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", size=" + size +
                '}';
    }

    @Override
    public String getTaste() {
        return taste = String.valueOf(Taste.getRandomTaste());
    }

    @Override
    public String getForm() {
        return form = String .valueOf(Forms.getRandomForm());
    }

    @Override
    public String getColor() {
        return color = String.valueOf(Color.getRandomColor());
    }

    @Override
    public double gerWeight() {
        Random r = new Random();
        int w = r.nextInt(400);
        return w;
    }

    @Override
    public double getSize() {
        Random r = new Random();
        int s = r.nextInt(100);
        return s;
    }
}
