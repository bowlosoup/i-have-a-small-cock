package Checkerboard;

import java.util.Scanner;

public class checkerBoard {
	public static void main(String args[])
	{
		int i = 0;
		
		int array[][] = { {1,0,1,0,1,0,1,0},
						  {0,1,0,1,0,1,0,1},
						  {1,0,1,0,1,0,1,0},
						  {0,1,0,1,0,1,0,1},
						  {1,0,1,0,1,0,1,0},
						  {0,1,0,1,0,1,0,1},
						  {1,0,1,0,1,0,1,0},
						  {0,1,0,1,0,1,0,1}
	
				
		};
		for(int row = 0; row<8; row++)
		{
			for(int column = 0; column<8; column++)
			{
				System.out.print(array[row][column]);
			}
			System.out.println("");
		
		}
		for(int row = 0; row<8; row++)
		{
			for(int column = 0; column<8; column++)
			{
				
				if (array[row][column] == 1)
				{
					if(row < 3)
					{
					array[row][column] = 2;	
					}
					else if(row > 4 )
					{
					array[row][column] = 3;
					}
				}
				System.out.print(array[row][column]);
				
			
			}
			System.out.println("");
		
		}	
		
		System.out.println("Choose a move");
		Scanner check = new Scanner(System.in);
		int move = check.nextInt();
		
		
	}	
}


