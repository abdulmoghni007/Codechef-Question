
import java.util.*;
 class fit_in_data_type {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
       
         int a=sc.nextInt();
         int b=sc.nextInt();
         int x=sc.nextInt();
         int y=sc.nextInt();
         int ans1=2*a+b;
         int ans2=2*x+y;
         if(ans1>ans2){
             System.out.println("Messi");
         }
         else if(ans1<ans2){
              System.out.println("Ronaldo");
         }
         else{
              System.out.println("Equal");
         }
           
        
    }
}
