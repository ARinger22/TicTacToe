
public class Winner {
    String x = "XXX";
    String y = "OOO";
    String wini="null";
    Winner(String[] Board)
    {
        int  i =0;
        while(i < 8)
        {
            String check = "";
            switch(i){
                case 0:{ check = Board[0]+Board[1]+Board[2];
                    break;
                }
                case 1:
                {
                    check = Board[0]+Board[3]+Board[6];
                    break;
                }
                case 2:
                {
                    check = Board[3]+Board[4]+Board[5];
                    break;
                }
                case 3:
                {
                    check = Board[6]+Board[7]+Board[8];
                    break;
                }
                case 4:
                {
                    check = Board[1]+Board[4]+Board[7];
                    break;
                }
                case 5:
                {
                    check = Board[0]+Board[4]+Board[8];
                    break;
                }
                case 6:
                {
                    check = Board[2]+Board[4]+Board[6];
                    break;
                }
                case 7:
                {
                    check = Board[2]+Board[5]+Board[8];
                    break;
                }

            }
            if(check.equals(x)) {wini = "X"; break;}
            else if(check.equals(y)) {wini = "O"; break;}
            i++;
        }
        // if(j == 8) wini = "draw";
    }
}
