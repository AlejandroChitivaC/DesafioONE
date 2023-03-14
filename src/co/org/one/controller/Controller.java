package co.org.one.controller;

import co.org.one.model.Currency;
import co.org.one.view.MainFrame;

public class Controller {
    Currency model = new Currency();
    MainFrame view = new MainFrame();

    public Controller() {
        funcionar();
    }

    public void funcionar() {
        view.setLocationRelativeTo(null);
        view.setVisible(true);
        view.setSize(300, 200);



    }
}
