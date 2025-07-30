import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("enter number to factoial: ");
        int n = sc.nextInt();
        sc.close();
        int result = 1;
        for(int i=1;i<=n;i++){
            result *= i;
        }
        System.out.println("factorial of "+n+" is "+result);
    }
}
