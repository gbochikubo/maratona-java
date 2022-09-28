package main.hack_rank;

import java.util.ArrayList;
import java.util.Scanner;

/*
Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

Constraints

Each number will fit in signed integer.
Total number of integers in  lines will not cross .

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!
 */
public class JavaArrayList01 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<n; i++){
            int d = sc.nextInt();
            ArrayList<Integer> valueList = new ArrayList<Integer>();

            for (int j=0; j<d; j++) {
                valueList.add(sc.nextInt());
            }

            mainList.add(valueList);
        }

        n=sc.nextInt();

        for(int i=0; i<n; i++){
            int row = sc.nextInt();
            int col = sc.nextInt();

            try{
                System.out.println(mainList.get(row - 1).get(col - 1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
