import java.util.Scanner;

class P5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows");
		int n=sc.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT:

Enter a number of rows
9
                9
              8 9 8
            7 8 9 8 7
          6 7 8 9 8 7 6
        5 6 7 8 9 8 7 6 5
      4 5 6 7 8 9 8 7 6 5 4
    3 4 5 6 7 8 9 8 7 6 5 4 3
  2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

*/