package HeDieuHanh;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;



class GUI1 extends JFrame {

	
	
	public static final long serialVersionUID = -9102921349267475005L;
	public JPanel contentPane;
	public ArrayList<JLabel> forkLabelList = new ArrayList<>();
	public ArrayList<JLabel> philosopherLabelList = new ArrayList<>();
	public ArrayList<JProgressBar> progressBars = new ArrayList<>();
	public ArrayList<JLabel> listChop = new ArrayList<>();
	public ArrayList<JLabel> zzzList = new ArrayList<>();
	public ArrayList<JLabel> finishedList = new ArrayList<>();
	//private Test1 diningApp;

	
	public static void main(String[] args) {
		new GUI1();
	}

	/**
	 * Create the frame.
	 */
	public GUI1() {
		setTitle("DINING PHILOSOPHERS");
		
//		chua tao constructor
		//diningApp = new Test1();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 969, 660);
		contentPane = new JPanel();
		this.setSize(800,500);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
	
		JLabel lblPhilosopher_1 = new JLabel("Philosopher 1");
		lblPhilosopher_1.setOpaque(true);
		lblPhilosopher_1.setForeground(Color.WHITE);
		lblPhilosopher_1.setBackground(Color.ORANGE);
		lblPhilosopher_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhilosopher_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhilosopher_1.setBounds(409, 35, 115, 70);
		philosopherLabelList.add(lblPhilosopher_1);
		contentPane.add(lblPhilosopher_1);
		
		JLabel lblPhilosopher_2 = new JLabel("Philosopher 2");
		lblPhilosopher_2.setOpaque(true);
		lblPhilosopher_2.setForeground(Color.WHITE);
		lblPhilosopher_2.setBackground(Color.ORANGE);
		lblPhilosopher_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhilosopher_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhilosopher_2.setBounds(484, 236, 115, 70);
		philosopherLabelList.add(lblPhilosopher_2);
		contentPane.add(lblPhilosopher_2);
		
		JLabel lblPhilosopher_3 = new JLabel("Philosopher 3");
		lblPhilosopher_3.setOpaque(true);
		lblPhilosopher_3.setForeground(Color.WHITE);
		lblPhilosopher_3.setBackground(Color.ORANGE);
		lblPhilosopher_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhilosopher_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhilosopher_3.setBounds(279, 368, 115, 71);
		philosopherLabelList.add(lblPhilosopher_3);
		contentPane.add(lblPhilosopher_3);
		
		JLabel lblPhilosopher_4 = new JLabel("Philosopher 4");
		lblPhilosopher_4.setOpaque(true);
		lblPhilosopher_4.setForeground(Color.WHITE);
		lblPhilosopher_4.setBackground(Color.ORANGE);
		lblPhilosopher_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhilosopher_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhilosopher_4.setBounds(93, 236, 115, 70);
		philosopherLabelList.add(lblPhilosopher_4);
		contentPane.add(lblPhilosopher_4);
		
		JLabel lblPhilosopher = new JLabel("Philosopher 5");
		lblPhilosopher.setOpaque(true);
		lblPhilosopher.setBackground(Color.ORANGE);
		lblPhilosopher.setForeground(Color.WHITE);
		lblPhilosopher.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhilosopher.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhilosopher.setBounds(155, 35, 115, 70);
		philosopherLabelList.add(lblPhilosopher);
		contentPane.add(lblPhilosopher);
		
		JLabel lblFork_1 = new JLabel("chopstick 1");
		lblFork_1.setBackground(new Color(64, 224, 208));
		lblFork_1.setOpaque(true);
		lblFork_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFork_1.setBounds(470, 145, 66, 27);
		forkLabelList.add(lblFork_1);
		contentPane.add(lblFork_1);
		
		JLabel lblFork_2 = new JLabel("chopstick 2");
		lblFork_2.setBackground(new Color(64, 224, 208));
		lblFork_2.setOpaque(true);
		lblFork_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblFork_2.setBounds(433, 331, 66, 27);
		forkLabelList.add(lblFork_2);
		contentPane.add(lblFork_2);
		
		JLabel lblFork_3 = new JLabel("chopstick 3");
		lblFork_3.setBackground(new Color(64, 224, 208));
		lblFork_3.setOpaque(true);
		lblFork_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblFork_3.setBounds(180, 331, 66, 27);
		forkLabelList.add(lblFork_3);
		contentPane.add(lblFork_3);
		
		JLabel lblFork_4 = new JLabel("chopstick 4");
		lblFork_4.setBackground(new Color(64, 224, 208));
		lblFork_4.setOpaque(true);
		lblFork_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblFork_4.setBounds(142, 145, 66, 27);
		forkLabelList.add(lblFork_4);
		contentPane.add(lblFork_4);
		
		JLabel lblFork_5 = new JLabel("chopstick 5");
		lblFork_5.setBackground(new Color(64, 224, 208));
		lblFork_5.setOpaque(true);
		lblFork_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblFork_5.setBounds(313, 78, 66, 27);
		forkLabelList.add(lblFork_5);
		contentPane.add(lblFork_5);
		
		JLabel lblNewLabel = new JLabel("Red - Thinking");
		lblNewLabel.setBounds(10, 11, 115, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblGreenEating = new JLabel("Green - Eating");
		lblGreenEating.setBounds(10, 35, 115, 14);
		contentPane.add(lblGreenEating);
		
		JLabel lblGreenEating_1 = new JLabel("Black - Hungry");
		lblGreenEating_1.setBounds(10, 64, 115, 14);
		contentPane.add(lblGreenEating_1);
		
		this.setVisible(true);
		//startDining();
	}


	public void changeColourToGreen(int i) {
		switch (i) {
		case 1:
			philosopherLabelList.get(0).setBackground(Color.GREEN);
			break;
		case 2:
			philosopherLabelList.get(1).setBackground(Color.GREEN);
			break;
		case 3:
			philosopherLabelList.get(2).setBackground(Color.GREEN);
			break;
		case 4:
			philosopherLabelList.get(3).setBackground(Color.GREEN);
			break;
		case 5:
			philosopherLabelList.get(4).setBackground(Color.GREEN);
			break;
		default:
			break;
		}
	}
	
	public void changeColourToRed (int i) {
		switch (i) {
		case 1:
			philosopherLabelList.get(0).setBackground(Color.red);
			break;
		case 2:
			philosopherLabelList.get(1).setBackground(Color.red);
			break;
		case 3:
			philosopherLabelList.get(2).setBackground(Color.red);
			break;
		case 4:
			philosopherLabelList.get(3).setBackground(Color.red);
			break;
		case 5:
			philosopherLabelList.get(4).setBackground(Color.red);
			break;
		default:
			break;
		}
	}
		
	public void setColourToBlack(int i) {
			philosopherLabelList.get(0).setBackground(Color.BLACK);
			philosopherLabelList.get(1).setBackground(Color.BLACK);
			philosopherLabelList.get(2).setBackground(Color.BLACK);
			philosopherLabelList.get(3).setBackground(Color.BLACK);
			philosopherLabelList.get(4).setBackground(Color.BLACK);
			
	}
	public void changeColourToRed_Chop (int i) {
			switch (i) {
			case 1:
				listChop.get(0).setBackground(Color.red);
				listChop.get(4).setBackground(Color.red);
				break;
			case 2:
				listChop.get(1).setBackground(Color.red);
				listChop.get(0).setBackground(Color.red);
				break;
			case 3:
				listChop.get(2).setBackground(Color.red);
				listChop.get(1).setBackground(Color.red);
				break;
			case 4:
				listChop.get(3).setBackground(Color.red);
				listChop.get(2).setBackground(Color.red);
				break;
			case 5:
				listChop.get(4).setBackground(Color.red);
				listChop.get(3).setBackground(Color.red);
				break;
			default:
				break;
			}
		}
		
	public void changeColourToPink_Chop (int i) {
			switch (i) {
			case 1:
				listChop.get(0).setBackground(Color.pink);
				listChop.get(4).setBackground(Color.pink);
				break;
			case 2:
				listChop.get(1).setBackground(Color.pink);
				listChop.get(0).setBackground(Color.pink);
				break;
			case 3:
				listChop.get(2).setBackground(Color.pink);
				listChop.get(1).setBackground(Color.pink);
				break;
			case 4:
				listChop.get(3).setBackground(Color.pink);
				listChop.get(2).setBackground(Color.pink);
				break;
			case 5:
				listChop.get(4).setBackground(Color.pink);
				listChop.get(3).setBackground(Color.pink);
				break;
			default:
				break;
			}
		}
}
