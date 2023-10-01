import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner take_input=new Scanner(System.in);
        int testcase=take_input.nextInt();
        while(testcase!=0){
         int course=take_input.nextInt();
         int unit=take_input.nextInt();
         int chapter=take_input.nextInt();
         System.out.println((course*unit)*chapter);
         testcase--;
        }
    }
}