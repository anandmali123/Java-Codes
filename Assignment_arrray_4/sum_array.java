import java.io.*;
import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of an array : ");
		int size=sc.nextInt(),sum=0;
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.print("sum of array is :" +sum);
	}
}

