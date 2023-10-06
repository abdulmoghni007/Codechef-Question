
import java.util.*;
 class fit_in_data_type {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int r=sc.nextInt();
            int ans=x+r/30;
            
           if(ans%y==0){
               System.out.println(ans/y);
           }
           else{
               System.out.println(ans/y+1);
           }
            
            T--;
        }
    }
}
