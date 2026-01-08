public class pattern4 {
    public static void main(String args[]){
        int n=5;
        for(int rows=1;rows<=n*2;rows++){
            int rowChange=rows>n?(n*2)-(rows-1):rows;
            for(int cols=1;cols<=n*2;cols++){

                if(cols<=n-rowChange+1 || cols>n+rowChange-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    
}
