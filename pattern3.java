public class pattern3 {
    public static void main(String args[]){
        int n=5;
        for(int rows=1;rows<=n*2-1;rows++){
            int rowc=n>=rows?rows:(n*2)-rows;
            for(int star=1;star<=rowc;star++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
