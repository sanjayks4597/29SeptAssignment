import java.util.Scanner;

public class ElementWhichappearOnetime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 array elements: ");
		int []val=new int[5];
		boolean flag=false;
		for(int i=0;i<val.length;i++)
		{
			val[i]=sc.nextInt();
		}
	
		for(int i=0;i<val.length;i++)
		{
			flag=false;
			for(int j=i+1;j<val.length;j++)
			{
				
				if(val[i]==val[j])
				{
				System.out.println("Value which is repeated:"+val[i]);
				flag=true;	
				break;
				
					
				}


			
		    }
			for(int f=0;f<val.length;f++)
			{
				if(f==i)
				{
					continue;
				}
				else if(val[i]==val[f])
				{
					flag=true;
				}
			}
			
			if(flag==false)
			{
				System.out.println("Value which is not repeated:"+val[i]);
				
			}
			
			}
			
		}
		
		
		

	}


