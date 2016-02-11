package recursion.view;

import javax.swing.*;
import java.awt.*;
import recursion.controller.RecursionController;

public class RecursionFrame extends JFrame
{
	private RecursionController baseController;
	private RecursionPanel basePanel;

	
	public RecursionFrame(RecursionController baseController)
	{
		this.baseController = baseController;
		basePanel = new RecursionPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); 
		this.setSize(800,800);
		this.setTitle("Recurse");
		this.setResizable(false);	
		this.setVisible(true);
	}
}
