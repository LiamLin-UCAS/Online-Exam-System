/*
 * Created by JFormDesigner on Fri Apr 09 14:43:45 CST 2021
 */

package UI.Teacher;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class MainUi extends JFrame {
    public MainUi() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        label1 = new JLabel();

        //======== this ========
        setFont(new Font("\u5e7c\u5706", Font.BOLD, 28));
        setBackground(Color.white);
        setForeground(SystemColor.text);
        var contentPane = getContentPane();

        //---- button1 ----
        button1.setText("\u67e5\u770b\uff08\u7ef4\u62a4\uff09\u9898\u5e93");

        //---- button2 ----
        button2.setText("\u51fa\u8bd5\u5377");

        //---- button3 ----
        button3.setText("\u6279\u9605\u8bd5\u5377");

        //---- button4 ----
        button4.setText("\u6210\u7ee9\u6570\u636e\u7edf\u8ba1");

        //---- label1 ----
        label1.setText("\u6b22\u8fce\u60a8\uff0c\u8001\u5e08\uff01");
        label1.setFont(new Font("\u5e7c\u5706", Font.BOLD, 48));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
                            .addGap(74, 74, 74)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 593, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(357, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap(177, Short.MAX_VALUE)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)))
                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(button4, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                    .addGap(248, 248, 248))
        );
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
