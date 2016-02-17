package recursion.controller;

import recursion.model.*;
import recursion.view.RecursionFrame;

public class RecursionController
{
	
	private RecursionFrame baseFrame;
	private RecursionTool mathTool;
	private String calculatedValue;
	private CodeTimer myTimer;
	

	public RecursionController()
	{
		baseFrame = new RecursionFrame(this);
		mathTool = new RecursionTool();
		myTimer = new CodeTimer();
		
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
	
	public String timingInfo()
	{
		return myTimer.toString();
	}
	
	public class MyTwoDController
	{
		
	}
}
