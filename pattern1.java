public class pattern1 {
    public static void main(String args[]){
        int n=5;
        for(int rows=1;rows<=n;rows++){
            for(int cols=1;cols<=(n-rows);cols++){
                System.out.print(" ");
            }
            for(int cols=1;cols<=(rows*2-1);cols++){
                System.out.print("*");
            }System.out.println();

        }
        for(int rows=n-1;rows>=1;rows--){
            for(int cols=1;cols<=(n-rows);cols++){
                System.out.print(" ");
            }
            for(int cols=1;cols<=(rows*2-1);cols++){
                System.out.print("*");
            }System.out.println();
        }
    }
} 
    
