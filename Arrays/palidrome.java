import java.util.Scanner;

public class palidrome {
    static boolean isPalidrome(int num){
        int original=num;
        int reverse=0;

        while(num>0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num/=10;
        }
        return original==reverse;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter num:");
        int n=sc.nextInt();

        System.out.print("NUMBER "+n+" IS PALIDROME:"+isPalidrome(n));
        
        sc.close();
    }
    
}
