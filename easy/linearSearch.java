
import java.util.*;
public class linearSearch{
    public static void main(String[] args) {
        int arr[] = {10,20,75,45,15,35,65,85,75,96,85};
        Scanner sc = new Scanner(System.in);
        //give target value
        System.out.print("give target value: ");
        int target = sc.nextInt();
        boolean value = false;
        sc.close();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                value=true;
                break;
            }
                value=false;
            
        }
        System.out.println("a target value exists in an array. : " +value);
    }
}