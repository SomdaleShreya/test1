import java.util.*;
public class Rreverse {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int r,rev=0;
        int m=num;
        while(num>0){
            r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        if(rev==m)
    {
        System.out.println("Number is palindrom");
    }
    else
    {
        System.out.println("Number is not palindrome");
    }  
    }
      
}
