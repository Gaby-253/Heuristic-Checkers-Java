package checkers; // This package is required - don't remove it
public class EvaluatePosition // This class is required - don't remove it
{
	static private final int WIN=Integer.MAX_VALUE/2;
	static private final int LOSE=Integer.MIN_VALUE/2;
	static private boolean _color; // This field is required - don't remove it
	static public void changeColor(boolean color) // This method is required - don't remove it
	{
		_color=color;
	}
	static public boolean getColor() // This method is required - don't remove it
	{
		return _color;
	}
	static public int evaluatePosition(AIBoard board) // This method is required and it is the major heuristic method - type your code here
	{
		int myRating=0;
		int opponentsRating=0;
		int size=board.getSize();
		for (int i=0;i<size;i++)
		{
			for (int j=(i+1)%2;j<size;j+=2)
			{
				if (!board._board[i][j].empty) // field is not empty
				{
					
					if (board._board[i][j].white==getColor()) // this is my piece
					{
						
						if (i==0) // This is if the pawn are in back row
						{
							myRating+=4;
							if (board._board[i][j].king) myRating+=7.5; // this is my king
							else myRating+=5; // this is my piece
						}
						else if ( ((i==3) || (i==4)) && ((j>=2) && (j<=5)) ) // This is pawns in middle 2 rows and 4 columns
						{
							myRating+=2.5;
							if (board._board[i][j].king) myRating+=7.5; // this is my king
							else myRating+=5; // this is my piece
						}
						else if ( ((i==3) || (i==4)) && !((j>=2) && (j<=5)) ) // This is pawns in midlle 2row but not middle column
						{
							myRating+=0.5;
							if (board._board[i][j].king) myRating+=7.5; // this is my king
							else myRating+=5; // this is my piece
						}
						else if ( ((board._board[i+1][j+1].white!=getColor())||(board._board[i+1][j-1].white!=getColor()))) //This is Number of pieces that can be taken by opp
						{
							myRating-=3;
							if (board._board[i][j].king) myRating+=7.5; // this is my king
							else myRating+=5; // this is my piece
						}
						else
						{
							if (board._board[i][j].king) myRating+=7.5; // this is my king
							else myRating+=5; // this is my piece
						}
					}
					
					
					else
					{
						if (i==0)
						{
							opponentsRating+=4;
							if (board._board[i][j].king) opponentsRating+=7.5; // This is opponent's king
							else opponentsRating+=5;
						}
						else if ( ((i==3) || (i==4)) && ((j>=2) && (j<=5)) )
						{
							opponentsRating+=2.5;
							if (board._board[i][j].king) opponentsRating+=7.5; // this is my king
							else opponentsRating+=5; // this is my piece
						}
					    else if ( ((i==3) || (i==4)) && !((j>=2) && (j<=5)) )
						{
							opponentsRating+=0.5;
							if (board._board[i][j].king) opponentsRating+=7.5; // this is my king
							else opponentsRating+=5; // this is my piece
						}
						else if ((board._board[i+1][j+1].white!=getColor())||(board._board[i+1][j-1].white!=getColor()))
						{
							opponentsRating-=3;
							if (board._board[i][j].king) opponentsRating+=7.5; // this is my king
							else opponentsRating+=5; // this is my piece
						}
						else
						{
							if (board._board[i][j].king) opponentsRating+=7.5; // This is opponent's king
							else opponentsRating+=5;
						}
						

					}
				}
			}
		}
		//Judge.updateLog("Type your message here, you will see it in the log window\n");
		if (myRating==0) return LOSE; 
		else if (opponentsRating==0) return WIN; 
		else return myRating-opponentsRating;
	}
}