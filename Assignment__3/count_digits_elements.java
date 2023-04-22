import java.io.*;
class Demo{
	static int count_digit(int n){
		int count=0;
		int x=n;
	        while(x!=0){
			count++;
			x=x/10;}
		return count;
	}
	public static void main(String[] args)throws IOException{
                      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		      System.out.println("Enter the size of array : ");
		      int size =Integer.parseInt(br.readLine());
		      int arr[] =new int[size];
		      int arr1[]= new int[size];
                      for(int i=0;i<arr.length;i++){
			      arr[i]=Integer.parseInt(br.readLine());
			      arr1[i]=count_digit(arr[i]);
		      }
		      System.out.print("arr elements are: ");
		      for(int i=0;i<arr.length;i++){
			      System.out.print(arr[i]+" ");
		      }
		      System.out.println("arr1 array is : ");
		      for(int i=0;i<arr.length;i++)
			      System.out.print(arr1[i]+" ");
	}
}
