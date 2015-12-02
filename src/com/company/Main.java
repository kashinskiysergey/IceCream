package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) throws DoseNotMuch {
	    IceCream iceCream = new IceCream();
        iceCream.setTaste(IceCream.Taste.getRandomTaste());

        IceCream plombir = new IceCream();
        plombir.setTaste(IceCream.Taste.getRandomTaste());

        IceCream plombir1 = new IceCream();
        plombir1.setTaste(IceCream.Taste.getRandomTaste());

        IceCream plombir2 = new IceCream();
        plombir2.setTaste(IceCream.Taste.getRandomTaste());

        IceCream plombir3 = new IceCream();
        plombir3.setTaste(IceCream.Taste.getRandomTaste());





        System.out.println(iceCream.toString());
        System.out.println(plombir.toString());
        System.out.println(plombir1.toString());
        System.out.println(plombir2.toString());
        System.out.println(plombir3.toString());
        System.out.println('\r');

        Child Julya = new Child();
        Julya.name = "Julya";
        Julya.IceCream = plombir;
        Julya.weshIceCream = plombir;
        System.out.println(Julya.toString());
        Julya.getWeshIceCream(plombir);
        System.out.println('\r');

        Child Johan = new Child();
        Johan.name = "Johan";
        Johan.IceCream = plombir1;
        Johan.weshIceCream = plombir;
        System.out.println(Johan.toString());
        Johan.getWeshIceCream(plombir1);
        System.out.println('\r');

        Child Silviya = new Child();
        Silviya.name = "Silviya";
        Silviya.IceCream = plombir2;
        Silviya.weshIceCream = plombir2;
        System.out.println(Silviya.toString());
        Silviya.getWeshIceCream(plombir2);
        System.out.println('\r');

        CreaitorIceCream creaitorIceCream = new CreaitorIceCream();
        creaitorIceCream.getIce();
        System.out.println(creaitorIceCream.getIce());

        Child Ivan = new Child();
        Ivan.name = "Ivan";
        Ivan.IceCream = creaitorIceCream.getIce();                  //Create the Icecream by Factory method
        Ivan.weshIceCream = creaitorIceCream.getIce();              //Create the Icecream by Factory method
        System.out.println(Ivan.toString());
        System.out.println("");





    }

}
