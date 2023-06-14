import java.util.Scanner;

public class PrintNumbertillN {
    
    public static void print(int num){
            if(num<0){
                return;
            }
        
        for(int i=1; i<=num; i++){
            System.out.println(i);
        }
    }
    
     public static void main (String [] args){
         
          Scanner sc = new Scanner(System.in);
          int num = sc.nextInt();
          print(num);
     }
    
}
