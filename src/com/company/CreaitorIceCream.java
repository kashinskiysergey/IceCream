package com.company;


public class CreaitorIceCream extends AbstCreaitor {
    @Override
    public InterIceCream getIce() {
        return new NewIceCream();
    }
}

