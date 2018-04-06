
/*
 * tictactoe
 * 
 * The user is welcomed to tictactoe, can pick play, how to, about, or exit.
 * When selecting play, he is ofered a choice of one or two players.
 * if he choses two players, the game to get 3 Xs or Os in a row begins, plays like ttt.
 * if he choses one player, he is given the option of a easy or hard ai.
 * when the game is over, score is updated and is offered to play agian or exit to menu
 * 
 * extended to twoplayer.java, ttteasyai.java, ttthardai.java
 * 
 * @author Noah Krueger, Shardul Joshi
 * @version (4/3/18)
 */
import java.util.Scanner;
import java.util.Random;
public class TicTacToe{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Random gen = new Random();
        
        String select = "";
        boolean play = false, howto = false, about=false, oneplayer = false;
        
        int players = 0;
        while(true){
            System.out.println("\n\n\n\n\n\n\n\n\nWelcome to Tic Tac Toe!");
            System.out.println("1 | 2 | 3");
            System.out.println("----------");
            System.out.println("4 | 5 | 6");
            System.out.println("----------");
            System.out.println("7 | 8 | 9");
            System.out.println("(P)lay");
            System.out.println("(H)ow to play");
            System.out.println("(A)bout");
            System.out.println("(E)xit");
            select = input.nextLine();
            if(select.equals("P"))
                play = true;
            if(select.equals("H"))
                howto = true;
            if(select.equals("A"))
                about = true;
            if(select.equals("E"))
                break;
            while(play){
                System.out.println("Players? (1) or (2)");
                players = input.nextInt();
                if(players == 1){
                    oneplayer = true;
                    System.out.println("(E)asy computer or (H)ard computer?");
                    input.nextLine();
                    select= input.nextLine();
                    if(select.equals("E"))
                        EasyComputer.main(null);
                    if(select.equals("H"))
                        HardComputer.main(null);
                    break;
                }
                if(players == 2)
                    TwoPlayer.main(null);
                break;
            }
            while(howto){
                System.out.println("HOW TO PLAY!");
                System.out.println("Player 1 is Xs, Player 2 is Os.");
                System.out.println("Each player takes turns placing their respective X or O");
                System.out.println("and is tring to get three in a row, see example.");
                System.out.println("If all the spots are taken and no winner is delcared, its a tie.");
                System.out.println("X | O | 3");
                System.out.println("----------");
                System.out.println("X | X | O");
                System.out.println("----------");
                System.out.println("O | 8 | X");
                System.out.println("Press any key to exit to menu");
                input.nextLine();
                howto=false;
            }
            while(about){
                System.out.println("Thanks for playing!");
                System.out.println("Developed by Noah Krueger and Shardul Joshi, \nv1.0 \nlast updated 4/3/18\n\n\n\n\n");
                System.out.println("Press any key to exit to menu");
                input.nextLine();
                about=false;
            }
            select = "";
            input.nextLine();
        }
    }
}