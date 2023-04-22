import java.util.*;
class Demo{
	static int palindrome(int n){
		int rev=0;
		int x=n;
		while(x!=0){
                   int r=x%10;
                   x=x/10;
                   rev=10*rev+r;
                   }
                   if(rev==n)
                      return 1;
                    else
                     return 0;
		
	     
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int arr[] =new int[5];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			if(palindrome(arr[i])==1){
				System.out.println("palindrome no. "+arr[i]+"found at  index: "+i);
             break;}
		}
	}
}
