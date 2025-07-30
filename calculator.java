import java.util.*;

class calculator{

    public int add(int a,int b){
        int c = a + b;
        return c;
    }
     public int sub(int a,int b){
        int c = a - b;
        return c;
    }
     public int mul(int a,int b){
        int c = a * b;
        return c;
    }
     public float div(float a,float b){
        float c = a / b;
        return c;
    }
    

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         calculator cl = new calculator();

         System.out.print("select nummber to perfrom task: \n"
         +"1.add \n"
         +"2.sub \n"
         +"3.mul \n"
         +"4.div        :");

         int n = sc.nextInt();

         
         if (n>=1 && n<=4 ) {

            System.out.println("enter first value: ");
            int a = sc.nextInt();

            System.out.println("enter second value: ");
            int b= sc.nextInt();


            switch (n) {
            case 1:
                System.out.println("the addition is: "+cl.add(a,b));
                break;
            case 2:
                System.out.println("the subtraction is: "+cl.sub(a,b));
                break;
            case 3:
                System.out.println("the multiplication is: "+cl.mul(a,b));
                break;
            case 4:
                System.out.println("the divison is: "+cl.div((float)a,(float)b));
                break;
         
            default:
                System.out.println("input is invalid ");

                break;
            }
         }else{
            System.out.println("Invalid choice! 😡 Please enter 1, 2, 3 or 4, don't be an idiot!");
         }
         sc.close();
    }
}