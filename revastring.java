import java.util.*;
public class revastring {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        for(int i=n.length()-1;i>=0;i--){
            char ch=n.charAt(i);
            System.out.print(ch);
        }
    }
}
