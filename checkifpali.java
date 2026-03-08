import java.util.*;
public class checkifpali {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    int org=num;
    int rev=0;
    int rem=0;
    while(num != 0){
        rem=num%10;
        rev=(rev*10)+rem;
        num=num/10;
    }
    if(org==rev){
        System.out.println("It is palindrome");
    }else{
        System.out.println("Its not palindrome");
        System.out.println(rev);
    }

    }
}


