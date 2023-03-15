package co.org.one.view;

import co.org.one.model.Currency;
import co.org.one.model.Distances;
import co.org.one.model.Temperature;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    //Instanciar los modelos
    Temperature temp= new Temperature();
    Distances dist= new Distances();
    Currency curr= new Currency();
    private JPanel mainPanel;
    private JComboBox optionMenu;
    private JLabel labelOption;
    private JButton nextBtn;

    public MainFrame() {
        setContentPane(mainPanel);
        setTitle("ONE Backend Challenge");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        optionMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el índice del elemento seleccionado
                int selectedIndex = optionMenu.getSelectedIndex();
                // Obtener el elemento seleccionado
                String selectedElement = (String) optionMenu.getSelectedItem();
                if (selectedIndex == 1) {
                    //Metodo para convertir monedas
                    System.out.println(selectedElement);
                    //llamar a CurrencyPanel
                    CurrencyPanel cp = new CurrencyPanel();
                    mainPanel.removeAll();
                    setContentPane(cp);
                    pack();

                    System.out.println("Entra a monedas");

                }else if (selectedIndex == 2) {
                    //Metodo para convertir temperaturas
                    System.out.println(selectedElement);
                    System.out.println("Entra a temperaturas");
                }
                else if (selectedIndex==3){
                    //Metodo para convertir distancias
                    System.out.println(selectedElement);
                    System.out.println("Entra a distancias");
                }
            }
        });
    }
}
