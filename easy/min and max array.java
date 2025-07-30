import java.util.*;


class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int s = sc.nextInt();

        int[] arr = new int[s];
        System.out.println("Enter value for array: ");
        for(int i=0;i<s;i++){
            if(sc.hasNextInt()){
            arr[i]=sc.nextInt();

        }
        sc.close();

        
        // main code
        }
        try {
            int max=arr[0];
            int min =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
            if(arr[i]<=min){
                min=arr[i];
            }
        }
        System.out.print("Max: "+max+" "+"min: "+min);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please give value to find min max");
        }
       


    }
}
