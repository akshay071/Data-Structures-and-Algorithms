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
		    int x = sc.nextInt();
		    int s[] = new int[n];
		    int r[] = new int[n];
		    for(int i=0;i<n;i++){
		        s[i]=sc.nextInt();
		        r[i]=sc.nextInt();
		    }
		    int max=Integer.MIN_VALUE;
		    for(int i=0;i<n;i++){
		        if(s[i]<=x&&r[i]>max){
		            max=r[i];
		        }
		    }
		    System.out.println(max);
		}
	}
}
