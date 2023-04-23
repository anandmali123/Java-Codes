import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size: ");
		 int size =sc.nextInt();
		 int arr[]=new int[size];
		 int arr1[]=new int[size];
		 
		// int max=0;
		System.out.println("arr elements are");
		 for(int i=0;i<arr.length;i++){
			 arr[i]=sc.nextInt();
		 }
		 System.out.println("arr1 elements are");
		 for(int i=0;i<arr.length;i++){
                     arr1[i]=sc.nextInt();
                     }
                Arrays.sort(arr);
                Arrays.sort(arr1);
                for(int i=0;i<arr.length;i++){
if(arr[i]==arr1[i])
    System.out.print(arr[i]+" ");
		
	}
	
}
}



