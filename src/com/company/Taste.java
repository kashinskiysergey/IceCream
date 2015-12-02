package com.company;

import java.util.Random;

public  enum Taste {
    Appel, Coconut, Banan, Kivi, Orange;

    public static Taste getRandomTaste() {
        Random r = new Random();
        return values()[r.nextInt(values().length)];
    }

}
