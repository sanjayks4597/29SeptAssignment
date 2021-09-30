import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 array values for the array:");
		int val[]=new int[5];
		for(int i=0;i<val.length;i++)
		{
			val[i]=sc.nextInt();
		}
		
		System.out.print("Enter the target value which you want to achive:");
		int target=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<val.length;i++)
		{
			for(int j=i+1;j<val.length;j++)
			{
				if(val[i]+val[j]==target)
				{
					flag=true;
				}
			}
		}
		if(flag==true)
		{
			System.out.println("target is possible");
		}
		else
		{
			System.out.println("target is not possible");
		}

	}

}
