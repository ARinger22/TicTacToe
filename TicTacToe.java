import java.util.Scanner;


public class TicTacToe {
    static String[] Board = new String[9];
    static String turn = "X";
    
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in)) {
            String winner = "null";
            for(int i =0; i< 9; i++)
            {
                Board[i] = Integer.toString(i+1);
            }
            System.out.println("Welcome to 3x3 Tic Tac Toe.");
            printBoard();

            
            int i = 1,j =0;
            while(j <= 8)
            {
                System.out.println("It is the move of player : "+i);
                System.out.print("pleae pick a number to put "+turn+" in place of it: ");
                int input;
                input = in.nextInt();

                if(input <= 0 && input > 9)
                {
                    System.out.println("invalid input , it should be 1 to 9");
                    continue;
                }
                else
                {
                    
                    if(Board[input-1] != "X" && Board[input-1] != "O")
                    {
                        Board[input-1] = turn;
                        if(turn == "X") turn = "O";
                        else if(turn == "O") turn = "X";
                        printBoard();
                        Winner win = new Winner(Board);
                        if(win.wini == "X") 
                        {
                            System.out.println("our winner is: "+i); 
                            winner = "null";
                            break;
                        }
                        else if(win.wini == "O") 
                        {
                            System.out.println("our winner is: "+i); 
                            winner = "null";
                            break;
                        }
                        else winner = "draw";
                    }
                    else 
                    {
                        System.out.println("already filled so choose any other number");
                        continue;
                    }
                }
                i++;j++;
                if(i == 3) i =1;
            }
            if(winner == "draw") System.out.println(winner);
        }
        
    }

    private static void printBoard() {
        for(int i =0; i< 9; i += 3) 
        {
            System.out.println( Board[i] + " | "+ Board[i+1]+" | "+ Board[i+2]);
            System.out.println("---------");
        }
    }
}
