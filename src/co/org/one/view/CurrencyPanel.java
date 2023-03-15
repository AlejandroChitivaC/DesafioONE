package co.org.one.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyPanel extends JPanel {
    JPanel cPanel;
    private JLabel lblTo;
    private JLabel lblFrom;
    private JComboBox cbTo;
    private JComboBox cboxMainCurr;

    public CurrencyPanel() {
        this.add(cPanel);
        this.add(lblFrom);
        this.add(lblTo);
        this.add(cbTo);
        this.add(cboxMainCurr);
        setSize(280, 400);

        cboxMainCurr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = cboxMainCurr.getSelectedIndex();
                switch (selectedIndex){
                    case 2:
                        System.out.println("COP");
                        break;
                    case 3:
                        System.out.println("USD");
                        break;
                    case 4:
                        System.out.println("EUR");
                        break;
                    case 5:
                        System.out.println("GBP");
                        break;
                    case 6:
                        System.out.println("JPY");
                        break;
                    case 7:
                        System.out.println("KRW");
                        break;
                }
            }
        });
        cbTo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = cboxMainCurr.getSelectedIndex();
                switch (selectedIndex){
                    case 2:
                        System.out.println("COP");
                        break;
                    case 3:
                        System.out.println("USD");
                        break;
                    case 4:
                        System.out.println("EUR");
                        break;
                    case 5:
                        System.out.println("GBP");
                        break;
                    case 6:
                        System.out.println("JPY");
                        break;
                    case 7:
                        System.out.println("KRW");
                        break;

                }
            }
        });
    }
}
