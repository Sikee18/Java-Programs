import java.util.*;
public class findmissingnumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        int sum=0;
        int expectedsum=(n)*(n+1)/2;
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
                
        }
                    System.out.println(expectedsum-sum);
                }
    }
    
