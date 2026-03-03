import java.util.*;
public class checkarrsorted {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i] > arr[i+1]){
                System.out.println("Not Sorted");
                break;
            }else{
                System.out.println("Sorted");
                break;
        }
    }
    }
}