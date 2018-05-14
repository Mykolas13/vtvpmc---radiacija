package com.mokykla.mm.projektukas2;

public class AlfaRadiacija extends Radiacija{

    public AlfaRadiacija (int stiprumas){
        super(stiprumas);
    }

    @Override
    public void spinduliuoti() {

        System.out.println("Alfa radiacija duoda" + this.stiprumas + " stiprumu");
    }
}
