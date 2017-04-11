import java.util.ArrayList;

public class BoggleValidation 
{
	private static ArrayList<String> words;		
	public static ArrayList<Character> list = new ArrayList<Character>();
	public static String wordCreated = "";
	public static int[][] index = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 15}};
	public static ArrayList<Integer> usedInWord = new ArrayList<Integer>();
	
	
	public boolean isAdjacent(int num)
	{
		int indexr = 0; // Sets indexr equal to 0
		int indexc = 0; // Sets indexc equal to 0
		usedInWord.add(num); // Adds specific num to usedInWord ArrayList 
		for(int r = 0; r<4; r++)
		{
			for(int c = 0; c<4; c++)
			{
				if(index[r][c] == num) // If those coordinates are num...
				{
					indexr = r; // ...set r equal to the given r coordinate, and...
					indexc = c; // ...set c equal to the given c coordinate
				}
			}
		}
		
		for(int r = 0; r<4; r++)
		{
			for(int c = 0; c<4; c++)
			{
				if(indexr-1 == r && indexc-1 == c) // If the next letter is down one and left one...
					return true; // ...show that it is a valid move
				else if(indexr-1 == r && indexc == c) // If the next letter is to the left by one...
					return true; // ...show that it is a valid move
				else if(indexr-1 == r && indexc+1 == c) // If the next letter is up one and left one...
					return true; // ...show that it is a valid move
				else if(indexr == r && indexc-1 == c) // If the next letter is down one...
					return true; // ...show that it is a valid move	
				else if(indexr == r && indexc+1 == c) // If the next letter is up one...
					return true; // ...show that it is a valid move
				else if(indexr+1 == r && indexc-1 == c) // If the next letter is right one and down one...
					return true; // ...show that it is a valid move
				else if(indexr+1 == r && indexc == c) // If the next letter is to the right by one...
					return true; // ...show that it is a valid move
				else if(indexr+1 == r && indexc+1 == c) // If the next letter is up one and right one...
					return true; // ...show that it is a valid move
			}
		}
		return false;
	}
	
	public static boolean isAWord(String str)
	{
		if(words.contains(str))	
			return true;
		else
			return false;
	}
	
	public static void main(String[] args)
	{
		EasyReader infile = new EasyReader("quoteA.txt");
		while(!infile.eof())
			words.add(infile.readWord());
	}
}
