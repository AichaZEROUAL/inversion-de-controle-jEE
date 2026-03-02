package metier;

import dao.DaoImpl;
import dao.IDao;

public interface IMetier {
    double calcul();

    void setDao(IDao d);
}
