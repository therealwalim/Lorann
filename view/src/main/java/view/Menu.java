package view;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import contract.ControllerOrder;
import contract.IController;
import contract.IView;
import java.awt.Toolkit;
import java.awt.GridLayout;
import java.lang.ModuleLayer.Controller;
import model.Model;
import model.Model;
import view.View;



public class Menu {

	private IController controller;

	private JFrame frmLorann;

	/**
	 * Launch the Menu
	 */

	/**
	 * Creation of the menu
	 */
	public Menu(IController controller) {
		this.controller = controller;
		init();
	}

	/**
	 * Designing our frame
	 */
	public void init() {
		frmLorann = new JFrame();
		frmLorann.setIconImage(
		Toolkit.getDefaultToolkit().getImage("E:\\Projet Final V1\\Loranne\\Images\\lorannicon.png"));
		frmLorann.setTitle("LORANN");
		frmLorann.setBounds(0,0, 391, 294);
		frmLorann.setLocationRelativeTo(null);
		frmLorann.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLorann.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 375, 261);
		frmLorann.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnStartGame = new JButton("Start game");
		btnStartGame.addActionListener(new Action());

		JButton btnChooseLvl = new JButton("Choose Level");
		btnChooseLvl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();
				JButton but = new JButton();
				JButton but2 = new JButton();
				JButton but3 = new JButton();
				JButton but4 = new JButton();
				JButton but5 = new JButton();
				JLabel lblLorann = new JLabel();

				fen.setTitle("Choose Your Level");
				fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fen.setBounds(100, 100, 378, 288);
				fen.add(pan);
				

				pan.setBackground(Color.BLACK);
				pan.setBorder(new EmptyBorder(5, 5, 5, 5));
				fen.setContentPane(pan);
				pan.setLayout(null);

				but.setText("1");
				but.setBackground(Color.WHITE);
				but.setBounds(23, 73, 150, 43);
				pan.add(but);

				but2.setText("2");
				but2.setBackground(Color.WHITE);
				but2.setBounds(183, 73, 150, 43);
				pan.add(but2);

				but3.setText("3");
				but3.setBackground(Color.WHITE);
				but3.setBounds(23, 127, 150, 43);
				pan.add(but3);

				but4.setText("4");
				but4.setBackground(Color.WHITE);
				but4.setBounds(183, 127, 150, 43);
				pan.add(but4);

				but5.setText("5");
				but5.setBackground(Color.WHITE);
				but5.setBounds(23, 181, 150, 43);
				pan.add(but5);

				lblLorann.setText("LORANN");
				lblLorann.setFont(new Font("8-bit pusab", Font.PLAIN, 12));
				lblLorann.setForeground(Color.RED);
				lblLorann.setBounds(128, 21, 90, 26);
				pan.add(lblLorann);

				but.addActionListener(new ActionA());
				but2.addActionListener(new ActionB());
				but3.addActionListener(new ActionC());
				but4.addActionListener(new ActionD());
				but5.addActionListener(new ActionE());
				fen.setVisible(true);
				

			}
		});

		btnStartGame.setBackground(Color.WHITE);
		btnStartGame.setBounds(82, 80, 204, 40);
		panel.add(btnStartGame);

		btnChooseLvl.setBackground(Color.WHITE);
		btnChooseLvl.setBounds(82, 131, 204, 40);
		panel.add(btnChooseLvl);

		JButton button_1 = new JButton("Quit");
		button_1.setBackground(Color.RED);
		button_1.setBounds(82, 182, 204, 40);
		panel.add(button_1);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("E:\\Projet Final V1\\Loranne\\Images\\lorann_ul.png"));
		lblNewLabel.setBounds(34, 179, 38, 47);
		panel.add(lblNewLabel);

		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("E:\\Projet Final V1\\Loranne\\Images\\monster_4.png"));
		label.setBounds(296, 80, 38, 47);
		panel.add(label);

		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("E:\\Projet Final V1\\Loranne\\Images\\horizontal_bone.png"));
		label_1.setBounds(0, -12, 38, 40);
		panel.add(label_1);

		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("E:\\Projet Final V1\\Loranne\\Images\\horizontal_bone.png"));
		label_2.setBounds(34, -12, 38, 40);
		panel.add(label_2);

		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("E:\\Projet Final V1\\Loranne\\Images\\horizontal_bone.png"));
		label_3.setBounds(68, -12, 38, 40);
		panel.add(label_3);

		JTextPane txtpnLorann = new JTextPane();
		txtpnLorann.setEditable(false);
		txtpnLorann.setFont(new Font("8-bit pusab", Font.PLAIN, 12));
		txtpnLorann.setForeground(Color.RED);
		txtpnLorann.setBackground(Color.BLACK);
		txtpnLorann.setText("LORANN");
		txtpnLorann.setBounds(131, 35, 90, 20);
		panel.add(txtpnLorann);

		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon("E:\\Projet Final V1\\Loranne\\Images\\horizontal_bone.png"));
		label_6.setBounds(100, -12, 38, 40);
		panel.add(label_6);

		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("E:\\Projet Final V1\\Loranne\\Images\\horizontal_bone.png"));
		label_4.setBounds(136, -12, 38, 40);
		panel.add(label_4);

		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("E:\\Projet Final V1\\Loranne\\Images\\horizontal_bone.png"));
		label_5.setBounds(169, -12, 38, 40);
		panel.add(label_5);

		JLabel label_7 = new JLabel("New label");
		label_7.setIcon(new ImageIcon("E:\\Projet Final V1\\Loranne\\Images\\horizontal_bone.png"));
		label_7.setBounds(204, -12, 38, 40);
		panel.add(label_7);

		JLabel label_8 = new JLabel("New label");
		label_8.setIcon(new ImageIcon("E:\\Projet Final V1\\Loranne\\Images\\horizontal_bone.png"));
		label_8.setBounds(238, -12, 38, 40);
		panel.add(label_8);

		JLabel label_9 = new JLabel("New label");
		label_9.setIcon(new ImageIcon("E:\\Projet Final V1\\Loranne\\Images\\horizontal_bone.png"));
		label_9.setBounds(271, -12, 38, 40);
		panel.add(label_9);

		JLabel label_10 = new JLabel("New label");
		label_10.setIcon(new ImageIcon("E:\\Projet Final V1\\Loranne\\Images\\horizontal_bone.png"));
		label_10.setBounds(306, -12, 38, 40);
		panel.add(label_10);

		JLabel label_11 = new JLabel("New label");
		label_11.setIcon(new ImageIcon("E:\\Projet Final V1\\Loranne\\Images\\horizontal_bone.png"));
		label_11.setBounds(337, -12, 38, 40);
		panel.add(label_11);

		JLabel label_12 = new JLabel("New label");
		label_12.setIcon(new ImageIcon("E:\\Projet Final V1\\Loranne\\Images\\fireball_2.png"));
		label_12.setBounds(34, 103, 38, 47);
		panel.add(label_12);

		JLabel label_13 = new JLabel("New label");
		label_13.setIcon(new ImageIcon("E:\\Projet Final V1\\Loranne\\Images\\gate_closed.png"));
		label_13.setBounds(34, 73, 38, 47);
		panel.add(label_13);

		JLabel label_14 = new JLabel("New label");
		label_14.setIcon(new ImageIcon("E:\\Projet Final V1\\Loranne\\Images\\crystal_ball.png"));
		label_14.setBounds(34, 226, 38, 47);
		panel.add(label_14);

		JLabel label_16 = new JLabel("New label");
		label_16.setIcon(new ImageIcon("E:\\Projet Final V1\\Loranne\\Images\\gate_open.png"));
		label_16.setBounds(349, 211, 38, 47);
		panel.add(label_16);

		JLabel label_17 = new JLabel("New label");
		label_17.setIcon(new ImageIcon("E:\\Projet Final V1\\Loranne\\Images\\purse.png"));
		label_17.setBounds(306, 211, 38, 47);
		panel.add(label_17);

		JLabel label_15 = new JLabel("New label");
		label_15.setIcon(new ImageIcon("E:\\Projet Final V1\\Loranne\\Images\\vertical_bone.png"));
		label_15.setBounds(296, 117, 38, 47);
		panel.add(label_15);

		JLabel label_18 = new JLabel("New label");
		label_18.setIcon(new ImageIcon("E:\\Projet Final V1\\Loranne\\Images\\monster_1.png"));
		label_18.setBounds(296, 157, 38, 47);
		panel.add(label_18);

		button_1.addActionListener(new Action());
		frmLorann.setVisible(true);

	}
	
	/*
	* Create interaction between our menu and the game
	*/

	public class Action implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			final Model model = new Model();
			final View view = new View(model);
			controller.setView(view);
			controller.setModel(model);
			view.setController(controller);
			Thread soltane = new Thread() {
				public void run() {
					frmLorann.dispose();
					controller.start(ControllerOrder.MENU);
				}
			};
			soltane.start();
			Sound.Changes();


		}

	}

	public class ActionA implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			final Model model = new Model();

			final View view = new View(model);
			controller.setView(view);
			controller.setModel(model);
			view.setController(controller);
			Thread soltane = new Thread() {
				public void run() {
					frmLorann.dispose();
					controller.start(ControllerOrder.MAP1);
				}
			};
			soltane.start();
			Sound.Changes();

		}

	}

	public class ActionB implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			final Model model = new Model();

			final View view = new View(model);
			controller.setView(view);
			controller.setModel(model);
			view.setController(controller);
			Thread soltane = new Thread() {
				public void run() {
					frmLorann.dispose();
					controller.start(ControllerOrder.MAP2);
				}
			};
			soltane.start();
			Sound.Rockstar();
		}

	}

	public class ActionC implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			final Model model = new Model();

			final View view = new View(model);
			controller.setView(view);
			controller.setModel(model);
			view.setController(controller);
			Thread soltane = new Thread() {
				public void run() {
					frmLorann.dispose();
					controller.start(ControllerOrder.MAP3);
				}
			};
			soltane.start();
			Sound.Rosanna();
		}

	}

	public class ActionD implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			final Model model = new Model();

			final View view = new View(model);
			controller.setView(view);
			controller.setModel(model);
			view.setController(controller);
			Thread soltane = new Thread() {
				public void run() {
					frmLorann.dispose();
					controller.start(ControllerOrder.MAP4);
				}
			};
			soltane.start();

		}

	}

	public class ActionE implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			final Model model = new Model();

			final View view = new View(model);
			controller.setView(view);
			controller.setModel(model);
			view.setController(controller);
			Thread soltane = new Thread() {
				public void run() {
					frmLorann.dispose();
					controller.start(ControllerOrder.MAP5);
				}
			};
			soltane.start();

		}

	}

}
