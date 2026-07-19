import java.util.*;
public class twosum{
public static void main(String args[]){
    Scanner Sc = new Scanner(System.in);
    int n=Sc.nextInt();
    int m=Sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=Sc.nextInt();
    }
        boolean found=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==m){
                    found=true;
                }
        

            }
        }
    
    