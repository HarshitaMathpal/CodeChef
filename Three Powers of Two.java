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
		Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
        int len=scan.nextInt();
        String str=scan.next();
        int count=0;
        char[] check =str.toCharArray();
        for(char ch:check){
            if(ch=='1'){
                count++;
            }
        }
        if(str.equals("1") || str.equals("10")){
            System.out.println("NO");
        }
        else if(count<=3){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
	}
}
