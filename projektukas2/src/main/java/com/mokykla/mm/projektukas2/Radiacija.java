package com.mokykla.mm.projektukas2;

public abstract class Radiacija implements IRadiacija{

    protected int stiprumas;

    public Radiacija(int stiprumas){

        this.stiprumas = stiprumas;
    }

    @Override
    public void spinduliuoti() {



    }
}
