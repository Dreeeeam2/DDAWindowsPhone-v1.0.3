package DDAWindowsPhoneMain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DDAChantRoomForUse extends JFrame {
    public  DDAChantRoomForUse(){
        Container c = getContentPane();
        setBounds(200,200,500,300);
        JTextArea area = new JTextArea(100,300);
        area.setBounds(0,0,100,300);
        area.setLineWrap(true);
        area.append("在线人数(仅显示名字)            ");
String name = JOptionPane.showInputDialog(null,"请输入您的名字","输入",JOptionPane.YES_NO_OPTION);
        JTextArea screen = new JTextArea(450,230);
        screen.setBounds(120,0,450,230);
        screen.setLineWrap(true);
JTextField word = new JTextField("　");
word.setBounds(100,240,300,30);
word.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent arg0) {
        String sendword = word.getText();
        word.setText(" ");
        screen.setText(" ");
       screen .append(name+":"+sendword);

    }
});

c.add(screen);

JButton send=  new JButton("发送");
send.setBounds(420,240,80,30);
send.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String sendword = word.getText();
        word.setText(" ");
        screen.setText(" ");
        screen .append(name+":"+sendword);
    }
});
area.append(name);
c.add(word);
c.add(area);
c.add(send);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("DDA聊天室-v2.0.1");
    }

    public static void main(String[] args) {
new DDAChantRoomForUse();
    }
}
