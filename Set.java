package DDAWindowsPhoneMain;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Set extends JFrame{
public Set() {

	Container c = getContentPane();
	JButton check = new JButton("系统");
	check.setBounds(0,0,70,20);
	check.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, 
					"系统型号：DDA-Phone-v1.0.1",
					"系统",
					JOptionPane.YES_NO_CANCEL_OPTION);
			
		}	
	});//查看系统型号的按键
	JButton back = new JButton("返回");
	back.setBounds(0,300,100,30);
	back.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			setVisible(false);
		}
	});
	JButton terminal = new JButton("终端");
	terminal.setBounds(0,20,70,20);
	terminal.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,
					"终端已就绪......",
					"提示",
					JOptionPane.YES_NO_CANCEL_OPTION);
			JOptionPane.showMessageDialog(null,"请点击文件内的:CDos/CDos.java运行","成功",JOptionPane.YES_NO_CANCEL_OPTION);
		}
	});
c.add(terminal);
	c.add(back);
	c.add(check);
	setTitle("设置");
	setLayout(null);
	setBounds(200,300,250,400);
	setVisible(true);
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
