import java.util.Random;
import java.util.Scanner;

public class TicTacToeComputer {
    static String[] Board = new String[10];
    static String turn = "X";
    public static void main(String[] args)
    {
        String fin = "null";
        String com = "player";
        try (Scanner in = new Scanner(System.in)) {
            for(int i =0; i<9; i++)
            {
                Board[i] = Integer.toString(i+1);
            }
            printBoard();
            
            int j =0,input =0;
            for(int i =0; i<9; i++)
            {
                System.out.println("It is turn of "+com);
                System.out.print(com +" choose the number : ");
                
                if(com.equals("player")){input = in.nextInt();}
                else if(com.equals("computer")) {
                    Random rand = new Random();
                    input = rand.nextInt(9);
                    System.out.println(input);
                }
                if(input <= 0 || input > 9)
                {
                    System.out.println("invalid input , it shoud be 1 to 9");
                    continue;
                }
                else{
                    if(Board[input-1].equals(Integer.toString(input)) )
                    {
                        Board[input-1] = turn;
                        if(turn.equals("X")) turn = "O";
                        else turn = "X";
                        printBoard();
                        Winner win = new Winner(Board);
                        if(win.wini.equals("X")|| win.wini.equals("O")) 
                        {
                            System.out.println(com+" won the match");
                            fin = "null";
                            break;
                        }
                        else fin = "draw";
                    }
                    
                    else 
                    {
                        System.out.println("already filled plase pick any other number");
                        continue;
                    }
                }
                j++;
                if(j%2 == 0) com = "player";
                else com = "computer";
            }
        }
        if(fin.equals("draw")) System.out.println("draw");
    }
    private static void printBoard() {
        for(int i =0; i<9; i+=3)
        {
            System.out.println( Board[i] + " | "+ Board[i+1]+" | "+ Board[i+2]);
            System.out.println("---------");
        }
    }
}
