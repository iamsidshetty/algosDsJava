/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PE5
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int num = 20;
	    long lcm = 1L;
	    for (int i = 2; i <= num; i++)
	    {
	        int hcf = 1;
	        for (int j = 2; j <= i; j++)
	        {
	            if (i % j == 0 && lcm % j == 0)
	            {
	                hcf = j;
	            }
	        }
	        lcm = (lcm * i) / hcf;
	    }
		System.out.println(lcm);
	}
}
