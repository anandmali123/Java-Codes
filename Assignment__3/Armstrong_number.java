import java.util.*;
class Demo{
	static int Armstrong(int n){
		int x=n,p=n;
		int count=0;
		double sum=0;
		while(x!=0){
		count++;
		x=x/10;}
		int k=count;
		while(p!=0){
		int r=p%10;
                   sum=sum+Math.pow(r,count);
                   p=p/10;
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
			if(Armstrong(arr[i])==1){
				System.out.println("Armstrong no. "+arr[i]+"found at  index: "+i);
             break;}
		}
	}
}
