/*
 * extends TicTacToe.java (not directly)
 * checks for winner in TicTacToe.java
 *
 * @author Shardul Joshi, Noah Krueger
 * @version 4/6/18
 */
public class CheckWinner{
    public static boolean checkX(String[]gameboard){
        if(gameboard[1].equals("X")&&gameboard[1].equals(gameboard[2])&&gameboard[1].equals(gameboard[3])){
            return true;
        }else if(gameboard[1].equals("X")&&gameboard[4].equals(gameboard[5])&&gameboard[4].equals(gameboard[6])){
            return true;
        }else if(gameboard[7].equals("X")&&gameboard[7].equals(gameboard[8])&&gameboard[7].equals(gameboard[9])){
            return true;
        }else if(gameboard[1].equals("X")&&gameboard[1].equals(gameboard[4])&&gameboard[1].equals(gameboard[7])){
            return true;
        }else if(gameboard[2].equals("X")&&gameboard[2].equals(gameboard[5])&&gameboard[2].equals(gameboard[8])){
            return true;
        }else if(gameboard[3].equals("X")&&gameboard[3].equals(gameboard[6])&&gameboard[3].equals(gameboard[9])){
            return true;
        }else if(gameboard[1].equals("X")&&gameboard[1].equals(gameboard[5])&&gameboard[1].equals(gameboard[9])){
            return true;
        }else if(gameboard[3].equals("X")&&gameboard[3].equals(gameboard[5])&&gameboard[3].equals(gameboard[7])){
            return true;
        }else{
            return false;
        }
    }
    public static boolean checkO(String[]gameboard){
        if(gameboard[1].equals("O")&&gameboard[1].equals(gameboard[2])&&gameboard[1].equals(gameboard[3])){
            return true;
        }else if(gameboard[1].equals("O")&&gameboard[4].equals(gameboard[5])&&gameboard[4].equals(gameboard[6])){
            return true;
        }else if(gameboard[7].equals("O")&&gameboard[7].equals(gameboard[8])&&gameboard[7].equals(gameboard[9])){
            return true;
        }else if(gameboard[1].equals("O")&&gameboard[1].equals(gameboard[4])&&gameboard[1].equals(gameboard[7])){
            return true;
        }else if(gameboard[2].equals("O")&&gameboard[2].equals(gameboard[5])&&gameboard[2].equals(gameboard[8])){
            return true;
        }else if(gameboard[3].equals("O")&&gameboard[3].equals(gameboard[6])&&gameboard[3].equals(gameboard[9])){
            return true;
        }else if(gameboard[1].equals("O")&&gameboard[1].equals(gameboard[5])&&gameboard[1].equals(gameboard[9])){
            return true;
        }else if(gameboard[3].equals("O")&&gameboard[3].equals(gameboard[5])&&gameboard[3].equals(gameboard[7])){
            return true;
        }else{
            return false;
        }
    }
}
