package com;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class Calculator {
	private static JFrame mainFrame;
	private static JTextField result;
	private static JPanel controlPanel;
	private static JPanel numberPanel;
	private static JPanel operationsPanel;

	private static JButton zeroButton;
	private static JButton oneButton;
	private static JButton twoButton;
	private static JButton threeButton;
	private static JButton fourButton;
	private static JButton fiveButton;
	private static JButton sixButton;
	private static JButton sevenButton;
	private static JButton eightButton;
	private static JButton nineButton;
	private static JButton cButton;
	private static JButton enterButton;
	private static JButton plusButton;
	private static JButton minusButton;
	private static JButton multiplyButton;
	private static JButton divideButton;
	private static StringBuilder print = new StringBuilder();

	private static String input = "";
	private static JPanel mainPanel;
	private static MyButton decimalButton;

	public Calculator() {
		prepareGUI();
	}

	private void prepareGUI() {
		mainFrame = new JFrame("Calculator");
		mainPanel = new JPanel();
		result = new JTextField("0.0");
		result.setHorizontalAlignment(JTextField.RIGHT);
		controlPanel = new JPanel();
		numberPanel = new JPanel();
		operationsPanel = new JPanel();
		oneButton = new MyButton("1");
		twoButton = new MyButton("2");
		threeButton = new MyButton("3");
		fourButton = new MyButton("4");
		fiveButton = new MyButton("5");
		sixButton = new MyButton("6");
		sevenButton = new MyButton("7");
		eightButton = new MyButton("8");
		nineButton = new MyButton("9");
		zeroButton = new MyButton("0");
		cButton = new MyButton("C");
		decimalButton = new MyButton(".");

		enterButton = new MyButton("=");

		plusButton = new JButton("+");
		minusButton = new JButton("-");
		multiplyButton = new JButton("*");
		divideButton = new JButton("/");

		mainFrame.setSize(new Dimension(292, 228));
		// mainPanel.setPreferredSize(new Dimension(800, 800)); //BLUE
		// result.setPreferredSize(new Dimension(800, 100));
		// controlPanel.setPreferredSize(new Dimension(800, 800)); //RED
		// numberPanel.setPreferredSize(new Dimension(300, 400));
		// operationsPanel.setPreferredSize(new Dimension(200, 400));

		mainFrame.setLayout(new GridBagLayout());
		mainPanel.setLayout(new GridBagLayout());
		controlPanel.setLayout(new GridBagLayout());
		numberPanel.setLayout(new GridBagLayout());
		operationsPanel.setLayout(new GridBagLayout());

		// mainPanel.setBorder(new LineBorder(Color.BLUE, 1));
		// result.setBorder(new LineBorder(Color.BLACK, 1));
		// controlPanel.setBorder(new LineBorder(Color.BLACK, 1));
		// numberPanel.setBorder(new LineBorder(Color.BLACK, 1));
		// operationsPanel.setBorder(new LineBorder(Color.BLACK, 1));

		GridBagConstraints mainPanelc = new GridBagConstraints();
		GridBagConstraints resultc = new GridBagConstraints();
		GridBagConstraints controlPanelc = new GridBagConstraints();
		GridBagConstraints numberPanelc = new GridBagConstraints();
		GridBagConstraints operationsPanelc = new GridBagConstraints();
		GridBagConstraints numberc = new GridBagConstraints();
		GridBagConstraints operationc = new GridBagConstraints();
		GridBagConstraints equalc = new GridBagConstraints();

		mainPanelc.gridx = 0;
		mainPanelc.gridy = 0;
		mainPanelc.gridwidth = 5;
		mainPanelc.gridheight = 10;
		mainPanelc.fill = GridBagConstraints.BOTH;

		resultc.ipady = 15;
		resultc.ipadx = 30;
		resultc.gridx = 0;
		resultc.gridy = 0;
		resultc.gridwidth = 5;
		resultc.gridheight = 2;
		resultc.fill = GridBagConstraints.BOTH;

		// controlPanelc.ipadx=30;
		controlPanelc.gridx = 0;
		controlPanelc.gridy = 2;
		controlPanelc.gridwidth = 5;
		controlPanelc.gridheight = 8;
		controlPanelc.fill = GridBagConstraints.BOTH;

		numberPanelc.gridx = 0;
		numberPanelc.gridy = 2;
		numberPanelc.gridwidth = 3;
		numberPanelc.gridheight = 8;
		numberPanelc.fill = GridBagConstraints.BOTH;

		operationsPanelc.gridx = 3;
		operationsPanelc.gridy = 2;
		operationsPanelc.gridwidth = 2;
		operationsPanelc.fill = GridBagConstraints.BOTH;

		numberc.ipadx = 12;
		numberc.ipady = 12;
		operationc.ipadx = 12;
		operationc.ipady = 25;
		equalc.ipadx = 12;
		equalc.ipady = 24;
		numberc.gridx = 0;
		numberc.gridy = 2;
		numberc.fill = GridBagConstraints.BOTH;
		numberc.gridheight = 2;
		numberPanel.add(oneButton, numberc);
		numberc.gridx = 1;
		numberPanel.add(twoButton, numberc);
		numberc.gridx = 2;
		numberPanel.add(threeButton, numberc);
		numberc.gridx = 0;
		numberc.gridy = 4;
		numberPanel.add(fourButton, numberc);
		numberc.gridx = 1;
		numberPanel.add(fiveButton, numberc);
		numberc.gridx = 2;
		numberPanel.add(sixButton, numberc);
		numberc.gridx = 0;
		numberc.gridy = 6;
		numberPanel.add(sevenButton, numberc);
		numberc.gridx = 1;
		numberPanel.add(eightButton, numberc);
		numberc.gridx = 2;
		numberPanel.add(nineButton, numberc);
		numberc.gridx = 0;
		numberc.gridy = 8;
		numberPanel.add(zeroButton, numberc);
		numberc.gridx = 1;
		numberPanel.add(cButton, numberc);
		numberc.gridx = 2;
		numberPanel.add(decimalButton, numberc);

		operationc.gridx = 3;
		operationc.gridy = 2;
		operationc.fill = GridBagConstraints.BOTH;
		operationc.gridheight = 3;
		operationsPanel.add(plusButton, operationc);
		operationc.gridx = 4;
		operationsPanel.add(minusButton, operationc);

		equalc.gridx = 3;
		equalc.gridy = 5;
		equalc.gridheight = 2;
		equalc.gridwidth = 2;
		equalc.fill = GridBagConstraints.BOTH;
		operationsPanel.add(enterButton, equalc);

		operationc.gridheight = 3;
		operationc.gridwidth = 1;
		operationc.gridx = 3;
		operationc.gridy = 7;
		operationsPanel.add(multiplyButton, operationc);
		operationc.gridx = 4;
		operationsPanel.add(divideButton, operationc);

		controlPanel.add(numberPanel, numberPanelc);
		controlPanel.add(operationsPanel, operationsPanelc);
		mainPanel.add(result, resultc);
		mainPanel.add(controlPanel, controlPanelc);
		mainFrame.add(mainPanel, mainPanelc);

		mainFrame.setVisible(true);
		mainFrame.setResizable(false);
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.showEventDemo();
	}

	private void showEventDemo() {
		zeroButton.addActionListener(new ButtonClickListener());
		oneButton.addActionListener(new ButtonClickListener());
		twoButton.addActionListener(new ButtonClickListener());
		threeButton.addActionListener(new ButtonClickListener());
		fourButton.addActionListener(new ButtonClickListener());
		fiveButton.addActionListener(new ButtonClickListener());
		sixButton.addActionListener(new ButtonClickListener());
		sevenButton.addActionListener(new ButtonClickListener());
		eightButton.addActionListener(new ButtonClickListener());
		nineButton.addActionListener(new ButtonClickListener());
		cButton.addActionListener(new ButtonClickListener());
		enterButton.addActionListener(new ButtonClickListener());
		decimalButton.addActionListener(new ButtonClickListener());
		plusButton.addActionListener(new ButtonClickListener());
		minusButton.addActionListener(new ButtonClickListener());
		multiplyButton.addActionListener(new ButtonClickListener());
		divideButton.addActionListener(new ButtonClickListener());
	}

	private class ButtonClickListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if (command.equals("C")) {
				result.setText("0");
				input = "0";
				print = new StringBuilder();
			} else if (command.equals("=")) {
				result.setText(calculateResult(result.getText()).toString());
				input = result.getText().toString();
				print = new StringBuilder(input);
			} else {
				print.append(command);
				result.setText(print.toString());
			}
		}

		private Double calculateResult(String result) {
			/* Create stacks for operators and operands */
			Stack<Integer> op = new Stack<Integer>();
			Stack<Double> val = new Stack<Double>();
			/* Create temporary stacks for operators and operands */
			Stack<Integer> optmp = new Stack<Integer>();
			Stack<Double> valtmp = new Stack<Double>();
			/* Accept expression */
			input = "0" + result;
			input = input.replaceAll("-", "+-");
			/* Store operands and operators in respective stacks */
			String temp = "";
			for (int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);
				if (ch == '-')
					temp = "-" + temp;
				else if (ch != '+' && ch != '*' && ch != '%' && ch != '/')
					temp = temp + ch;
				else {
					val.push(Double.parseDouble(temp));
					op.push((int) ch);
					temp = "";
				}
			}
			val.push(Double.parseDouble(temp));
			char operators[] = { '/', '%', '*', '+' };
			for (int i = 0; i < 4; i++) {
				boolean it = false;
				while (!op.isEmpty()) {
					int optr = op.pop();
					double v1 = val.pop();
					double v2 = val.pop();
					if (optr == operators[i]) {
						/*
						 * if operator matches evaluate and store in temporary
						 * stack
						 */
						if (i == 0) {
							valtmp.push(v2 / v1);
							it = true;
							break;
						} else if (i == 1) {
							valtmp.push(v2 * 100 / v1);
							it = true;
							break;
						} else if (i == 2) {
							valtmp.push(v2 * v1);
							it = true;
							break;
						} else if (i == 3) {
							valtmp.push(v2 + v1);
							it = true;
							break;
						}
					} else {
						valtmp.push(v1);
						val.push(v2);
						optmp.push(optr);
					}
				}
				/* Push back all elements from temporary stacks to main stacks */
				while (!valtmp.isEmpty())
					val.push(valtmp.pop());
				while (!optmp.isEmpty())
					op.push(optmp.pop());
				/* Iterate again for same operator */
				if (it)
					i--;
			}
			return (Double) val.pop();
		}

	}

}
