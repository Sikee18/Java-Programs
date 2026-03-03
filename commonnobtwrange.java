    import java.util.*;
    public class commonnobtwrange{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int start1 = sc.nextInt();
            int start2 = sc.nextInt();
            int end1 = sc.nextInt();
            int end2= sc.nextInt();
            int commonstart;
            int commonend;
            if (start1 <= start2){
                commonstart=start2;
            }else{
                commonstart=start1;
            }
            if (end1 <= end2){
                commonend=end1;
            }else{
                commonend=end2;
            }
            for(int i=commonstart;i<=commonend;i++)
                System.out.println(i + " ");
        }  
    }