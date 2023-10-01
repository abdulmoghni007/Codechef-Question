import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner take_input=new Scanner(System.in);
        int testcase=take_input.nextInt();
        while(testcase!=0){
            int[] input=new int[3];
            for(int i=0;i<3;i++){
                input[i]=take_input.nextInt();
                
            }
            Arrays.sort(input);
            System.out.println(input[1]);
            
            testcase--;
        }
    }
}