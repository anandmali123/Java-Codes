import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Second largest element is : "+arr[3]);
	}
}

