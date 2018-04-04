/*
 * extends TicTacToe.java
 * two player mode for TicTacToe.java
 *
 *test
 *
 * @author Noah Krueger, Shardul Joshi
 * @version 4/3/18
 */
import java.util.Scanner;
public class TwoPlayer{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Player 1, enter your name:");
        String p1 = input.nextLine();
        int p1wins = 0;
       
        System.out.println("Player 2, enter your name:");
        String p2 = input.nextLine();
        int p2wins = 0;

        int turn=0; 
        
        String one="1", two="2", three="3",four="4",five="5",six="6",seven="7",eight="8",nine="9";
        /*starting board
        *1 | 2 | 3
        *----------
        *4 | 5 | 6
        *----------
        *7 | 8 | 9
        */
        String[] gameboard = new String[9];
        gameboard[1] = "1";
        gameboard[2] = "2";
        gameboard[3] = "3";
        gameboard[4] = "4";
        gameboard[5] = "5";
        gameboard[6] = "6";
        gameboard[7] = "7";
        gameboard[8] = "8";
        gameboard[9] = "9";
        String printedGameBoard;
        String again ="";
        String play ="";
        boolean playing = true;
        while(playing){
            for(int r = 9; r>0; r--){
                turn=r;
                turn%=2;
                printedGameBoard = gameboard[1] +" | "+gameboard[2]+" | "+gameboard[3]+"\n---------\n"+gameboard[4]+" | "+gameboard[5]+" | "+gameboard[6]+"\n---------\n"+gameboard[7]+" | "+gameboard[8]+" | "+gameboard[9];
                if(turn==1){
                    System.out.println(printedGameBoard);
                    while(true){
                        System.out.println(p1+"'s turn! Type a number to play your X!");
                        play = input.nextLine();
                        if(play.equals("1")&&!gameboard[1].equals("O")){
                            one="X";
                            break;
                        }
                        else if(play.equals("2")&&!gameboard[2].equals("O")){
                            two="X";
                            break;
                        }
                        else if(play.equals("3")&&!gameboard[3].equals("O")){
                            three="X";
                            break;
                        }
                        else if(play.equals("4")&&!gameboard[4].equals("O")){
                            four="X";
                            break;
                        }
                        else if(play.equals("5")&&!gameboard[5].equals("O")){
                            five="X";
                            break;
                        }
                        else if(play.equals("6")&&!gameboard[6].equals("O")){
                            six="X";
                            break;
                        }
                        else if(play.equals("7")&&!gameboard[7].equals("O")){
                            seven="X";
                            break;
                        }
                        else if(play.equals("8")&&!gameboard[8].equals("O")){
                            eight="X";
                            break;
                        }
                        else if(play.equals("9")&&!gameboard[9].equals("O")){
                            nine="X";
                            break;
                        }
                    }
                    CheckWinner.check(null);
                    if (gameboard[1].equals(gameboard[4])&&gameboard[1].equals(gameboard[7])){
                        if (one.equals("X")){
                            System.out.println(p1 + " wins!");
                            p1wins++;
                        }
                        else
                        {
                            System.out.println(p2 + " wins!");
                            p2wins++;
                        }
                    }
                }
                else if(turn==0){
                    System.out.println(printedGameBoard);
                    while(true){
                        System.out.println(p2+"'s turn! Type a letter to play your O!");
                        play = input.nextLine();
                        if(play.equals("1")&&!gameboard[1].equals("X")){
                            one="O";
                            break;
                        }
                        else if(play.equals("2")&&!gameboard[2].equals("X")){
                            two="O";
                            break;
                        }
                        else if(play.equals("3")&&!gameboard[3].equals("X")){
                            three="O";
                            break;
                        }
                        else if(play.equals("4")&&!gameboard[4].equals("X")){
                            four="O";
                            break;
                        }
                        else if(play.equals("5")&&!gameboard[5].equals("X")){
                            five="O";
                            break;
                        }
                        else if(play.equals("6")&&!gameboard[6].equals("X")){
                            six="O";
                            break;
                        }
                        else if(play.equals("7")&&!gameboard[7].equals("X")){
                            seven="O";
                            break;
                        }
                        else if(play.equals("8")&&!gameboard[8].equals("X")){
                            eight="O";
                            break;
                        }
                        else if(play.equals("9")&&!gameboard[9].equals("X")){
                            nine="O";
                            break;
                        }
                    }
                    if (gameboard[1].equals(gameboard[4])&&gameboard[1].equals(gameboard[7])){
                        if (one.equals("X")){
                            System.out.println(p1 + " wins!");
                            p1wins++;
                        }
                        else
                        {
                            System.out.println(p2 + " wins!");
                            p2wins++;
                        }
                    }
                }
                
                //win conditions here, dont forget to add to score
            }
            System.out.println("The score is "+p1+" with "+p1wins+" wins and "+p2+" with "+p2wins+" wins.\nWould you like to play agian? Y/N");
            again = input.nextLine();
            if(again.equals("N")){
                System.out.println("Okay, goodbye. Thanks for playing!");
                playing = false;
            }
        }
    }
}