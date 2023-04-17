import java.io.*;
class Demo{
    static int  prime(int n){
        int count=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
            count++;
            
        }
        if(count>1)
         return 0;
        else
        return 1;
    }

    public static void main(String[] args)throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter a starting range: ");
       int a=Integer.parseInt(br.readLine());
       System.out.println("Enter a ending range: ");
       int b=Integer.parseInt(br.readLine());
       for(int i=a;i<=b;i++){
        if(prime(i)==1)
        System.out.print(i+" ");
       }
    }
}