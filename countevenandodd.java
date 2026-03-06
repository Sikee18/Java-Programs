import java.util.*;
public class countevenandodd {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int ocount=0;
    int ecount=0;
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        if(arr[i]%2==0){
            ecount++;
        }else{
            ocount++;
        }

    }System.out.println("Even count:"+ecount);
     System.out.println("Odd count:"+ocount);

}
}
