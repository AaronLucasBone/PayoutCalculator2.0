/**
 * Payout Calculator 2.0. This is the main.
 * Improved performance with GUI in future. 
 * @author AaronBone
 * 7/10/2020
 */

import java.util.*;

public class Application {
	public static int entry; //singles entry fee
	public static int venue; //venue fee
	public static int total; //combined sum of entry and pot to manually check
	public static int players; //how many players
	public static int pot; //pot's total
	public static int venueCost; //venue's total
	
	public static double[] payout = new double[8]; //array for payouts
	public static Scanner reader = new Scanner(System.in); //Scanner
	
	public static void main(String[] args) {

//Players----------------------------------------		
		System.out.println("Number of Players:");
		players = reader.nextInt();
		
//Entry Fee--------------------------------------
		System.out.println("Entry Fee: ");
		entry = reader.nextInt();
		pot = entry*players;
		
//Venue Fee---------------------------------------				
		System.out.println("Venue Fee: ");
		venue = reader.nextInt();
		venue = venue*players;
		
//AttendeeSystem----------------------------------		
		Attendee.SystemChoice(players);
//Printing----------------------------------------
System.out.println("--------------------------------------");		
		for(int i=0;i<8;i++) {
			if(i==0) {
				System.out.printf("1st Place: %.2f %n", payout[i]);
			}//end if
			if(i==1) {
				System.out.printf("2nd Place: %.2f %n", payout[i]);
			}
			if(i==2) {
				System.out.printf("3rd Place: %.2f %n", payout[i]);
			}
			if(i==3) {
				System.out.printf("4th Place: %.2f %n", payout[i]);
			}
			if(i==4 || i==5) {
				System.out.printf("5th Place: %.2f %n", payout[i]);
			}
			if(i==6 || i==7) {
				System.out.printf("7th Place: %.2f %n", payout[i]);
			}
		}//end for
System.out.println("------------------------------------");

System.out.println("Venue Fee: $"+venue);
System.out.println("Pot: $"+pot);
System.out.println("Total: $"+total);

	}//end main
}//end class
