import java.awt.*;

import BreezyGUI.*;

public class GameGui extends GBFrame
{
	private Label enterWord;
	private Label timer;
	private Label[][] charField = new Label[4][4];
	
	private TextField wordEntry;
	
	private Button stop;
	private Button start;
	private Button submit;
	private Button reset;
	
	private Grid boggleLetters;
	
	private final int timeInSeconds = 180;
	
	public GameGui()
	{	
		//Create character field
		boggleLetters = new Grid(4,4,false);
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				charField[i][j] = addLabel((boggleLetters.getGridArray()[i][j] + ""),i+1,j+1,1,1);
			}
		}
		//Create rest of field
		enterWord = addLabel("Enter Word Here:",5,1,1,1);
		timer = addLabel("Time:",4,5,1,1);
		wordEntry = addTextField("",5,2,1,1);
		submit = addButton("Submit",5,2,1,1);
		start = addButton("Start New Game", 1,5,1,1);
		stop = addButton("Stop Game", 2,5,1,1);
		reset = addButton("Reset",3,5,1,1);
	}
	
	public void buttonClicked(Button buttonClicked)
	{
		if(buttonClicked == stop)
		{
			//Stop timer
			//Don't accept new word entries
		}
		if(buttonClicked == start)
		{
			//start timer and accept entries
			
		}
		if(buttonClicked == reset)
		{
			//make new grid of characters and reset timer
		}
		if(buttonClicked == submit)
		{
			//check text entry and see if it is a valid play
			//if it is a valid play check to see if it is a word
			//if both are true, add points and clear text field
		}
	}
	
	public static void main (String[] args)
	{
		//Instantiate the GUI part
		Frame frm = new GameGui();    
		//Set the application's window width and height in pixels
		frm.setSize (750,750);  
		//Make the window visible to the user
		frm.setVisible (true);           
	}
}
