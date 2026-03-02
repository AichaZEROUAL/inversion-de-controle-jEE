package metier;

import dao.IDao;

public class IMetierImpl implements IMetier {

    // couplage faible
    private IDao dao;

    // pour injecter dans la variable dao un objet d'une classe qui implémente l interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 100;
        return 0;
    }
}
