import java.util.*;
class Pprime{
    public static void main(String[] args){
        System.out.println("Enter the Number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int flag=1;
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag=0;
                break;
            }
        }
        if(num<=1){
            System.out.println("not prime");
        }
        else if(flag==0){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }
        
    }
}