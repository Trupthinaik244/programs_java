import java.util.Scanner;
public class palindromeno{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        int n=sc.nextInt();
        int rev=0;
        int original=n;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10; 
        }
        if(original==rev)
            System.out.println("the no. is palindrome");
            else
            System.out.println("the no. is not a palindrome");
        
    }
}