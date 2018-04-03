/*
 * extends tictactoe.java
 *
 *test 2.0
 *
 * @author Noah Krueger, Shardul Joshi
 * @version 4/3/18
 */
import java.util.Scanner;
import java.util.Random;
public class ttt2p{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Random gen = new Random();
        
        System.out.println("Player 1, enter your name:");
        String p1 = input.nextLine();
        int p1wins = 0;
       
        System.out.println("Player 2, enter your name:");
        String p2 = input.nextLine();
        int p2wins = 0;
        
        String play = "";
        int n=-1, r=9;
        
        String one="1", two="2", three="3",four="4",five="5",six="6",seven="7",eight="8",nine="9";
        /*
         *1 | 2 | 3
         *----------
         *4 | 5 | 6
         *----------
         *7 | 8 | 9
         */
        String gameboard ="";
        while(true){
            while(r>0){
                n = r;
                n%=2;
                gameboard =  one+" | "+two+" | "+three+"\n---------\n"+four+" | "+five+" | "+six+"\n---------\n"+seven+" | "+eight+" | "+nine;
                if(n==1){
                    System.out.println(gameboard);
                    while(true){
                        System.out.println(p1+"'s turn! Type a letter to play your X!");
                        play = input.nextLine();
                        if(play.equals("1")&&!one.equals("O")){
                            one="X";
                            break;
                            }
                        else if(play.equals("2")&&!two.equals("O")){
                            two="X";
                            break;
                            }
                        else if(play.equals("3")&&!three.equals("O")){
                            three="X";
                            break;
                            }
                        else if(play.equals("4")&&!four.equals("O")){
                            four="X";
                            break;
                            }
                        else if(play.equals("5")&&!five.equals("O")){
                            five="X";
                            break;
                            }
                        else if(play.equals("6")&&!six.equals("O")){
                            six="X";
                            break;
                            }
                        else if(play.equals("7")&&!seven.equals("O")){
                            seven="X";
                            break;
                            }
                        else if(play.equals("8")&&!eight.equals("O")){
                            eight="X";
                            break;
                            }
                        else if(play.equals("9")&&!nine.equals("O")){
                            nine="X";
                            break;
                            }
                        }
                    r--;
                    }
                else if(n==0){
                    System.out.println(gameboard);
                    while(true){
                        System.out.println(p2+"'s turn! Type a letter to play your O!");
                        play = input.nextLine();
                        if(play.equals("1")&&!one.equals("X")){
                            one="O";
                            break;
                            }
                        else if(play.equals("2")&&!two.equals("X")){
                            two="O";
                            break;
                            }
                        else if(play.equals("3")&&!three.equals("X")){
                            three="O";
                            break;
                            }
                        else if(play.equals("4")&&!four.equals("X")){
                            four="O";
                            break;
                            }
                        else if(play.equals("5")&&!five.equals("X")){
                            five="O";
                            break;
                            }
                        else if(play.equals("6")&&!six.equals("X")){
                            six="O";
                            break;
                            }
                        else if(play.equals("7")&&!seven.equals("X")){
                            seven="O";
                            break;
                            }
                        else if(play.equals("8")&&!eight.equals("X")){
                            eight="O";
                            break;
                            }
                        else if(play.equals("9")&&!nine.equals("X")){
                            nine="O";
                            break;
                            }
                        }
                    r--;
                    }
                }
            System.out.println(gameboard);
            System.out.println("Tie!");
            break;
            }
        }
            //exit option
    }