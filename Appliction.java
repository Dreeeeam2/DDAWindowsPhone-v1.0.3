package DDAWindowsPhoneMain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Appliction extends JFrame {
    public Appliction() {
        Container c = getContentPane();
        setLayout(null);
        JButton add = new JButton("游戏");
        add.setBounds(0,0,
                70,30);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"正在为您安装脑叶公司......","安装",JOptionPane.YES_NO_CANCEL_OPTION);
           JOptionPane.showMessageDialog(null,"安装完毕","提示",JOptionPane.YES_NO_CANCEL_OPTION);
                File file = new File("D:/untitled/src/DDAWindowsPhoneMain/Appliction.txt");
                try {
                    FileWriter fw = new FileWriter(file);
                    String word = "[game]";
                    fw.write(word);
                    fw.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
        JButton tool = new JButton("应用");
        tool.setBounds(0,30,70,30);
        tool.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"正在安装工具","提示",JOptionPane.YES_NO_CANCEL_OPTION);

                JOptionPane.showMessageDialog(null,"安装完毕，重启生效！","提示",JOptionPane.YES_NO_CANCEL_OPTION);
                File file = new File("D:/untitled/src/DDAWindowsPhoneMain/Appliction-Tool.txt");
                try {
                    FileWriter fw2 = new FileWriter(file);
                    String word2 = "[Tool]";
                    fw2.write(word2);
                    fw2.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        JButton back = new JButton("返回");
        back.setBounds(0,150,70,30);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        c.add(back);
        c.add(add);
        c.add(tool);
        setTitle("应用市场");
        setBounds(200,300,250,400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
new Appliction();
    }
}
