import java.util.*;
class Welcome{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("May I know your name");
       String a=s.nextLine();
       System.out.println("Welcome Ms/Mrs."+a);
       System.out.println("and what is your name?");
       String b=s.nextLine();
       System.out.println(" Ms/Mrs."+b);
       //int x=8;
       //System.out.printf("%03d",x);
       int y=10;
       System.out.printf("%5d",y);
       
}
}