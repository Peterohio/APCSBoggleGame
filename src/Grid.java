
public class Grid 
{
	private char[][] gridArray;
	
	public Grid(int rows, int columns, boolean isTotalRandom)
	{
		gridArray = new char[rows][columns];
		if(isTotalRandom)
		{
			for(int i=0; i<rows; i++)
			{
				for(int j=0; j<columns; j++)
				{
					gridArray[i][j] = randomLetter();
				}
			}
		}
		else
		{
			for(int i=0; i<rows; i++)
			{
				for(int j=0; j<columns; j++)
				{
					gridArray[i][j] = randomEnglishLetter();
				}
			}
		}
	}
	
	public void display()
	{
		for(int i=0; i<gridArray.length; i++)
		{
			for(int j=0; j<gridArray.length; j++)
			{
				System.out.print(gridArray[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public char[][] getGridArray()
	{
		return gridArray;
	}
	
	private char randomLetter()
	{
		int num = (int)(Math.random()*26 +65);
		return (char)num;
	}
	
	private char randomEnglishLetter()
	{
		int rand = (int)(Math.random()*100000);
		if(rand <= 74)
			return 'z';
		else if(rand > 74 && rand <= 169)
			return 'q';
		else if(rand > 169 && rand <= 319)
			return 'x';
		else if(rand > 319 && rand <= 472)
			return 'j';
		else if(rand > 472 && rand <= 1244)
			return 'k';
		else if(rand > 1244 && rand <= 2222)
			return 'v';
		else if(rand > 2222 && rand <= 3714)
			return 'b';
		else if(rand > 3714 && rand <= 5643)
			return 'p';
		else if(rand > 5643 && rand <= 7617)
			return 'y';
		else if(rand > 7617 && rand <= 9632)
			return 'g';
		else if(rand > 9632 && rand <= 11860)
			return 'f';
		else if(rand > 11860 && rand <= 14220)
			return 'w';
		else if(rand > 14220 && rand <= 16626)
			return 'm';
		else if(rand > 16626 && rand <= 19384)
			return 'u';
		else if(rand > 19384 && rand <= 22166)
			return 'c';
		else if(rand > 22166 && rand <= 26191)
			return 'l';
		else if(rand > 26191 && rand <= 30444)
			return 'd';
		else if(rand > 30444 && rand <= 36431)
			return 'r';
		else if(rand > 36431 && rand <= 42525)
			return 'h';
		else if(rand > 42525 && rand <= 48852)
			return 's';
		else if(rand > 48852 && rand <= 55601)
			return 'n';
		else if(rand > 55601 && rand <= 62567)
			return 'i';
		else if(rand > 62567 && rand <= 70074)
			return 'o';
		else if(rand > 70074 && rand <= 78241)
			return 'a';
		else if(rand > 78241 && rand <= 87297)
			return 't';
		else if(rand > 87297 && rand <= 99999)
			return 'e';
		else
			return ' ';
	}
	
	public static void main(String[] args)
	{
		Grid test = new Grid(4,4, true);
		test = new Grid(4,4, false);
		test.display();
	}
}
