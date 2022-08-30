package main.hack_rank;
import java.util.*;
/**
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
 *
 * Given a string , print Yes if it is a palindrome, print No otherwise.
 *
 * Constraints
 *
 *  will consist at most  lower case english letters.
 * Sample Input
 *
 * madam
 * Sample Output
 *
 * Yes
 */
public class JavaPalindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        Boolean palimdrome = true;
        for(int i =0; i<A.length()/2; i++){
            for(int j=A.length(); j>A.length()/2; j--){
                if(!A.substring(i,i+1).equals(A.substring(j-1, j))) palimdrome=false ;
                i++;
            }
        }
        System.out.println(palimdrome ? "Yes" : "No");
    }
}
