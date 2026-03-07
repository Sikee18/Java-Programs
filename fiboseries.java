import java.util.*;
public class fiboseries {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=0;
    int y=1;
    for(int i=0;i<n;i++){
        int z=x+y;
        x=y;
        x=z;
        System.out.println(x);
        
    }}}
