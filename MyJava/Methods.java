import java.util.*;
class Methods{
      public static void main(String[] args){
             String str=new String("Java");
             System.out.println(str.length());
             String str2=new String(str.toUpperCase());
             System.out.println(str2);
             System.out.println(str.toLowerCase());
             String str4="   Java  ";
             String str3=new String(str4.trim());
             System.out.println(str3);
             String str5="JavaDevelopar";
             System.out.println(str5.substring(4,7));
             String str6=new String(str5.replace('a','T'));
             System.out.println(str5+ " " +str6);

}
}
                