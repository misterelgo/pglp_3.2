package com.elgo;

public class Vendeur extends AllEmploye{
    final private int base = 2000;
    private int commission;
    public Vendeur(int commission){
        this.commission = commission;
    }

    public double salaire() {
        return base+commission;
    }
}
