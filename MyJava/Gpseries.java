import java.util.*;

public class Gpseries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
           System.out.println("GP series :");
           System.out.println("Enter the values of a, d,n");
           int a=sc.nextInt();5 2 
           int d=sc.nextInt();
           int n=sc.nextInt();

           int term=a;
           for(int i=0;i<n;i++){
            System.out.println(term +",");
            term=term*d;
             
           
        }
    }
}
