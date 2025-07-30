package DSA;

public class duplicate {
    public static void main(String[] args) {
        int[] arr ={1,8,4,7,6,8,5};
        boolean b = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    b = true;
                    break;
                }
            }
            if(b==true) break;
           
        }
        System.out.println("It's contain duplicate: "+b);
    }
}
