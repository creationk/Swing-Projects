package com;

import java.awt.Color;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class MyButton extends JButton {

	private static final long serialVersionUID = 1L;
	MyButton myButton;

	public MyButton() {
		myButton = new MyButton();
		myButton.setBorder(new LineBorder(Color.BLACK, 1));
		myButton.getMyButton();
	}

	private MyButton getMyButton() {
		return myButton;
	}

	public MyButton(Icon icon) {
		super(icon);
	}

	public MyButton(String text) {
		super(text);
	}

	public MyButton(Action a) {
		super(a);
	}

	public MyButton(String text, Icon icon) {
		super(text, icon);
	}

}
