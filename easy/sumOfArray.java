public class sumOfArray {
    public static void main(String[] args) {
        int arr[] = {10,20,75,45,15,35,65,85,75,96,85};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("sum of array is: "+sum);
    }
}
