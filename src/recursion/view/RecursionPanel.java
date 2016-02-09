package recursion.view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import recursion.controller.RecursionController;

public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private JButton fibonacciButton;
	private JButton factorialButton;
	private JTextField inputField;
	private JTextField inputField_1;
	private JTextArea displayArea;
	private SpringLayout baseLayout;
	
	
	public RecursionPanel(RecursionController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		factorialButton = new JButton("");
		fibonacciButton = new JButton("FIB");
		inputField = new JTextField("words can be typed here bro");
		displayArea = new JTextArea(10,20);
		inputField_1 = new JTextField(30);
		
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.BLACK);
		this.add(factorialButton);
		this.add(inputField_1);
		this.add(fibonacciButton);
		this.add(displayArea);
		inputField_1.setToolTipText("Type here to talk");
		displayArea.setEnabled(false);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, displayArea, 69, SpringLayout.SOUTH, inputField_1);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField_1, 55, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, inputField_1, 203, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, displayArea, 264, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, fibonacciButton, -87, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, fibonacciButton, -64, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, factorialButton, 47, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, factorialButton, -103, SpringLayout.SOUTH, this);
		
		
	}
	
	private void setupListeners()
	{
		
	}
	
		
			
	public JTextField getTextField()
	{
		return inputField;
	}
	
}
		
	
	
	
	
	

