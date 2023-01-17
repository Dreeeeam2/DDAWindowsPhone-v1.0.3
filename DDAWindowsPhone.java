package DDAWindowsPhoneMain;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Base64;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.WindowConstants;
import DDAWindowsPhoneMain.脑叶公司.脑叶公司v101;

public class DDAWindowsPhone extends JFrame{
	public DDAWindowsPhone() {
		Container c = getContentPane();//创建主容器
		JButton set = new JButton("设置");
		set.setBounds(0,0,85,30);//添加设置功能
		set.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Set();
			}
		});//设置功能编写结束，调用一个界面（Set）
		JButton exploer = new JButton("浏览器");
		exploer.setBounds(0,30,85,30);
		exploer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
new HTTPBrowserDemo();
new HTTPBrowser();
JOptionPane.showMessageDialog(null, 
		"由于浏览器没有优化完全，所以在您浏览时，请勿关闭浏览器，否则程序将终止",
		"提示",
 JOptionPane.YES_NO_CANCEL_OPTION);
			}
			
		});
		//浏览器设置：调用两个浏览器库
		JButton  Chant = new JButton("聊天");
		Chant.setBounds(0,60,85,30);
		Chant.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new DDAChantRoomForUse();
				JOptionPane.showMessageDialog(null,
						"DDA聊天室-v2.0.1",
						"版本" ,
				JOptionPane.YES_NO_OPTION);
			}
		});
		JButton Appliction = new JButton("应用市场");
		Appliction.setBounds(0,90,85,30);
		Appliction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Appliction();
			}
		});
		File file = new File("D:/untitled/src/DDAWindowsPhoneMain/Appliction.txt");
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String word = bufferedReader.readLine();
			if(word.equals("[game]")){
				JButton game = new JButton("脑叶公司");
				game.setBounds(0,120,85,30);
				game.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						new 脑叶公司v101();
					}
				});
				c.add(game);
			}else {
				System.out.println("no");
			}
		} catch (FileNotFoundException ex) {
			throw new RuntimeException(ex);
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
		File file2 = new File("D:/untitled/src/DDAWindowsPhoneMain/Appliction-Tool.txt");
		try {
			FileReader fileReader2 = new FileReader(file2);
			BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
			String word2 = bufferedReader2.readLine();
			if(word2.equals("[Tool]")){
				JButton Tool = new JButton("加密工具");
				Tool.setBounds(0,150,85,30);
				Tool.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
String mw = JOptionPane.showInputDialog(null,"请输入你要加密的文字" ,"机密",JOptionPane.YES_NO_CANCEL_OPTION);
						Base64.Encoder encoder = Base64.getEncoder();
						String ciphertext = encoder.encodeToString(mw.getBytes());
						JOptionPane.showMessageDialog(null,ciphertext,"密文",JOptionPane.YES_NO_CANCEL_OPTION);
					}
				});
				c.add(Tool);
			}else {
				System.out.println("no");
			}
		} catch (FileNotFoundException ex) {
			throw new RuntimeException(ex);
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
JButton ip = new JButton("ip地址获取");
		ip.setBounds(0,180,85,30);
		ip.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String target = JOptionPane.showInputDialog(null,"请输入目标网址","目标",JOptionPane.YES_NO_CANCEL_OPTION);
				try {
					InetAddress inetAddress = InetAddress.getByName(target);
					JOptionPane.showMessageDialog(null,target+"的ip是："+inetAddress,"消息",JOptionPane.YES_NO_CANCEL_OPTION);

				} catch (UnknownHostException ex) {
					throw new RuntimeException(ex);
				}
			}
		});
		JButton jsq = new JButton("计算器");
		jsq.setBounds(0,210,85,30);
		jsq.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1;
			String num1s = JOptionPane.showInputDialog(null,"请输入数字","标题",JOptionPane.YES_NO_CANCEL_OPTION);
				num1=Integer.parseInt(num1s);
				int num2;
				String num2s = JOptionPane.showInputDialog(null,"请输入第二个数字","标题",JOptionPane.YES_NO_CANCEL_OPTION);
				num2=Integer.parseInt(num2s);
				int answer = JOptionPane.showConfirmDialog(null, (num1+num2),"计算器弹出的窗口(num1+num2)" , JOptionPane.YES_NO_CANCEL_OPTION );
				int answer2 = JOptionPane.showConfirmDialog(null, (num1-num2),"计算器弹出的窗口(num1-num2)" , JOptionPane.YES_NO_CANCEL_OPTION );
				int answer3 = JOptionPane.showConfirmDialog(null, (num1*num2),"计算器弹出的窗口(num1*num2)" , JOptionPane.YES_NO_CANCEL_OPTION );
				int answer4 = JOptionPane.showConfirmDialog(null, (num1/num2),"计算器弹出的窗口(num1/num2)" , JOptionPane.YES_NO_CANCEL_OPTION );
			}
		});
		JButton date = new JButton("日历");
		date.setBounds(0,240,85,30);
		date.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Date date1 = new Date();
			JOptionPane.showMessageDialog(null,"今天是："+date1+"祝你每天开心=）");
			}
		});

		c.add(date);
		c.add(jsq);
		c.add(ip);
		c.add(Appliction);
		c.add(Chant);
		c.add(exploer);
		c.add(set);
		setTitle("Phone");//设置标题
		setBounds(200,300,250,400);//设置窗口出现位置，以及大小
		setLayout(null);//设置布局格式;
		setVisible(true);//是否出现
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置出现时窗口可以进行哪些操作
	}
	public static void main(String[] args) {
		System.out.println("正在测试是否存有JDK......");
		System.out.println("测试完毕，开始运行");
		// TODO Auto-generated method stub
new DDAWindowsPhone();//新建
	}
}

