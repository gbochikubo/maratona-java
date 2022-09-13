package main.hack_rank;

import java.util.Scanner;

/**
 * You are updating the username policy on your company's internal networking platform. According to the policy, a username is considered valid if all the following constraints are satisfied:
 *
 * The username consists of  to  characters inclusive. If the username consists of less than  or greater than  characters, then it is an invalid username.
 * The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits .
 * The first character of the username must be an alphabetic character, i.e., either lowercase character  or uppercase character .
 * For example:
 *
 * Username	Validity
 * INVALID; Username length < 8 characters
 * VALID
 * VALID
 * INVALID; Username begins with non-alphabetic character
 * INVALID; '?' character not allowed
 * Update the value of regularExpression field in the UsernameValidator class so that the regular expression only matches with valid usernames.
 *
 * Input Format
 *
 * The first line of input contains an integer , describing the total number of usernames. Each of the next  lines contains a string describing the username. The locked stub code reads the inputs and validates the username.
 *
 * Constraints
 *
 * The username consists of any printable characters.
 * Output Format
 *
 * For each of the usernames, the locked stub code prints Valid if the username is valid; otherwise Invalid each on a new line.
 *
 */
public class JavaRegex01 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            //Good article explaning how regex works: https://medium.com/factory-mind/regex-tutorial-a-simple-cheatsheet-by-examples-649dc1c3f285
            if (userName.matches("^[a-zA-Z][a-zA-Z_0-9]{7,29}$")) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
