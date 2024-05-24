package com.player.SportsTeam;

import java.util.*;
import java.util.Scanner;

public class App {
	private static HashSet<String> teamList = new HashSet<String>();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main( String[] args )
    {
        
        while (true) {
            System.out.println("1. Add Player");
            System.out.println("2. Remove Player");
            System.out.println("3. Check Player is the team");
            System.out.println("4. Display Customers");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addPlayer();
                    break;
                case 2:
                    removePlayer();
                    break;
                case 3:
                    checkPlayer();
                    break;
                case 4:
                    displayPlayers();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
	
	private static void addPlayer()
	{
		System.out.println("Enter the player name: ");
		String player = sc.nextLine();
		teamList.add(player);
	}
	
	private static void removePlayer()
	{
		System.out.println("Enter the player name: ");
		String player = sc.nextLine();
		teamList.remove(player);
	}
	
	private static void checkPlayer()
	{
		System.out.println("Enter the player name: ");
		String player = sc.nextLine();
		
		if(teamList.contains(player))
		{
			System.out.println("Player exists.");
		}
		else
		{
			System.out.println("No player exits with this name.");
		}
	}
	
	private static void displayPlayers()
	{
		if(teamList.isEmpty())
		{
			System.out.println("No players to display.");
		}
		else
		{
			System.out.println(teamList);
		}
	}
}
