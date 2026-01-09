public class pattern5 {
    public static void main(String args[]){
    int n=5;
    for(int rows=1;rows<=n*2-1;rows++){
        for(int cols=1;cols<=n*2-1;cols++){
            int top=rows;
            int bottom=(n*2)-rows;
            int left=cols;
            int right=(n*2)-cols;
            int mins=Math.min(Math.min(top,bottom), Math.min(right,left));
            System.out.print(n-mins+1+"   ");
        }System.out.println("  ");

    }
    System.out.println(" ");

    
}
}