import java.awt.*;

import BreezyGUI.*;

public class GameGui extends GBFrame
{
	private Label enterWord;
	private Label[][] charField = new Label[4][4];
	
	private TextField wordEntry;
	
	private Button stop;
	private Button start;
	private Button submit;
	
	public GameGui()
	{	
		//Create character field
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				charField[i][j] = addLabel((i+ " "+j),i+1,j+1,1,1);
			}
		}
		//Create rest of field
		enterWord = addLabel("Enter Word Here:",5,1,1,1);
		wordEntry = addTextField("",5,2,1,1);
		submit = addButton("Submit",5,3,1,1);
		start = addButton("Start New Game", 1,5,1,2);
		stop = addButton("Stop Game", 2,5,1,2);
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
