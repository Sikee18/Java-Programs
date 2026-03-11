import java.util.*;
public class stringpali {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        Boolean flag=true;
        for(int i=0;i<a.length();i++){
            char ch1=a.charAt(i);
            char ch2=a.charAt(a.length()-1-i);
            if(ch1!=ch2){
                flag=false;
                break;
            }
        }
        if(flag) 
        System.out.print("pali");
        else System.out.print("not pali");
    }
    
}
