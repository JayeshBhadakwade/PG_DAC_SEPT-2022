import java.util.Scanner;

class P6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows to print");
		int n=sc.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int j=0;j<i;j++)
				System.out.print("* ");
			System.out.println();
			
		}
	}
}
/*
OUTPUT:

Enter a number of rows to print
9
* * * * * * * * *
 * * * * * * * *
  * * * * * * *
   * * * * * *
    * * * * *
     * * * *
      * * *
       * *
        *
*/