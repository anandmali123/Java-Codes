import java.util.*;
class Demo{
	static int perfect(int n){
		int sum=0;
		
	     for(int i=1;i<=n/2;i++){
		     if(n%i==0)
			     sum=sum+i;
	     }
	     if(sum==n)
		     return 1;
	     else
		     return 0;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int arr[] =new int[5];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			if(perfect(arr[i])==1){
				System.out.println("perefect no. "+arr[i]+"found at  index: "+i);
             break;}
		}
	}
}
