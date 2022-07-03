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
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test>0)
		{
		    int k=sc.nextInt();
		    if(k%6==1 ||k%6==4)
		    {
		        System.out.println("HUGE");
		    }
		     else if(k%6==2 ||k%6==5)
		    {
		        System.out.println("SMALL");
		    }
		    else
		    System.out.println("NORMAL");
		    test--;
		}
	}
}
