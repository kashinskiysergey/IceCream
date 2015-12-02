package com.company;

import java.util.Random;


public enum Forms {
    Circle, Square, Triangle, Elips;

    public static Forms getRandomForm() {
        Random r = new Random();
        return values()[r.nextInt(values().length)];
    }
}
