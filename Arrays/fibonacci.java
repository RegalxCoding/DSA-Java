import java.util.Scanner;

public class fibonacci {
    static int fibonacci(int n){
        if(n==0)return 0;
        if(n==1)return 1;

        int a=0,b=1,c=0;

        System.out.print(a+" "+b+" ");
        for(int i=2;i<=n;i++){
            
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            
        }
        return b;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter how many num:");
       int n=sc.nextInt();
        System.out.println("fibonnaci series of "+ n + " terms are :");
      fibonacci(n);

        sc.close();
    }
    
}
