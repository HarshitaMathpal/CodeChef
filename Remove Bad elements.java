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
		int test = sc.nextInt();
		while(test-->0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    HashMap<Integer,Integer> hm = new HashMap<>();
		    for(int i=0;i<n;i++){
		        hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
		    }
		    int maxf=0;
		    for(int i=0;i<n;i++){
		        maxf = Math.max(maxf,hm.get(arr[i]));
		    }
		    
		    System.out.println(n-maxf);
		}
	}
}
