import java.util.*;
class Array2DTranspose
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		
		int i,j;
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			a[i][j]=sc.nextInt();

		
		System.out.println("Transpose Matrix");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}


	}
}