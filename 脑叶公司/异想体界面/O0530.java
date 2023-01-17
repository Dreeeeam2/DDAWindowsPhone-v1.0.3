package DDAWindowsPhoneMain.脑叶公司.异想体界面;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class O0530 extends JFrame {
    public O0530(){
        Container c = getContentPane();
        setLayout(null);
        setTitle("[o-05-30]的管理界面，操作者[Aylin]");
        JButton see = new JButton("洞察");
        see.setBounds(0,0,100,50);
        see.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"o-05-30并没有做出任何反应,但这看上去很危险","结果报告",JOptionPane.YES_NO_OPTION);

                setVisible(false);
            }
        });

        JButton kill = new JButton("压迫");
        kill.setBounds(100,0,100,50);
        kill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"o-05-30压迫成功，进入了休眠状态","结果报告",JOptionPane.YES_NO_OPTION);
                File file = new File("D:\\untitled1\\脑叶公司\\存档.txt");

                try{
                    FileWriter fw = new FileWriter(file);
                    String word = "获得武器[协奏放射器]*1";
                    fw.write(word);
                    fw.close();
                    JOptionPane.showMessageDialog(null,"已保存，点击文件内的[存档.txt]即可查看","存档信息",JOptionPane.YES_NO_OPTION);
                }catch (IOException e1){
                    e1.printStackTrace();
                }
                setVisible(false);
            }
        });

        JButton talk = new JButton("沟通");
        talk.setBounds(0,50,100,50);
        talk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"警报！！！警报！！！操作员工已被感染，二级警报拉响！！！","结果报告",JOptionPane.CANCEL_OPTION);
                JOptionPane.showMessageDialog(null,"二级警报已拉响，等待处理...","警报",JOptionPane.YES_NO_OPTION);
                Random random = new Random();
                int answer = random.nextInt(10);
                if(answer > 5){
                    JOptionPane.showMessageDialog(null,"处理成功，异想体O-05-30已被镇压","处理结果",JOptionPane.YES_NO_OPTION);
                } else if (answer <= 5) {
                    JOptionPane.showMessageDialog(null,"处理失败，实验失败，正在统计伤亡人员数量","处理结果",JOptionPane.YES_NO_OPTION);
                    int person = random.nextInt(10);
                    if(person>5){
                        JOptionPane.showMessageDialog(null,"游戏失败，伤亡人员数量>5","处理结果",JOptionPane.YES_NO_OPTION);
                    }else{
                        JOptionPane.showMessageDialog(null,"游戏继续，伤亡人员数量<5","处理结果",JOptionPane.YES_NO_OPTION);
                    }
                }
                setVisible(false);
            }
        });
        JButton self = new JButton("本能");
        self.setBounds(100,50,100,50);
        self.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"o-05-30并没有做出任何反应","结果报告",JOptionPane.YES_NO_OPTION);
                setVisible(false);
            }
        });
        c.add(kill);
        c.add(talk);
        c.add(self);
        c.add(see);
        setBounds(100,100,400,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}