/**
 * Toolkit for Swedish ID
 *
 * @version 2.2
 * @author Evan Huynh
 */
package eh223im_assign2;

import java.util.Random;

public class SweID {
    // I have done this one before
    // Algorithm remains similar.
    // Here is the source, for citation, because of academic rules:
    // https://github.com/My2ndAngelic/1DV506/blob/eb7242b9b0222179908b750116370037dae3f16d/src/main/java/eh223im_assign3/SweID.java
    // This is more consistent than those block comments.

    // Here is the proper citation for the code, just in case.
    /**
     * Author(s) name: My2ndAngelic
     * Date: 2017 Dec
     * Title of program/source code: SweID
     * Code version: N/A
     * Type: computer program
     * Web address or publisher (e.g. program publisher, URL): https://github.com/My2ndAngelic/1DV506/blob/eb7242b9b0222179908b750116370037dae3f16d/src/main/java/backup/eh223im_assign3/SweID.java
     */

    /**
     * Return the first part of the ID, requires full ID in string.
     * @param sweID
     * @return first part of the ID
     */
    private static String getFirstPart(String sweID) {
        return sweID.substring(0,6);
    }

    /**
     * Return the second part of the ID, requires full ID in string.
     * @param sweID
     * @return second part of the ID
     */
    private static String getSecondPart(String sweID) {
        return sweID.substring(7,11);
    }

    /**
     * Check if ID is female, requires full ID in string.
     * @param sweID
     * @return true if female
     */
    private static boolean isFemaleNumber(String sweID) {
        int a = Integer.parseInt(sweID.substring(9,10));
        return a%2==0; //first digit in second part is even
    }

    // Written in 2020. Return year in 2 digit or 4 digits.
    private static int getYear(String sweID, int n) {
        int a = Integer.parseInt(sweID.substring(0,2));
        if (n==2) { // Return only year in 2 digits
            return a;
        } else if (n==4) { // Return year in 4 digits
            if (a >= 30) { // No one is born in 2030, yet
                a += 1900;
            } else { // From 2000-2029
                a += 2000;
            }
            return a;
        } return 0;
    }

    /**
     * Self-explanatory
     * @param sweID
     * @return
     */
    private static int getMonth(String sweID) {
        return Integer.parseInt(sweID.substring(2,4));
    }

    /**
     * Self-explanatory
     * @param sweID
     * @return
     */
    private static int getDay(String sweID) {
        return Integer.parseInt(sweID.substring(4,6));
    }

    /**
     * Check for valid month
     * @param sweID
     * @return true if getMonth() returns 1 - 12
     */
    private static boolean isValidMonth(String sweID) {
        return getMonth(sweID) >= 1 && getMonth(sweID) <= 12;
    }

    /**
     * Check for leap year.
     * @param sweID
     * @return true if getYear return a leap year.
     */
    private static boolean isLeap(String sweID) {
        int year = getYear(sweID,4);
        return year % 4 == 0 && (year % 100 == 0 && year % 400 == 0); // Standard leap year algorithm. Those year if divides 4, and if divides by 100 it should not divides 400.
    }

    /**
     * Check for valid date
     * This one has been adopted and fixed some bugs from the original source.
     * @param sweID
     * @return true if it is valid
     */
    private static boolean isValidDate(String sweID) {
        int month = getMonth(sweID);
        int day = getDay(sweID);
        boolean leap = isLeap(sweID);
        int min = 1; int max;

        switch (month) { // Switching max and min for the day in the month.
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                max = 31;
                break;
            case 2:
                if (leap) {
                    max = 29;
                } else {
                    max = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                max = 30;
                break;
            default:
                min = -1;
                max = -1;
                break;
        }

        // Check starts here
        boolean check = false;
        if (month >= 1 && month <= 12) { // Check for months
            if ((day >= min) && (day <= max)) { // Check for days in the month
                check = true;
            }
        }
        return check;
    }

    /**
     * Get the checksum digit, only process first 9 digits YYMMDD-NNN of the ID
     * @param sweID
     * @return checksum value
     */
    private static int getChecksum(String sweID) {
        int a, b = 0;
        String sweID2=sweID.substring(0,6) + sweID.substring(7,10);
        for (int i = 0; i < sweID2.length(); i++) { // multiplication pattern: 21212-121
            int i1 = Integer.parseInt(sweID2.substring(i,i+1));
            if (i % 2 == 0) { // Even place multiply by 2 (java counts from 0), then sum the digit. Max: 2*9=18, 1+8=9
                a = i1 * 2;
                a = a/10 + a%10;
            } else { // Just return the current digit
                a = i1;
            }
            b+=a; // Add them to the sum
        }
        b = (10 - (b % 10)) % 10;  // (10 - lastdigt) of the sum and get the last digit of the result.

        return b;
    }

    /**
     * Check checksum validity
     * @param sweID
     * @return if checksum in getChecksum and in ID are the same.
     */
    private static boolean isValidChecksum(String sweID) {
        return getChecksum(sweID) == Integer.parseInt(sweID.substring(10,11));
    }

    /**
     * Return if ID is valid
     * @param sweID
     * @return true if valid
     */
    static boolean isCorrect(String sweID) {
        return isValidMonth(sweID) && isValidDate(sweID) && isValidChecksum(sweID);
    }


    /**
     * If those two string are equal
     * @param id1
     * @param id2
     * @return just like .equals, but worse
     */
    static boolean areEqual(String id1, String id2) {
        StringBuilder substr = new StringBuilder(), substr2 = new StringBuilder();
        for (int i = 0; i < id1.length(); i++) {
            if (Character.isDigit(id1.charAt(i))) {
                substr.append(id1.charAt(i));
            }
        }
        for (int i = 0; i < id2.length(); i++) {
            if (Character.isDigit(id2.charAt(i))) {
                substr2.append(id2.charAt(i));
            }
        }
        return substr.toString().equals(substr2.toString());
    }

    /**
     * ID generator without parameters, for testing purpose only.
     * @return a valid ID, YYMMDD-XXXX
     */
    private static String genID() {
        StringBuilder str;
        Random ran = new Random();
        do {
            str = new StringBuilder();
            int year = Integer.parseInt(String.valueOf(ran.nextInt(99) + 1));
            int month = Integer.parseInt(String.valueOf(ran.nextInt(12) + 1));
            int day = Integer.parseInt(String.valueOf(ran.nextInt(31) + 1));
            int gender = Integer.parseInt(String.valueOf(ran.nextInt(9) + 1));
            int person = Integer.parseInt(String.valueOf(ran.nextInt(99) + 1));
            str.append(String.format("%02d", year)).append(String.format("%02d", month)).append(String.format("%02d", day)).append("-").append(gender).append(String.format("%02d", person));
            int checksum = getChecksum(str.toString());
            str.append(checksum);
        } while (!isCorrect(str.toString()));

        return str.toString();
    }

    /**
     * Verify and return ID check result
     * @param sweID
     * @return a string of ID check result
     */
    private static String IDVerificationWithInformationToString(String sweID) {
        StringBuilder a = new StringBuilder();
        a.append(sweID);
        a.append(" is a");
        if (isCorrect(sweID)) { // if correct
            if (isFemaleNumber(sweID)) {
                a.append(" valid female number");
            } else {
                a.append(" valid male number");
            }
        } else { // if incorrect
            a.append("n invalid number "); // adding some grammar.
            a.append("(");
            if (!isValidMonth(sweID)) { // just month
                a.append("invalid month, ");
            }
            if (!isValidDate(sweID)) { // this will happen if invalid month happens, or alone
                a.append("invalid date, ");
            }
            if (!isValidChecksum(sweID)) { // checksum
                a.append("invalid checksum, ");
            }
            a.delete(a.length()-2, a.length());
            a.append(")");
        }
        a.append(".");
        return a.toString();
    }

    /**
     * Convert inputs to correct form, supports [4Y/2Y]MMDD(-)XXXX
     * @param sweID
     * @return a string in the form of YYMMDD-XXXX
     */
    private static String inputHandlingAndConvertingIntoTheCorrectFormToFurtherProcessingIDCorrectly(String sweID) {
        StringBuilder a = new StringBuilder();
        boolean b = sweID.length() >= 10;
        boolean c = sweID.contains("-");
        boolean d = sweID.indexOf("19") == 0 || sweID.indexOf("20") == 0;
        if (b) { // Check correct length, maybe???
            if (c) { // if there is a dash
                if (d) { // YYYYMMDD-XXXX
                    a.append(sweID, 2, sweID.length());
                } else { // YYMMDD-XXXX
                    a.append(sweID);
                }
            } else { // if there is no dash
                if (d) { // YYYYMMDDXXXX
                    a.append(sweID, 2, 8);
                    a.append("-");
                    a.append(sweID, 8, sweID.length());
                } else { // YYMMDDXXXX
                    a.append(sweID, 0, 6);
                    a.append("-");
                    a.append(sweID, 6, sweID.length());
                }
            }
        } // no outside else
        return a.toString(); // return everything if it can process, otherwise nothing
    }

    // Finally
    public static void main(String[] args) {
        System.out.println(IDVerificationWithInformationToString(inputHandlingAndConvertingIntoTheCorrectFormToFurtherProcessingIDCorrectly("19640123-8826"))); // 12 digits with dash
        System.out.println(IDVerificationWithInformationToString(inputHandlingAndConvertingIntoTheCorrectFormToFurtherProcessingIDCorrectly("195504140913"))); // 12 digits without dash
        System.out.println(IDVerificationWithInformationToString(inputHandlingAndConvertingIntoTheCorrectFormToFurtherProcessingIDCorrectly("551314-0913"))); // 10 digit with dash
        System.out.println(IDVerificationWithInformationToString(inputHandlingAndConvertingIntoTheCorrectFormToFurtherProcessingIDCorrectly("5504140912"))); // 10 digit without dash
    }
}
