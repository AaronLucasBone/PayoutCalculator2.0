/**
 * This class will access which payout system to use based off of the 
   number of attendees.
 * @author AaronBone
 * 7/10/2020
 */

public class Attendee {
	public static void SystemChoice(int p) {
		if(p>=45) {
			Calculator.top8Payout(p);
		}//end top 8 payout
		else if(p>=25) {
			Calculator.top5Payout(p);
		}//end top 5 payout
		else if(p>=16) {
			Calculator.top4Payout(p);
		}//end top 4 payout
		else if(p>=8) {
			Calculator.top3Payout(p);
		}//end top 3 payout
		else {
			Calculator.top2Payout(p);
		}//end top 2 payout
	}//end SystemChoice
}//end class
