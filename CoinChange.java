public class CoinChange {
    public static String findChange(int onesAvailable, int fivesAvailable, int amount) {
        // setting initial value of change
        String change = "NP";

        // Find out the maximum number of $5 coins that is needed 
        int fivesNeeded = amount/5;
        // if required number of $5 coins are not available, use the available $coins
        if(fivesNeeded >= fivesAvailable) {
            fivesNeeded = fivesAvailable;
        }

        //Find out the remaining number of $1 coin needed
        int onesNeeded = amount - (fivesNeeded*5);
        // if required number of $1 coins are not available , use the available number and construct the return string
        if(onesNeeded <= onesAvailable) {
            change = onesNeeded + " and " + fivesNeeded;
        }

        // returning the result
        return change;
    }
}