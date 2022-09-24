import java.util.Scanner;

class P7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows to print");
		int n=sc.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=i;j<n;j++)	System.out.print(" ");
			for(int j=0;j<i;j++)	System.out.print(i+" ");
			if(i>1)		System.out.println();
		}
	}
}
/*
OUTPUT:


Enter a number of rows to print
9
9 9 9 9 9 9 9 9 9
 8 8 8 8 8 8 8 8
  7 7 7 7 7 7 7
   6 6 6 6 6 6
    5 5 5 5 5
     4 4 4 4
      3 3 3
       2 2
        1

*/