package UI;

import javax.swing.*;
import java.awt.*;

public class Regi {
    public Regi() {
        JFrame Frame = new JFrame();
        Frame.setSize(550,500);
        Frame.setLocationRelativeTo(null);
        Frame.setLayout(null);
        Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel Headline = new JLabel("用户注册");
        Headline.setBounds(180,25,500,50);
        Headline.setFont(new Font("微软雅黑",Font.BOLD,40));
        Frame.add(Headline);

        JLabel ID = new JLabel("设置学工号：");
        JLabel Pswd = new JLabel("设置密码：");
        JLabel Pswd2 = new JLabel("确认密码：");
        ID.setBounds(64,140,100,50);
        ID.setFont(new Font("微软雅黑", Font.BOLD,16));
        Pswd.setBounds(80,200,100,50);
        Pswd.setFont(new Font("微软雅黑",Font.BOLD,16));
        Pswd2.setBounds(80,260,100,50);
        Pswd2.setFont(new Font("微软雅黑",Font.BOLD,16));
        Frame.add(ID);
        Frame.add(Pswd);
        Frame.add(Pswd2);

        JTextField IDIn = new JTextField();
        IDIn.setEditable(true);
        JPasswordField PswdIn = new JPasswordField();
        PswdIn.setEditable(true);
        IDIn.setBounds(170,150,300,33);
        PswdIn.setBounds(170,210,300,33);
        JPasswordField PswdIn2 = new JPasswordField();
        PswdIn2.setEditable(true);
        PswdIn2.setBounds(170,270,300,33);
        Frame.add(IDIn);
        Frame.add(PswdIn);
        Frame.add(PswdIn2);

        JButton RegiBu = new JButton("注册");
        JButton BackBu = new JButton("返回");
        RegiBu.setBounds(160,350,80,50);
        BackBu.setBounds(310,350,80,50);
        Frame.add(RegiBu);
        Frame.add(BackBu);

        Frame.setVisible(true);
    }
}
