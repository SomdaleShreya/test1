import java.util.*;
class Swapping{
      public static void main(String[] args){
             System.out.println("Swapping of a and b is: ");
             int a=9;
             int b=12;
             a=a^b;
             b=a^b;
             a=a^b;
             System.out.println(a+ " "+b);
             
}
}