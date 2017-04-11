import java.awt.*;

import BreezyGUI.*;

public class GameGui extends GBFrame
{
	private Label word;
	private Label score;
	private Button[][] charField = new Button[4][4];
	
	private TextField letters;
	private TextField scoreBox;
	
	private Button stop;
	private Button start;
	private Button submit;
	private Button reset;
	
	private Grid boggleLetters;
	private Boolean isUsed[][] = new Boolean[4][4];
	
	private final int timeInSeconds = 180;
	private int scoreNum;
	
	public GameGui()
	{	
		//Create character field
		boggleLetters = new Grid(4,4,false);
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				charField[i][j] = addButton((boggleLetters.getGridArray()[i][j] + ""),i+1,j+1,1,1);
				isUsed[i][j] = false;
			}
		}
		//Variables for score and time
		scoreNum = 0;
		//Create rest of field
		word = addLabel("Current Word:",5,1,1,1);
		score = addLabel("Score:",4,5,1,1);
		letters = addTextField("",5,2,1,1);
		submit = addButton("Submit",5,2,1,1);
		start = addButton("Start New Game", 1,5,1,1);
		stop = addButton("Stop Game", 2,5,1,1);
		reset = addButton("Reset",3,5,1,1);
		scoreBox = addTextField(scoreNum+"",4,6,1,1);
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
			letters.setText("");
			for(int i=0; i<4; i++)
			{
				for(int j=0; j<4; j++)
				{
					isUsed[i][j] = false;
				}
			}
			//If word is true 
			scoreNum++;
			scoreBox.setText(scoreNum+"");
		}
		if(buttonClicked == charField[0][0])
		{
			if(isUsed[0][0] == false)
			{
				letters.setText(letters.getText() + charField[0][0].getLabel());
				isUsed[0][0] = true;
			}
		}
		if(buttonClicked == charField[0][1])
		{
			if(isUsed[0][1] == false)
			{
				letters.setText(letters.getText() + charField[0][1].getLabel());
				isUsed[0][1] = true;
			}
		}
		if(buttonClicked == charField[0][2])
		{
			if(isUsed[0][2] == false)
			{
				letters.setText(letters.getText() + charField[0][2].getLabel());
				isUsed[0][2] = true;
			}
		}
		if(buttonClicked == charField[0][3])
		{
			if(isUsed[0][3] == false)
			{
				letters.setText(letters.getText() + charField[0][3].getLabel());
				isUsed[0][3] = true;
			}
		}
		if(buttonClicked == charField[1][0])
		{
			if(isUsed[1][0] == false)
			{
				letters.setText(letters.getText() + charField[1][0].getLabel());
				isUsed[1][0] = true;
			}
		}
		if(buttonClicked == charField[1][1])
		{
			if(isUsed[1][1] == false)
			{
				letters.setText(letters.getText() + charField[1][1].getLabel());
				isUsed[1][1] = true;
			}
		}
		if(buttonClicked == charField[1][2])
		{
			if(isUsed[1][2] == false)
			{
				letters.setText(letters.getText() + charField[1][2].getLabel());
				isUsed[1][2] = true;
			}
		}
		if(buttonClicked == charField[1][3])
		{
			if(isUsed[1][3] == false)
			{
				letters.setText(letters.getText() + charField[1][3].getLabel());
				isUsed[1][3] = true;
			}
		}
		if(buttonClicked == charField[2][0])
		{
			if(isUsed[2][0] == false)
			{
				letters.setText(letters.getText() + charField[2][0].getLabel());
				isUsed[2][0] = true;
			}
		}
		if(buttonClicked == charField[2][1])
		{
			if(isUsed[2][1] == false)
			{
				letters.setText(letters.getText() + charField[2][1].getLabel());
				isUsed[2][1] = true;
			}
		}
		if(buttonClicked == charField[2][2])
		{
			if(isUsed[2][2] == false)
			{
				letters.setText(letters.getText() + charField[2][2].getLabel());
				isUsed[2][2] = true;
			}
		}
		if(buttonClicked == charField[2][3])
		{
			if(isUsed[2][3] == false)
			{
				letters.setText(letters.getText() + charField[2][3].getLabel());
				isUsed[2][3] = true;
			}
		}
		if(buttonClicked == charField[3][0])
		{
			if(isUsed[3][0] == false)
			{
				letters.setText(letters.getText() + charField[3][0].getLabel());
				isUsed[3][0] = true;
			}
		}
		if(buttonClicked == charField[3][1])
		{
			if(isUsed[3][1] == false)
			{
				letters.setText(letters.getText() + charField[3][1].getLabel());
				isUsed[3][1] = true;
			}
		}
		if(buttonClicked == charField[3][2])
		{
			if(isUsed[3][2] == false)
			{
				letters.setText(letters.getText() + charField[3][2].getLabel());
				isUsed[3][2] = true;
			}
		}
		if(buttonClicked == charField[3][3])
		{
			if(isUsed[3][3] == false)
			{
				letters.setText(letters.getText() + charField[3][3].getLabel());
				isUsed[3][3] = true;
			}
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
