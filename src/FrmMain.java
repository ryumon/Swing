import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;

import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class FrmMain extends JFrame {

	private JPanel contentPane;
	private Game game = new Game();
	private JButton button_1;
	private JButton button;
	private JButton btnNewButton;
	private JButton button_3;
	private JButton button_5;
	private JButton button_4;
	private JButton button_7;
	private JButton button_6;
	private JButton button_2;
	private JPanel panel_1;
	private JLabel lblPlayer;
	private JLabel label;
	private JButton button_8;
	private JPanel panel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMain frame = new FrmMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public FrmMain() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 269, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		contentPane.add(panel, BorderLayout.CENTER);
		
		button_1 = new JButton("");
		button_1.setIcon(new ImageIcon("./icons/39.png"));
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				game.click(button_1, lblPlayer);
			}
		});
		
		button_1.setPreferredSize(new Dimension(80,80));
		panel.add(button_1);
		
		button = new JButton("");
		button.setIcon(new ImageIcon("./icons/39.png"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				game.click(button, lblPlayer);

			}
		});
		button.setPreferredSize(new Dimension(80,80));
		panel.add(button);
		
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("./icons/39.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				game.click(btnNewButton, lblPlayer);

			}
		});
		btnNewButton.setPreferredSize(new Dimension(80,80));
		panel.add(btnNewButton);
		
		button_3 = new JButton("");
		button_3.setForeground(Color.BLACK);
		button_3.setIcon(new ImageIcon("./icons/39.png"));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.click(button_3, lblPlayer);

			}
		});
		button_3.setPreferredSize(new Dimension(80,80));
		panel.add(button_3);
		
		button_5 = new JButton("");
		button_5.setIcon(new ImageIcon("./icons/39.png"));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.click(button_5, lblPlayer);

			}
		});
		button_5.setPreferredSize(new Dimension(80,80));
		panel.add(button_5);
		
		button_4 = new JButton("");
		button_4.setIcon(new ImageIcon("./icons/39.png"));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				game.click(button_4, lblPlayer);

			}
		});
		button_4.setPreferredSize(new Dimension(80,80));
		panel.add(button_4);
		
		button_7 = new JButton("");
		button_7.setIcon(new ImageIcon("./icons/39.png"));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				game.click(button_7, lblPlayer);

			}
		});
		button_7.setPreferredSize(new Dimension(80,80));
		panel.add(button_7);
		
		button_6 = new JButton("");
		button_6.setIcon(new ImageIcon("./icons/39.png"));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				game.click(button_6, lblPlayer);

			}
		});
		button_6.setPreferredSize(new Dimension(80,80));
		panel.add(button_6);
		
		button_2 = new JButton("");
		button_2.setIcon(new ImageIcon("./icons/39.png"));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				game.click(button_2, lblPlayer);

			}
		});
		button_2.setPreferredSize(new Dimension(80,80));
		panel.add(button_2);
		
		panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 50));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		lblPlayer = new JLabel("player1");
		panel_1.add(lblPlayer);
		
		label = new JLabel("\u306E\u756A\u3067\u3059\u3002");
		panel_1.add(label);
		
		button_8 = new JButton("\u30EA\u30BB\u30C3\u30C8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_1.setIcon(new ImageIcon("./icons/39.png"));
				button.setIcon(new ImageIcon("./icons/39.png"));
				btnNewButton.setIcon(new ImageIcon("./icons/39.png"));
				button_3.setIcon(new ImageIcon("./icons/39.png"));
				button_5.setIcon(new ImageIcon("./icons/39.png"));
				button_4.setIcon(new ImageIcon("./icons/39.png"));
				button_7.setIcon(new ImageIcon("./icons/39.png"));
				button_6.setIcon(new ImageIcon("./icons/39.png"));
				button_2.setIcon(new ImageIcon("./icons/39.png"));
				game.turn = true;
				lblPlayer.setText("player1");
				
			
			}
		});
		panel_1.add(button_8);
	}

}
