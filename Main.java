import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num ;
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz: ");
        num = input.nextInt();
        int[] arr = new int[num];

        System.out.println("Dizinin elemanlarini giriniz:");
        for(int i=0;i<num;i++){
            System.out.print(i+1+ " Elemani : ");
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Siralama: " + Arrays.toString(arr));
    }
}
