package checkers; // This package is required - don't remove it
public class EvaluatePosition // This class is required - don't remove it
{
	// static private final int WIN=Integer.MAX_VALUE/2;
	// static private final int LOSE=Integer.MIN_VALUE/2;
	static private boolean _color; // This field is required - don't remove it
	static public void changeColor(boolean color) // This method is required - don't remove it
	{
		_color=color;
	}
	static public boolean getColor() // This method is required - don't remove it
	{
		return _color;
	}
	static public int safePawns(int i, int j)
	{
		int safePawnsnb=0;
		
						if (j==0 || j == 7) // on the border left or right
						safePawnsnb+=2;
		
		return safePawnsnb;
	}
	static public int evaluatePosition(AIBoard board) // This method is required and it is the major heuristic method - type your code here
	{
		int boardval=0;
		int oppKings = 0;
		int oppPawns = 0;
		int allyKings=0;
		int allyPawns=0;
		int size=board.getSize();
		int u=0,y=0;
		for (int i=0;i<size;i++)
		{
			for (int j=(i+1)%2;j<size;j+=2)
			{
				if (!board._board[i][j].empty) // field is not empty
				{
					if (board._board[i][j].white==getColor()) // this is my piece
					{
						if (board._board[i][j].king) allyKings+=5; // this is my king
						else allyPawns+=1; // this is my piece
						u = safePawns(i,j);
						y = u+y;
					}
					else
					{
						if (board._board[i][j].king) oppKings+=5; // This is opponent's king
						else oppPawns+=1;
					}
					
				}
			}
		}
		boardval = allyKings+allyPawns-oppKings-oppPawns+y;
		//Judge.updateLog("Type your message here, you will see it in the log window\n");
		return boardval;
	}
}
