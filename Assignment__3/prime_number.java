import java.util.*;
class Demo{
	static int composite(int n){
		int count=0;
	     for(int i=1;i<=n/2;i++){
		     if(n%i==0)
			     count++;
	     }
	     if(count>1)
		     return 1;
	     else
		     return 0;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int arr[] =new int[5];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			if(composite(arr[i])==0){
				System.out.println("Prime "+arr[i]+"found at  index: "+i);
             break;}
		}
	}
}
