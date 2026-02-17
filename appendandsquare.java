import java.util.*;
public class appendandsquare {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        String x=Long.toString(n);
        String y=Long.toString(m);
        String z=x+y;
        long h=Long.parseLong(z);
        System.out.println(h*h);
    }
}
