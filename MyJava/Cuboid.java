import java.util.*;
class Cuboid{
      public static void main(String[] args){
             System.out.println("Enter the Height,Length,Breadth: ");
             int height,length,breadth;
             int TotalArea,Volume;
             Scanner sc=new Scanner(System.in);
             height=sc.nextInt();
             breadth=sc.nextInt();
             length=sc.nextInt();
             Volume=length*breadth*height;
             TotalArea=2*(length*breadth+breadth*height+height*length);
             System.out.println("Volume is: "+Volume);
             System.out.println("Total Area is: "+TotalArea);
 }
}
             