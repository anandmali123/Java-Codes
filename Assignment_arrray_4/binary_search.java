import java.util.*;
class Demo
{
	static int search(int arr[],int key,int n){
		int start=0;
		int end=n-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]>key)
				end=mid-1;
			else if(arr[mid]<key)
				start=mid+1;
		}
		return -1;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size " );
		int size=sc.nextInt();
		System.out.println("enter the key youy wat to search : ");
		int key=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int k=search(arr,key,4);
		System.out.println("ans is : "+k);
	}
}

