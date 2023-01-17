package DDAWindowsPhoneMain.脑叶公司.异想体界面;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class T0985 extends JFrame{
    public T0985(){
        Container c = getContentPane();
        setLayout(null);
        setTitle("[T-09-85]的管理界面，操作者[Aylin]");
        JButton see = new JButton("洞察");
        see.setBounds(0,0,100,50);
        see.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"T-09-85并没有做出任何反应,但这看上去很危险","结果报告",JOptionPane.YES_NO_OPTION);

                setVisible(false);
            }
        });
        setVisible(false);
        JButton kill = new JButton("压迫");
        kill.setBounds(100,0,100,50);
        kill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"T-09-85压迫成功，但是，这也成功的激起了T-09-85的敌意","结果报告",JOptionPane.YES_NO_OPTION);
                setVisible(false);
            }
        });

        JButton talk = new JButton("沟通");
        talk.setBounds(0,50,100,50);
        talk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"警报！！！警报！！！操作异常，沟通失败，员工死亡！！！","结果报告",JOptionPane.CANCEL_OPTION);

                setVisible(false);
            }
        });
        JButton self = new JButton("本能");
        self.setBounds(100,50,100,50);
        self.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"T-09-85杀掉了员工","结果报告",JOptionPane.YES_NO_OPTION);
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
