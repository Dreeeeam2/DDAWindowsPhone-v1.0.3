package DDAWindowsPhoneMain.脑叶公司.相关操作调用库;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EGO extends JFrame {
    public EGO(){
        Container c = getContentPane();
        setTitle("EGO");
        setLayout(null);
        JButton 忏悔 = new JButton("忏悔");
        忏悔.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(null,"该武器可以通过异想体：一罪与百善,获取","信息",JOptionPane.YES_NO_OPTION);
JOptionPane.showMessageDialog(null,"攻击范围:8,伤害:8","信息",JOptionPane.YES_NO_OPTION);

            }
        });
        忏悔.setBounds(0,0,100,50);
        JButton 协奏放射器 = new JButton("协奏放射器");
        协奏放射器.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"该武器可以通过异想体：歌唱机,获取","信息",JOptionPane.YES_NO_OPTION);
                JOptionPane.showMessageDialog(null,"攻击范围:20,伤害:50（精神伤害）","信息",JOptionPane.YES_NO_OPTION);

            }
        });
        协奏放射器.setBounds(0,50,100,50);
        JButton exit = new JButton("退出");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        exit.setBounds(0,100,100,50);
        //===================================================

        c.add(协奏放射器);
c.add(exit);
        c.add(忏悔);
        setVisible(true);
        setBounds(100,100,250,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}