import java.util.*;
import java.lang.*;
import java.io.*;
class Task
{
	public static void main(String[] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value:");
		n=s.nextInt();
		for(int i=n;i>=1;i--)
		{	
			for(int j=n;j>i;j--)
			{
				System.out.print(j);
			}
			for(int j=1;j<=(i*2-1);j++)
			{
				System.out.print(i);
			}
			for(int j=i+1;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(j);
			}
			for(int j=1;j<=(i*2-1);j++)
			{
				System.out.print(i+1);
			}
			for(int j=i+1;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}	
