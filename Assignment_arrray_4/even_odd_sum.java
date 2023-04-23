import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int odd_sum=0,even_sum=0;
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			if(arr[i]%2==0)
				even_sum+=arr[i];
			else
				odd_sum+=arr[i];
		}
		System.out.println("even numbers sum is : "+even_sum);
		System.out.println("odd sum is : "+odd_sum);
	}
}

