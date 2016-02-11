package recursion.controller;

import recursion.model.RecursionTool;
import recursion.view.RecursionFrame;

public class RecursionController
{
	
	private RecursionFrame baseFrame;
	private RecursionTool mathTool;
	private String calculatedValue;
	

	public RecursionController()
	{
		baseFrame = new RecursionFrame(this);
		mathTool = new RecursionTool();
		
	}
	
	public void start()
	{
		calculatedValue = Double.toString(mathTool.getFibNumber(0));
	}
	
	public String getCalculatedValue()
	{
		return calculatedValue;
	}
	
	public String doFibonacci(String inputValue)
	{
		calculatedValue = "The Fibonnaci sequence number of " + inputValue + 
				" is " + Double.toString(mathTool.getFibNumber(Integer.parseInt(inputValue)));
		
		
		return calculatedValue;
	}
	
	public String doFactorial(String inputValue)
	{
		calculatedValue = "The factorial of " + inputValue + " is " + Double.toString(mathTool.getFactorialNumber(Integer.parseInt(inputValue)));
		
		return calculatedValue;
	}
	
	public class MyTwoDController
	{
		
	}
}
