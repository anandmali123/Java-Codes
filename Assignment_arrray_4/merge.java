import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int arr[] =new int[5];
		int arr1[] =new int[6];
		int merge[]=new int[5+6];
		System.out.println("enter arr elemetns");

		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter arr1 elents are ");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		int count=0;
	//	System.out.print("merged array is ");
		for(int i=0;i<merge.length;i++){
		     if(i<5)
			     merge[i]=arr[i];
		     else{
			    
			     merge[i]=arr1[count];
			     count++;
		     }
		}
		System.out.println("merge array is : ");
		for(int i=0;i<merge.length;i++)
			System.out.print(merge[i]+" ");

		
	}
}


