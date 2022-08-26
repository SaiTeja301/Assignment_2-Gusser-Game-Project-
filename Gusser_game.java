package Gusser_Gamee;

import java.util.Scanner;

class Gusser
{
	int gsnum;
	public int gusserNumber()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Gusser please Gusses the Number inRange of 0-100 :");
		gsnum= s.nextInt();
		return gsnum;
	}
}
class player
{
	int plnum;
	public int plnum()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Player please Enter the input in Range of 0-100 :");
		plnum =s.nextInt();
		return plnum;
	}
}
class Umpire
{
	int numFromGusser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	public void collectNumberFromGusser()
	{
		Gusser gs = new Gusser();
		numFromGusser=gs.gusserNumber();
	}
	public void collectNumbersFromPlayers()
	{
		player pl1=new player();
		player pl2=new player();
		player pl3=new player();
		numFromPlayer1=pl1.plnum();
		numFromPlayer2=pl2.plnum();
		numFromPlayer3=pl3.plnum();
	}
	public void compare()
	{
		if(numFromGusser<100)
		{
			if(numFromPlayer1<100)
			{
				if(numFromGusser==numFromPlayer1)
				{
					if(numFromGusser==numFromPlayer2&&numFromGusser==numFromPlayer3)
					{
						System.out.print("-------------->");
						System.out.println("Match tied all Three players are won the Match!");
					}
					else if(numFromGusser==numFromPlayer2)
					{
						System.out.print("-------------->");
						System.out.println("Player 1 and player 2 are Won the Match!");
					}
					else if(numFromGusser==numFromPlayer3)
					{
						System.out.print("-------------->");
						System.out.println("Player 1 and player 3 are Won the Match!");
					}
					else
					{
						System.out.print("-------------->");
						System.out.println("Player 1 won the Match");
					}
				}
			}
			if(numFromPlayer2<100&&numFromGusser!=numFromPlayer1)
			{
				if(numFromGusser==numFromPlayer2)
				{
					if(numFromGusser==numFromPlayer3)
					{
						System.out.print("-------------->");
						System.out.println("Player 2 and Player 3 are Won the Match!");
					}
					else
					{
						System.out.print("-------------->");
						System.out.println("Player 2 Won The Match");
					}
				}
			}
		    if(numFromPlayer3<100&&numFromGusser!=numFromPlayer1&&numFromGusser!=numFromPlayer2)
			{
				if(numFromGusser==numFromPlayer3)
				{
					System.out.print("-------------->");
					System.out.println("Player 3 Won The Match");
				}
			}
		    if(numFromGusser!=numFromPlayer1&&(numFromGusser==numFromPlayer2||numFromGusser==numFromPlayer3)||(numFromPlayer2==numFromPlayer3))
			{
		    	if(numFromGusser!=numFromPlayer1)
		    	{
		    		System.out.print("<----");
		    		System.out.println("Player 1 Better Luck Next Time---->");
		    	}
			}
		    if(numFromGusser!=numFromPlayer2&&(numFromGusser==numFromPlayer1||numFromGusser==numFromPlayer3)||(numFromPlayer1==numFromPlayer3))
			{
		    	if(numFromGusser!=numFromPlayer2)
		    	{
		    		System.out.print("<----");
		    		System.out.println("Player 2 Better Luck Next Time---->");
		    	}
			}
		    if(numFromGusser!=numFromPlayer3&&(numFromGusser==numFromPlayer1||numFromGusser==numFromPlayer2)||(numFromPlayer1==numFromPlayer2))
			{
		    	if(numFromGusser!=numFromPlayer3)
		    	{
		    		System.out.print("<----");
		    		System.out.println("Player 3 Better Luck Next Time---->");
		    	}
			}
		    if(numFromPlayer1>100)
			{
				System.out.println("***************************************");
				System.out.println("Player 1 please Select the number in the Range 0-100");
			}
			if(numFromPlayer2>100)
			{
				System.out.println("***************************************");
				System.out.println("Player 2 please Select the number in the Range 0-100");
			}
			if(numFromPlayer3>100)
			{
				System.out.println("***************************************");
				System.out.println("Player 3 please Select the number in the Range 0-100");
			}
			
		}
	    if(numFromGusser>100)
		{
			System.out.print("<----");
			System.out.println("Gusser Please Select The number in the 0-100---->");
		}
	    else if(numFromGusser!=numFromPlayer1&&numFromGusser!=numFromPlayer2&&numFromGusser!=numFromPlayer3)
		{
			System.out.print("-------------->");
			System.out.println("Game Lost try again");
		}
	}
}
public class Gusser_game 
{
     public static void main(String args[])
     {
    	 Umpire um = new Umpire();
    	 um.collectNumberFromGusser();
    	 um.collectNumbersFromPlayers();
    	 um.compare();
     }
}
