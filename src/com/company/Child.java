package com.company;

public class Child  {
    String name;
    Object IceCream;
    Object weshIceCream;

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", IceCream=" + IceCream +
                ",    weshIceCream='" + weshIceCream + '\'' +
                '}';
    }

    public String getWeshIceCream(IceCream iceCream) throws DoseNotMuch {
        try {
//            System.out.println(iceCream.equals(weshIceCream));
        if (iceCream.equals(weshIceCream)){
            System.out.println("This icecream I like.");


            }
        else
        {throw new DoseNotMuch();}
        }catch (DoseNotMuch doseNotMuch){

        }
        return String.valueOf(weshIceCream);
    }

}
