import java.util.*;
public class vowelsandconsonants {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String n=sc.nextLine();
            int vowels=0;
            int consonants=0;
         n=n.toLowerCase().replace(" ","");;
            for(int i=0;i<n.length();i++){
                char ch=n.charAt(i);
                if(ch>='a' && ch<='z'){
                    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                        vowels++;
                    }else{
                        consonants++;
                    }
                }
                }
                System.out.println("vowels:"+vowels);
             System.out.println("consonants:"+consonants);
            }
        }

