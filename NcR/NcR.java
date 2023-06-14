package functions;

import java.util.Scanner;

public class NcR {
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
            
        int num = 1;
        int rem = 1;
        int dem = 1;
        
        for(int i =1; i<=n; i++){
            num = num*i;
        }
       
        for(int i =1; i<=r; i++){
            rem = rem*i;
        }
        
        for(int i=1; i<=n-r; i++){
            dem = dem*i;
            }
        
        int ans = num/(dem*rem);
        System.out.println(ans);
}
    
}
