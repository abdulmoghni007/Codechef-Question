
import java.util.*;
 class bells_of_pilgrimage {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int k=sc.nextInt();
            int p=sc.nextInt();
            int ans=Math.abs(x-k);
            
             if(x>=k){
                System.out.println(p+(k*10));
            }
            else if(k==n){
                 
                System.out.println(p+(x*10)+(ans*5)+20);
            }
            else{
                
            
            System.out.println(p+(x*10)+(ans*5));
            }
            
           
            T--;
        }
    }
}
