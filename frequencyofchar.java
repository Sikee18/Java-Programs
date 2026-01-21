import java.util.*;
public class frequencyofchar {
    public static void main(String argd[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toUpperCase();
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'A']++;
        }
        for(int i=0;i<=25;i++){
            System.out.println((char)(i+'A')+"->"+arr[i]);
        }
    }
}
