import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size: ");
		 int size =sc.nextInt();
		 int arr[]=new int[size];
		// int max=0;
		 for(int i=0;i<arr.length;i++){
			 arr[i]=sc.nextInt();
		 }
		int max=arr[0];
		for(int i=1;i<size;i++){
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("maxumum element is : "+max);
	}
}


