/*
 * Created by JFormDesigner on Fri Apr 09 14:43:45 CST 2021
 */

package UI.Student;

import javax.swing.*;
import java.awt.*;

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
        label1 = new JLabel();

        //======== this ========
        setFont(new Font("\u5e7c\u5706", Font.BOLD, 28));
        setBackground(Color.white);
        setForeground(SystemColor.text);
        var contentPane = getContentPane();

        //---- button1 ----
        button1.setText("\u8fdb\u884c\u6211\u7684\u8003\u8bd5");

        //---- button2 ----
        button2.setText("\u67e5\u770b\u6211\u7684\u6210\u7ee9");

        //---- label1 ----
        label1.setText("\u6b22\u8fce\u60a8\uff0c\u5c71\u5927\u8f6f\u9662\u4eba\uff01");
        label1.setFont(new Font("\u5e7c\u5706", Font.BOLD, 48));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
                    .addGap(74, 74, 74)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 593, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(357, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(177, Short.MAX_VALUE)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                    .addGap(381, 381, 381))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(405, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JButton button1;
    private JButton button2;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
