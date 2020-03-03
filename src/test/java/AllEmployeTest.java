import com.elgo.AllEmploye;
import com.elgo.Employe;
import com.elgo.Vendeur;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AllEmployeTest {
    public void test(){
        Vendeur v1 = new Vendeur(10);
        Vendeur v2 = new Vendeur(20);
        Employe e1 = new Employe(2010);
        Employe e2 = new Employe(2005);
        ArrayList<AllEmploye> listEmploye = new ArrayList<AllEmploye>();
        listEmploye.add(e1);
        listEmploye.add(e2);
        listEmploye.add(v1);
        listEmploye.add(v2);
        double salaireTotal = 0;
        for (int i = 0; i < listEmploye.size(); i++){
            salaireTotal = listEmploye.get(i).salaire();
        }
        System.out.println("Salaire Total : "+ salaireTotal);
    }
}