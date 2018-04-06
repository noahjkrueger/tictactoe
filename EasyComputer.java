/*
 * extends TicTacToe.java
 *
 * @author Noah Krueger, Shardul Joshi
 * @version 4/3/18
 */
import java.util.Scanner;
import java.util.Random;
public class EasyComputer{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Random gen = new Random();
        
        System.out.println("Enter your name:");
        String name = input.nextLine();
        int p1score = 0;
        int cscore = 0;
        
        String[]gameboard = new String[10];
        String printedGameBoard;
        int turn=0;
        String again ="";
        String play ="";
        int cplay=0;
        boolean playing = true;
        boolean p1win, cwin;
        while(playing){
            gameboard[1] = "1";
            gameboard[2] = "2";
            gameboard[3] = "3";
            gameboard[4] = "4";
            gameboard[5] = "5";
            gameboard[6] = "6";
            gameboard[7] = "7";
            gameboard[8] = "8";
            gameboard[9] = "9";
            for(int r = 9; r>0; r--){
                turn=r;
                turn%=2;
                printedGameBoard = gameboard[1] +" | "+gameboard[2]+" | "+gameboard[3]+"\n---------\n"+gameboard[4]+" | "+gameboard[5]+" | "+gameboard[6]+"\n---------\n"+gameboard[7]+" | "+gameboard[8]+" | "+gameboard[9];
                System.out.println(printedGameBoard);
                if(turn==1){
                    while(true){
                        System.out.println("Your turn! Type a number to play your X!");
                        play = input.nextLine();
                        if(play.equals("1")&&!gameboard[1].equals("O")&&!gameboard[1].equals("X")){
                            gameboard[1]="X";
                            break;
                        }
                        else if(play.equals("2")&&!gameboard[2].equals("O")&&!gameboard[2].equals("X")){
                            gameboard[2]="X";
                            break;
                        }
                        else if(play.equals("3")&&!gameboard[3].equals("O")&&!gameboard[3].equals("X")){
                            gameboard[3]="X";
                            break;
                        }
                        else if(play.equals("4")&&!gameboard[4].equals("O")&&!gameboard[4].equals("X")){
                            gameboard[4]="X";
                            break;
                        }
                        else if(play.equals("5")&&!gameboard[5].equals("O")&&!gameboard[5].equals("X")){
                            gameboard[5]="X";
                            break;
                        }
                        else if(play.equals("6")&&!gameboard[6].equals("O")&&!gameboard[6].equals("X")){
                            gameboard[6]="X";
                            break;
                        }
                        else if(play.equals("7")&&!gameboard[7].equals("O")&&!gameboard[7].equals("X")){
                            gameboard[7]="X";
                            break;
                        }
                        else if(play.equals("8")&&!gameboard[8].equals("O")&&!gameboard[8].equals("X")){
                            gameboard[8]="X";
                            break;
                        }
                        else if(play.equals("9")&&!gameboard[9].equals("O")&&!gameboard[9].equals("X")){
                            gameboard[9]="X";
                            break;
                        }
                    }
                    p1win = CheckWinner.checkX(gameboard); 
                    if(p1win){
                        p1score++;
                        break;
                    }
                }
                else if(turn==0){
                    while(true){
                        cplay = gen.nextInt(9)+1;
                        System.out.println(cplay);
                        if(cplay==1&&!gameboard[1].equals("X")&&!gameboard[1].equals("O")){
                            gameboard[1]="O";
                            break;
                        }
                        else if(cplay==2&&!gameboard[2].equals("X")&&!gameboard[2].equals("O")){
                            gameboard[2]="O";
                            break;
                        }
                        else if(cplay==3&&!gameboard[3].equals("X")&&!gameboard[3].equals("O")){
                            gameboard[3]="O";
                            break;
                        }
                        else if(cplay==4&&!gameboard[4].equals("X")&&!gameboard[4].equals("O")){
                            gameboard[4]="O";
                            break;
                        }
                        else if(cplay==5&&!gameboard[5].equals("X")&&!gameboard[5].equals("O")){
                            gameboard[5]="O";
                            break;
                        }
                        else if(cplay==6&&!gameboard[6].equals("X")&&!gameboard[6].equals("O")){
                            gameboard[6]="O";
                            break;
                        }
                        else if(cplay==7&&!gameboard[7].equals("X")&&!gameboard[7].equals("O")){
                            gameboard[7]="O";
                            break;
                        }
                        else if(cplay==8&&!gameboard[8].equals("X")&&!gameboard[8].equals("O")){
                            gameboard[8]="O";
                            break;
                        }
                        else if(cplay==9&&!gameboard[9].equals("X")&&!gameboard[9].equals("O")){
                            gameboard[9]="O";
                            break;
                        }
                    }
                    cwin = CheckWinner.checkX(gameboard); 
                    if(cwin){
                        cscore++;
                        break;
                    }
                }
            }
            System.out.println("The score is "+name+" with "+p1score+" wins and I have "+cscore+" wins.\nWould you like to play agian? Y/N");
            again = input.nextLine();
            if(again.equals("N")){
                System.out.println("Okay, goodbye. Thanks for playing!");
                playing = false;
            }
        }
    }
}