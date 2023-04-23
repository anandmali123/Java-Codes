import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int arr1[] =new int[size];
		int count=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			int sum=0;
			while(arr[i]!=0){
				int r=arr[i]%10;
			        sum+=r;
				arr[i]=arr[i]/10;
		}
		if(sum%2==0){
			arr1[count]=sum;
		count++;
		}
		}
		System.out.println("arr1 elements are : ");
		for(int i=0;i<size;i++)
			System.out.print(arr1[i]+" ");

	}
}



