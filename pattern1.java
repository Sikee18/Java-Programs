public class pattern1 {
    public static void main(String args[]){
        int n=4;
        for(int rows=1;rows<=((n*2)-1);rows++){
            int rowch=n>=rows?n-rows:rows-n;
            for(int space=1;space<=rowch;space++){
                System.out.print(" ");
            }
            int rowch1=n>=rows?(rows*2)-1:((n*2)-rows)*2-1;
            for(int stars=1;stars<=rowch1;stars++){
                System.out.print("*");
            }
            System.out.println();
        }
         
    }
} 
    
