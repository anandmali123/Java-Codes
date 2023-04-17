import java.io.*;
class Demo{
    static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    static int sum1(int n){
        int sum=0;
        while(n!=0){
            int r=n%10;
            sum=sum+fact(r);
            n=n/10;
        }
        return sum;

    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENter a number ");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Addition of factorial of  number is "+sum1(a));
    }
}