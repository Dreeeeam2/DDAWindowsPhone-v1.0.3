package DDAWindowsPhoneMain.脑叶公司.相关操作调用库.相关操作;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import DDAWindowsPhoneMain.脑叶公司.相关操作调用库.*;

public class settings extends JFrame {
    public settings(){
        Container c = getContentPane();
        setLayout(null);
        setTitle("菜单");
        //===============================EGO
        JButton EGO = new JButton("EGO武器");
        EGO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EGO();
            }
        });
       EGO.setBounds(0,0,150,50);

        //===================================EGO
        JButton exit = new JButton("退出");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        exit.setBounds(0,100,150,50);
        JButton Moster = new JButton("异想体");
        Moster.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
new Mosters();
            }
        });
        Moster.setBounds(0,50,150,50);
        c.add(Moster);
c.add(exit);
c.add(EGO);
        setVisible(true);
        setBounds(100,100,250,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

