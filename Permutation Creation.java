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
		    if(n<4){
		        System.out.println(-1);
		    }
		    else if(n==4){
		        System.out.println("3 1 4 2");
		    }
		    else{
		      //  int x = n/2;
		        int[] arr = new int[n];
		        int j=1;
		        for(int i=0;i<n;i+=2){
		            arr[i] = j;
		            j++;
		        }
		        for(int i=1;i<n;i+=2){
		            arr[i] = j;
		            j++;
		        }
		        for(int i:arr){
		            System.out.print(i+" ");
		        }
		    }
		}
	}
}
