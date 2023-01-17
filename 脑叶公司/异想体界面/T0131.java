package DDAWindowsPhoneMain.脑叶公司.异想体界面;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class T0131 extends JFrame{

        public T0131() {
            Container c = getContentPane();
            setLayout(null);
            setTitle("[T-01-31]的管理界面，操作者[Aylin]");
            JButton see = new JButton("洞察");
            see.setBounds(0, 0, 100, 50);
            see.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "T-01-31并没有做出任何反应,但这看上去很危险", "结果报告", JOptionPane.YES_NO_OPTION);

                    setVisible(false);
                }
            });
            setVisible(false);
            JButton kill = new JButton("压迫");
            kill.setBounds(100, 0, 100, 50);
            kill.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "警报！！！T-01-31压迫失败！！！", "结果报告", JOptionPane.YES_NO_OPTION);
                    JOptionPane.showMessageDialog(null, "T-01-31突破收容！！！", "结果报告", JOptionPane.YES_NO_OPTION);
                    int answer = JOptionPane.showConfirmDialog(null,"是否镇压？","选择",JOptionPane.YES_NO_OPTION);
                    if(answer == 1){
                        JOptionPane.showMessageDialog(null,"镇压中","结果报告",JOptionPane.CANCEL_OPTION);
                    }else {
                        JOptionPane.showMessageDialog(null,"公司造成严重损失...事故报告生成中","结果报告",JOptionPane.CANCEL_OPTION);
                        File file = new File("D:\\untitled1\\脑叶公司\\事故报告.txt");
                        try{
                            FileWriter fw = new FileWriter(file);
                            Date date = new Date();
                            String word = "事故报告：事故源：T-01-31异想体（大鸟），事故时间"+date+"事故原因：员工进行异常操作";
                            fw.write(word);
                            fw.close();
                            JOptionPane.showMessageDialog(null,"事故报告已生成，点击[事故报告]，进行查看");
                        }catch (IOException e2){
                            e2.printStackTrace();
                        }
                    }
                    setVisible(false);
                }
            });

            JButton talk = new JButton("沟通");
            talk.setBounds(0, 50, 100, 50);
            talk.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "T-01-31非常愉悦", "结果报告", JOptionPane.CANCEL_OPTION);

                    setVisible(false);
                }
            });
            JButton self = new JButton("本能");
            self.setBounds(100, 50, 100, 50);
            self.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "T-01-31杀掉了员工", "结果报告", JOptionPane.YES_NO_OPTION);
                    setVisible(false);
                }
            });
            c.add(kill);
            c.add(talk);
            c.add(self);
            c.add(see);
            setBounds(100, 100, 400, 200);
            setVisible(true);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
