
import java.util.*;
 class Whatsapp_messages {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            if(x<=n){
                System.out.println(x);
            }
            else{
                while(x>n){
                    x=x-n-1;
                    System.out.println(x);
                    
                }
            }
            T--;
        }
    }
}
