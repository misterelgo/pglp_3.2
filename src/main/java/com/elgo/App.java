package com.elgo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Employe employe1 = new Employe(2018);
        Vendeur vendeur1 = new Vendeur(200);
        double salaireTotal = employe1.salaire() + vendeur1.salaire();
        System.out.println("Le salaire total est :"+ salaireTotal);
    }
}
