package co.org.one.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JPanel mainPanel;
    private JComboBox optionMenu;
    private JLabel labelOption;
    private JButton nextBtn;

    public MainFrame() {
//        mainPanel.add(labelOption);
//        mainPanel.add(optionMenu);
//        mainPanel.add(nextBtn);
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

                // Realizar alguna acción basada en el elemento seleccionado
                System.out.println("Elemento seleccionado: " + selectedElement);
            }
        });
    }
}
