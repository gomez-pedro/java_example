/** Class that determines whether or not a year is a leap year.
 *  @author Pedro Gomez
 */
public class Year {

    /** @param  year to be analyzed
     *  @return true if year is a leap year
     *          false if year is not a leap year
     */
    static boolean isLeapYear(int year) {
        if (year % 400 == 0){
        	return true;
        } else {
        	return year % 4 == 0 && year % 100 != 0;
        }
    }

    /** Calls isLeapYear to print correct statement.
     *  @param  year to be analyzed
     */
    private static void checkLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.printf("%d is a leap year.\n", year);
        } else {
            System.out.printf("%d is not a leap year.\n", year);
        }
    }

    /** Must be provided an integer as a command line argument ARGS. */
    public static void main(String[] args) {
    	int year =2015;
        try {
        	checkLeapYear(year);
        } catch (NumberFormatException e) {
                System.out.printf("%s is not a valid number.\n", year);
        }
    }

}