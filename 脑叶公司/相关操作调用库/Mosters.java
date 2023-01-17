package DDAWindowsPhoneMain.脑叶公司.相关操作调用库;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Mosters extends JFrame {
    public Mosters(){
        Container container = getContentPane();
        setLayout(null);
        setTitle("异想体资料");
        JButton o0303 = new JButton("O-03-03");
        o0303.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"该异想体等级ZAYIN","异想体信息",EXIT_ON_CLOSE);
                JOptionPane.showMessageDialog(null,"沟通对此异想体有巨大作用.","异想体信息",EXIT_ON_CLOSE);
                JOptionPane.showMessageDialog(null,"代号：一罪与百善","异想体信息",EXIT_ON_CLOSE);
            }
        });
        o0303.setBounds(0,0,100,30);
        JButton O0530 = new JButton("O-05-30");
        O0530.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"该异想体等级HE","异想体信息",EXIT_ON_CLOSE);
                JOptionPane.showMessageDialog(null,"压迫对此异想体有巨大作用.","异想体信息",EXIT_ON_CLOSE);
                JOptionPane.showMessageDialog(null,"代号：歌唱机","异想体信息",EXIT_ON_CLOSE);
            }
        });
        O0530.setBounds(0,30,100,30);
        JButton T0985 = new JButton("T-09-85");
        T0985.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"该异想体等级WOW","异想体信息",EXIT_ON_CLOSE);
                JOptionPane.showMessageDialog(null,"任何操作都不能对此异想体有作用","异想体信息",EXIT_ON_CLOSE);
                JOptionPane.showMessageDialog(null,"不要接近他，或触碰他","异想体信息",EXIT_ON_CLOSE);
                JOptionPane.showMessageDialog(null,"代号：我们可以改变一切","异想体信息",EXIT_ON_CLOSE);
            }
        });
       T0985.setBounds(0,60,100,30);
        JButton T0131 = new JButton("T-01-31");
        T0131.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"该异想体等级WOW","异想体信息",EXIT_ON_CLOSE);
                JOptionPane.showMessageDialog(null,"沟通对此异想体有巨大作用","异想体信息",EXIT_ON_CLOSE);
                JOptionPane.showMessageDialog(null,"代号：大鸟","异想体信息",EXIT_ON_CLOSE);
            }
        });
        T0131.setBounds(0,90,100,30);
        JButton exit = new JButton("退出");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        exit.setBounds(0,120,100,30);
        container.add(T0131);
        container.add(T0985);
        container.add(O0530);
        container.add(exit);
        container.add(o0303);
        setVisible(true);
        setBounds(100,100,250,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}