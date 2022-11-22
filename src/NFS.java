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
		    int u = sc.nextInt();
		    int v = sc.nextInt();
		    int a = sc.nextInt();
		    int s = sc.nextInt();
		    int V = ((u*u)-(2*a*s))^1/2;
		    if(v*v>=V){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
