import java.util.*;
class Demo{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter size :");
	int size=sc.nextInt();
	int arr[]=new int[size];
	int even=0;
	int odd=0;

	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
		if(arr[i]%2==0)
			even++;
		else
			odd++;
	}
	System.out.println("even count in array is : "+even);
	System.out.println("ODD count in array is : "+odd);
}
}


