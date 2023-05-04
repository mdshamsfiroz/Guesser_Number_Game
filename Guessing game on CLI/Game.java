package in.firoz.main;

import java.util.*;

class Guesser
{
	int guessNum;
	
	public int guessNumber() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Guesser bhai: Kindly guess the number");
		guessNum=sc.nextInt();
		return guessNum;
		
	}
}
class Player
{
	int pguessNum;
	public int guessNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Player bhai: Kindly guess the number");
		     pguessNum=sc.nextInt();
		     return pguessNum;
	}
	
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	
	public void collectNumFromGuesser() 
	{      
		Guesser g=new Guesser();
		numFromGuesser=g.guessNumber();
		
	}
	public void collectNumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		
		numFromPlayer1=p1.guessNumber();
		numFromPlayer2=p2.guessNumber();
		numFromPlayer3=p3.guessNumber();
	}
	
	void compare()
	{
			if(numFromGuesser==numFromPlayer1)
			{
				if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
				{
					System.out.println("Game Tied , All three Players guessed correctly");
				}
				else if(numFromGuesser==numFromPlayer2) 
				{
					System.out.println("Player 1 and Player 2 won the Game.");
				}
				else if(numFromGuesser==numFromPlayer3) 
				{
					System.out.println("Player 1 and player 3 won.");
				}
				else
				{
					System.out.println("Player 1 won the game");
				}
		 }
			else if(numFromGuesser==numFromPlayer2)
			{
				if(numFromGuesser==numFromPlayer3) 
				{
					System.out.println("Player 2 and Player 3 has won the Game.");
				}
				else 
				{
					System.out.println("Player 2 won the Game");
				}
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 3 has won the Game");
			}
			else
			{
				System.out.println("Game lost! try again");
			}
			
		}
	}

public class Game {
	public static void main(String[] args) {
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
	}
}


