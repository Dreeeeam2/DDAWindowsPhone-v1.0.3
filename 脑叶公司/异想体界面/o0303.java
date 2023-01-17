package DDAWindowsPhoneMain.脑叶公司.异想体界面;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class o0303 extends JFrame {
    public o0303(){
        Container c = getContentPane();
        setLayout(null);
        setTitle("[o-03-03]的管理界面，操作者[Aylin]");
        setVisible(true);
        JButton see = new JButton("洞察");
        see.setBounds(0,0,100,50);
        see.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"o-03-03并没有做出任何反应","结果报告",JOptionPane.YES_NO_OPTION);
setVisible(false);
            }
        });
        JButton kill = new JButton("压迫");
        kill.setBounds(100,0,100,50);
        kill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"警报！警报！操作异常，实验失败！","结果报告",JOptionPane.CLOSED_OPTION);
setVisible(false);
            }
        });
        JButton talk = new JButton("沟通");
  talk.setBounds(0,50,100,50);
        talk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"获得武器，忏悔","结果报告",JOptionPane.YES_NO_OPTION);
                File file = new File("D:\\untitled1\\脑叶公司\\存档.txt");

                try{
                    FileWriter fw = new FileWriter(file);
                    String word = "获得武器[忏悔]*1";
                    fw.write(word);
                    fw.close();
                    JOptionPane.showMessageDialog(null,"已保存，点击文件内的[存档.txt]即可查看","存档信息",JOptionPane.YES_NO_OPTION);
                }catch (IOException e1){
                    e1.printStackTrace();
                }
                setVisible(false);
            }
        });
        JButton self = new JButton("本能");
        self.setBounds(100,50,100,50);
        self.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,"o-03-03并没有做出任何反应","结果报告",JOptionPane.YES_NO_OPTION);
                setVisible(false);
            }
        });
c.add(kill);
c.add(talk);
c.add(self);
c.add(see);

        setBounds(100,100,400,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }



}