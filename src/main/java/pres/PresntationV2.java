package pres;

import dao.IDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PresntationV2 {
    static void main() {
        try {
            Scanner sc = new Scanner(new File("config.txt"));
            String daoClassName = sc.nextLine();
            Class cDao = Class.forName(daoClassName);
            IDao Idao = (IDao) cDao.getConstructor().newInstance();
            System.out.println(daoClassName);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}
