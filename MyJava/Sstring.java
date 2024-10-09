import java.util.*;
public class Sstring {
    public static void main(String[] args){
        // String str1="java";
        // String str2="java";
        // System.out.println(str1==str2);
         
        // String str3=new String("Java");
        // String str4=new String("Java");
        // System.out.println(str3==str4);
        

        // byte b[]={55,67,89,23,45};
        // String nh=new String(b,1,2);
        // System.out.println(nh);
        // float x=4.2f, y=7.4f;
        // System.out.println( "sum of \n" +4+ " and "+7+" is "+(x+y));

        // String str1="JavaVirtuaL   ";
        // str1=str1.toLowerCase();
        // /////int l=str1.length();/////
        // //System.out.println(str1.toUpperCase());
        // System.out.println(str1);
        // System.out.println(str1.trim());
        // System.out.println(str1.substring(5));
        // System.out.println(str1.substring(5,11));
        // System.out.println(str1.replace('J','y'));

        // String wel="WElcome";
        // System.out.println(wel.replace('W','k'));

        //  String str="shreyasomdale2003@gmail.com";
        // int i=str.indexOf("@");
        // String uname=str.substring(0,i);
        // String dname=str.substring(i+1,str.length());
        // System.out.println("username is:" +uname);
        // System.out.println("domain name is:" +dname);

        // String name= str.substring(i+1,str.length());
        // System.out.println(name.equals("gmail.com"));

        System.out.println("Enter The Number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int r;
        // int n=1;
        // for(int i=1;i<=sum;i++){
        //     n=n*i;
        // }
        // System.out.println(n);
        while(num>0){
            r=num%10;
            num=num/10;
            System.out.println(r);
        }
       

    }
}
