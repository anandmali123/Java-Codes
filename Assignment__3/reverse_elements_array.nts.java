import java.io.*;
class Demo{
	static int reverse(int n){
		int rev=0;
		while(n!=0){
		int r=n%10;
		rev=rev*10+r;
		n=n/10;
		}
		return rev;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter trhe size of array : ");
		int size =Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int arr1[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			arr1[i]=reverse(arr[i]);
			
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		

		
	}
}

