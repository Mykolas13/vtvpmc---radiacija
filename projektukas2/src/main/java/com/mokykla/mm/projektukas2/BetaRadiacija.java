package com.mokykla.mm.projektukas2;

public class BetaRadiacija extends Radiacija{


    public BetaRadiacija(int stiprumas) {
        super(stiprumas);
    }

    @Override
    public void spinduliuoti() {

        System.out.println("Beta radiacija duoda" + this.stiprumas + " stiprumu");
    }
}
