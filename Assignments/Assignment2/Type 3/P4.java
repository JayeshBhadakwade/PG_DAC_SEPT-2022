import java.util.Scanner;

class P4
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows want to print");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print(j+" ");
			}
			
			for(int j=i;j>0;j--)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
	}
}

/*
OUTPUT:


Enter a number of rows want to print
9
                1
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
      1 2 3 4 5 6 5 4 3 2 1
    1 2 3 4 5 6 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
*/