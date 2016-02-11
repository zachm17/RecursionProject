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
//	private JTextField inputField_1;
	private JTextArea resultsArea;
	private SpringLayout baseLayout;
	
	
	public RecursionPanel(RecursionController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		factorialButton = new JButton("Get N!");
		fibonacciButton = new JButton("Get the fionacci sequence for this number");
		inputField = new JTextField(20);
		resultsArea = new JTextArea(10,20);
		//inputField_1 = new JTextField(30);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.BLACK);
		this.add(factorialButton);
		this.add(inputField);
		this.add(fibonacciButton);
		this.add(resultsArea);
		inputField.setToolTipText("Type here to talk");
		resultsArea.setWrapStyleWord(true);
		resultsArea.setLineWrap(true);
		resultsArea.setText(baseController.getCalculatedValue());
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, fibonacciButton, -87, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, fibonacciButton, -64, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, factorialButton, 137, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, factorialButton, 0, SpringLayout.NORTH, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.WEST, resultsArea, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, resultsArea, -31, SpringLayout.NORTH, factorialButton);
		baseLayout.putConstraint(SpringLayout.EAST, resultsArea, -50, SpringLayout.EAST, this);
	//	baseLayout.putConstraint(SpringLayout.NORTH, inputField_1, 55, SpringLayout.NORTH, this);
	//	baseLayout.putConstraint(SpringLayout.WEST, inputField_1, 218, SpringLayout.WEST, this);
		
		
		
	}
	
	private void setupListeners()
	{
		fibonacciButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userInput = inputField.getText();
				if(checkInput(userInput))
				{
					resultsArea.setText(baseController.doFibonacci(userInput));
				}
			}
			
		});
		
		factorialButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userInput = inputField.getText();
				if(checkInput(userInput))
				{
					resultsArea.setText(baseController.doFactorial(userInput));
				}
			}

		});
	}

	
	private boolean checkInput(String input)
	{
		boolean isNumber = false;
		
		
		try
		{
			Double.parseDouble(input);
			isNumber = true;
		}
		catch(Exception numberException)
		{
			resultsArea.setText("type in a number!!!!!!");
		}
		
		
		return isNumber;
	}
	
		
			
	//public JTextField getTextField()
	//{
	//	return inputField;
	//}
	
}
		
	
	
	
	
	

