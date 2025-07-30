import java.util.*;

class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = false;
        System.out.print("enter number: ");
        int n = sc.nextInt();
        sc.close();

        if(n<=1){
            isPrime=false;
        }

        for(int i=2;i*i<=n;i++){
           if(n%i==0){
            isPrime=false;
            break;
           }
            isPrime=true;
    
           
       }
       System.out.println("is prime : "+isPrime);
    }
}
