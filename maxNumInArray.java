import java.util.Scanner;

public class maxNumInArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[] ={12, 4, 5, 6, 24 , 20};
        
        int largestElt = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(largestElt < arr[i]){
                largestElt = arr[i];
            }
        }
        System.out.println("Largest Element In Array is : " + largestElt);
        sc.close();
    }
}
