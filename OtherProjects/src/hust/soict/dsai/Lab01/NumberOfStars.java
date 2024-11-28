import java.util.Scanner;
public class NumberOfStars {
    public static void main(String[] args){
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        for (int i = 0; i < n+1;i++){
            for(int j = n; j>=i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
