/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    int count = 0;
		    HashSet<Integer> hs = new HashSet<>();

		        for(int i=a;i<=b;i++){
		            hs.add(i);
		        }
		        for(int i=c;i<=d;i++){
		            hs.add(i);
		        }
		    System.out.println((hs.size()));
		}
	}
}
