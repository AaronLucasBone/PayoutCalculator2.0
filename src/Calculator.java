/**
 * This class calculates percentages to update the payout array.
 * @author Aaron
 * 7/10/2020
 */

public class Calculator {
	/**
	 * Top 8 Payout
	 * @param p
	 */
		public static void top8Payout(int p) {
			Application.payout[0]=Application.pot*.34;
			Application.payout[1]=Application.pot*.2489;
			Application.payout[2]=Application.pot*.15;
			Application.payout[3]=Application.pot*.09;
			Application.payout[4]=Application.pot*.05;
			Application.payout[5]=Application.pot*.05;
			Application.payout[6]=Application.pot*.03555;
			Application.payout[7]=Application.pot*.03555;
		}//end top8Payout
	
	/**
	 *Top 5 Payout
	 *@param p	
	 */
		public static void top5Payout(int p) {
			Application.payout[0]=Application.pot*.36;
			Application.payout[1]=Application.pot*.26;
			Application.payout[2]=Application.pot*.16;
			Application.payout[3]=Application.pot*.092;
			Application.payout[4]=Application.pot*.064;
			Application.payout[5]=Application.pot*.064;
			Application.payout[6]=0;
			Application.payout[7]=0;
		}//end top5Payout
		
	/**
	 * Top 4 Payout
	 * @param p
	 */
		public static void top4Payout(int p) {
			Application.payout[0]=Application.pot*.40;
			Application.payout[1]=Application.pot*.30;
			Application.payout[2]=Application.pot*.20;
			Application.payout[3]=Application.pot*.10;
			Application.payout[4]=0;
			Application.payout[5]=0;
			Application.payout[6]=0;
			Application.payout[7]=0;
		}//end top4Payout
	/**
	 * Top 3 Payout
	 * @param p
	 */
		public static void top3Payout(int p) {
			Application.payout[0]=Application.pot*.5;
			Application.payout[1]=Application.pot*.3;
			Application.payout[2]=Application.pot*.2;
			Application.payout[3]=0;
			Application.payout[4]=0;
			Application.payout[5]=0;
			Application.payout[6]=0;
			Application.payout[7]=0;
		}//end top3Payout
		
	/**
	 * Top 2 Payout
	 * @param p
	 */
		public static void top2Payout(int p) {
			Application.payout[0]=Application.pot*.6;
			Application.payout[1]=Application.pot*.4;
			Application.payout[2]=0;
			Application.payout[3]=0;
			Application.payout[4]=0;
			Application.payout[5]=0;
			Application.payout[6]=0;
			Application.payout[7]=0;
		}//end top2Payout
}//end class
