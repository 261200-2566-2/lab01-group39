import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size=0;
        do{
            System.out.print("Enter the amount of number to sort : ");
            size = s.nextInt();
        }while(size<0);
        int[] arr= new int[size];
        for (int i=0;i<size;i++){
            int j=s.nextInt();
            arr[i]=j;
        }
        print_array_and_sorted(arr);
    }
    public static void print_array_and_sorted(int[] arr){
        Arrays.sort(arr);
        if(arr.length==0) System.out.print("\nThere is no number to sort");
        else{
            System.out.println("\nThe sorted numbers are: ");
            for (int num : arr) {
                System.out.println(num + " ");
            }
        }

    }

}