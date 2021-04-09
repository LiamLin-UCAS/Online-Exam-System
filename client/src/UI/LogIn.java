package UI;

import javax.swing.*;
import java.awt.*;

public class LogIn {
    public LogIn() {
        JFrame Frame = new JFrame();
        JLabel Headline = new JLabel("欢迎来到智能考试系统");
        JLabel ID = new JLabel("学工号：");
        JLabel Pswd = new JLabel("密码：");
        JTextField IDIn = new JTextField();
        IDIn.setEditable(true);
        JPasswordField PswdIn = new JPasswordField();
        PswdIn.setEditable(true);
        JButton LogInBu = new JButton("登录");
        JButton RegBu = new JButton("还没有账号？点这里注册");
        Frame.setSize(950,600);
        Frame.setLocationRelativeTo(null);
        Headline.setBounds(230,45,800,100);
        Headline.setFont(new Font("微软雅黑",Font.BOLD,50));
        ID.setBounds(267,210,100,50);
        ID.setFont(new Font("微软雅黑", Font.BOLD,16));
        Pswd.setBounds(285,280,50,50);
        Pswd.setFont(new Font("微软雅黑",Font.BOLD,16));
        IDIn.setBounds(340,220,300,33);
        PswdIn.setBounds(340,290,300,33);
        LogInBu.setBounds(430,370,80,50);
        RegBu.setBounds(350,440,250,35);
        Frame.add(Headline);
        Frame.add(ID);
        Frame.add(Pswd);
        Frame.add(IDIn);
        Frame.add(PswdIn);
        Frame.add(LogInBu);
        Frame.add(RegBu);
        Frame.setLayout(null);
        Frame.setVisible(true);
        Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
