package com.company;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.*;
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

        //        ______________________________________________________________________________________________________________



        Collection listIce = new ArrayList();                       //Create the collection
        listIce.add(plombir);
        listIce.add(plombir1);
        listIce.add(plombir2);
        listIce.add(plombir3);
        listIce.add(plombir3);
        listIce.add(plombir1);
        listIce.add(plombir3);
        listIce.add(plombir);
        listIce.add(plombir2);
        listIce.add(plombir2);
        listIce.add(plombir2);
        listIce.add(plombir1);
        listIce.add(plombir);
        listIce.add(plombir3);

        for (Iterator i = listIce.iterator(); i.hasNext();) {               //Cycle to find all "plombir"
            if (i.next().equals(plombir))
                System.out.println("Find 'Plombir' in collection.");
            }

//______________________________________________________________________________________________________________________

        System.out.println(listIce.stream().filter(plombir2::equals).count());      //Get all "plombir2" by stream.
        System.out.println(" ");
        System.out.println("In collection-listIce 'stream' find " + listIce.stream().filter(plombir2::equals).count() + " plombir2!");
        System.out.println(" ");

//        ______________________________________________________________________________________________________________


        Map mapIce = new HashMap<>();
        mapIce.put(1,  plombir1);
        mapIce.put(2,  plombir1);
        mapIce.put(3,  plombir2);
        mapIce.put(4,  plombir2);
        mapIce.put(5,  plombir3);
        mapIce.put(6,  plombir3);
        mapIce.put(7,  plombir1);
        mapIce.put(8,  plombir2);
        mapIce.put(9,  plombir3);
        mapIce.put(10, plombir1);
        mapIce.put(11, plombir1);
        mapIce.put(12, plombir2);
        mapIce.put(13, plombir3);
        mapIce.put(14, plombir3);
        mapIce.put(15, plombir2);
        mapIce.put(16, plombir1);
        mapIce.put(17, plombir1);
        mapIce.put(18, plombir);
        mapIce.put(19, plombir2);
        mapIce.put(20, plombir);
        mapIce.put(21, plombir);
        mapIce.put(22, plombir2);
        mapIce.put(23, plombir1);
        mapIce.put(24, plombir3);
        System.out.println(mapIce.values());
        System.out.println(" ");
        System.out.println(mapIce.entrySet());
        System.out.println(" ");
        System.out.println(mapIce.keySet());
        System.out.println(" ");

        int i = 0;
        for (Object value : mapIce.values()) {              //Проходим по карте
            if (value.equals(Julya.IceCream)) {             //Ищем совподения с заданным значением
                i++;
                System.out.println("We found " + i + " icecream!");
            }
        }
    }





    }


