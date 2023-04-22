import java.util.*;
class Demo{
        static int fact(int n){
              if(n==1 ||n==0)
                return 1;
              else
                return n*fact(n-1);}
	static int strong_Number(int n){
	      int sum=0;
	       int x=n;
	       while(x!=0){
                     int r=x%10;
                     sum=sum+fact(r);
		     x=x/10;
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
			if(strong_Number(arr[i])==1){
				System.out.println("Strong no. "+arr[i]+"found at  index: "+i);
             break;}
		}
	}
}
