import java.util.*;
public class Dupelementsinanarray {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);    
    int arr[]={1,2,3,2,4,1}; 
    int n=sc.nextInt();
    Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    arr[j] = -1;   
                }
            }
        }
    }
}
