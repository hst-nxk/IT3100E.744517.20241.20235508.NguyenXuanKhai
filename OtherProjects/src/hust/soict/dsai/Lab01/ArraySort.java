import java.util.Scanner;
import java.util.Arrays;
public class ArraySort {
    public static void main(String[] args){
        int n;
        System.out.print("Input the size of array: ");
        Scanner size = new Scanner(System.in);
        n = size.nextInt();
        double [] arr1 = new double[n];
        for (int i = 0; i<n;i++){
            arr1[i] = size.nextDouble();
        }
        Arrays.sort(arr1);
        System.out.println("The sorted array is:");
        for(double i:arr1){
            System.out.print(i+" ");
        }
        size.close();
    }
}
