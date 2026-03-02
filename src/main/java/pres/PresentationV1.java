package pres;

import dao.DaoImpl;
import metier.IMetier;
import metier.IMetierImpl;

public class PresentationV1 {
    static void main() {
        // injection des dépendences par instanciaion statqique
        DaoImpl d = new DaoImpl();
        IMetier metier = new IMetierImpl(d); // injection des dépendances via le constructeur
        //metier.setDao(d); // Injection via setter
        System.out.println("Res = " );
    }
}
