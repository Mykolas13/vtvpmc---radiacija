package com.mokykla.mm.projektukas2;

public class GamaRadiacija extends Radiacija{


    public GamaRadiacija(int stiprumas) {
        super(stiprumas);
    }

    @Override
    public void spinduliuoti() {

        System.out.println("Gama radiacija duoda" + this.stiprumas + " stiprumu");
    }
}
