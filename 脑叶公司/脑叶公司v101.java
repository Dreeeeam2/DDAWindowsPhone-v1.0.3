package DDAWindowsPhoneMain.脑叶公司;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import DDAWindowsPhoneMain.脑叶公司.异想体界面.*;
import DDAWindowsPhoneMain.脑叶公司.相关操作.*;

public class 脑叶公司v101 extends JFrame {
    public 脑叶公司v101(){
        Container c = getContentPane();
        setLayout(null);
        setTitle("脑叶公司v1.0.1");//准备工作
        //======信息文本域
        JTextArea area = new JTextArea("系统信息",100,30);
        Random random = new Random();
        int pebox = 0;
area.setText("系统已启动");
area.append("   ");
area.append("[主管你好，欢迎来到脑叶公司]");
        area.setLineWrap(true);
                area.setBounds(500,30,100,300);
        //==========================================一罪与百善编写开始
        JButton o0303 = new JButton("一罪与百善");
        o0303.setBounds(0,0,100,50);
        int finalPebox = pebox;
        o0303.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
   JOptionPane.showMessageDialog(null,"如果试验成功将获得武器[忏悔]请点击[EGO武器资料]查看武器资料","实验成果",JOptionPane.YES_NO_OPTION);
        new o0303();//调用库

        }
});
//================================================一罪与百善编写结束
        //歌唱机开始编写
        JButton o0530 = new JButton("歌唱机");
        o0530.setBounds(0,50,100,50);
        o0530.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,"如果试验成功将获得武器[协奏放射器]请点击[EGO武器资料]查看武器资料","实验成果",JOptionPane.YES_NO_OPTION);
                new O0530();
            }
        });
        //==================================================歌唱机编写结束
        JButton T0985 = new JButton("我们可以改变一切");
       T0985.setBounds(0,100,150,50);
        T0985.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new T0985();
            }
        });
        //==================================================我们可以改变一切编写结束
        JButton T0131 = new JButton("大鸟");
        T0131.setBounds(0,150,100,50);
        T0131.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new T0131();
            }
        });
        //==================================================我们可以改变一切编写结束

        JButton settings = new JButton("菜单");
        settings.setBounds(500,0,80,30);
        settings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              new settings();
            }
        });
        c.add(T0131);
        c.add(area);
        c.add(T0985);
        c.add(settings);
    c.add(o0303);
    c.add(o0530);
        setBounds(500,100,600,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);//窗口显示
    }
    public static void main(String[] args) {
        new 脑叶公司v101();//ego，m，y
    }
}