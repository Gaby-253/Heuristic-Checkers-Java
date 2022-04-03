/*
In order to create my evaluation (heuritic function)     I used these website/github : 
--https://www.geeksforgeeks.org/minimax-algorithm-in-game-theory-set-3-tic-tac-toe-ai-finding-optimal-move/?ref=rp
--https://www.tutorialandexample.com/knowledge-representation-in-ai/
--https://kcir.pwr.edu.pl/~witold/ai/Checkers_manual/api_en.html
--https://github.com/justinjose7/checkers-ai
--https://github.com/ibid-11962/Checkers-AI 

                                I also used this paper/litterature : 
--CS 4701: Final Project Report ; Optimal Heuristic For Checkers ; Kevin Gregor (krg43) Marcus Boeck-Chenevier (mb2533)
--Mańdziuk, J., Kusiak, M. and Walędzik, K. (2007), Evolutionary‐based heuristic generators for checkers and give‐away checkers. Expert Systems, 24: 189-211. https://doi.org/10.1111/j.1468-0394.2007.00429.x
--https://www.cs.huji.ac.il/~ai/projects/old/English-Draughts.pdf
--Artificial-Intelligence-A-Modern-Approach-3rd-Edition

                                And finally this video was also helpful : 
--https://www.youtube.com/watch?v=y7AKtWGOPAE&t=555s
--https://www.youtube.com/watch?v=l-hh51ncgDI

For this heursitic function, the part take into account are : 
-If the pieces are in back row, to get off this one the last moment.
-If the pieces are in middle 2 rows and 4 columns because it is a strategic place in checkers.
-If the pieces are in midlle 2row but not middle column.
-If it's a king.
-Or a piece.

(I have tried to enhance my function with a test : If there are some empty place between 3 of my piece, but it was no helpful.)
*/

