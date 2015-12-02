package com.company;

import java.util.Random;

/**
 * Created by HP_Delphi on 27.11.2015.
 */
public enum Color {
    Red, Green, Yellow, White, Orange;
    public static Color getRandomColor() {
        Random r = new Random();
        return values()[r.nextInt(values().length)];
    }
}
