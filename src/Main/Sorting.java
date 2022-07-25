package Main;
import java.util.Scanner;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {


        System.out.println("Olusturmak Istediginiz Dizinin Boyutunu Giriniz: ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[]list =new int[length];

        for(int i = 0; i<length;i++){
            System.out.println("Lutfen "+(i+1)+". elemanini giriniz:");
            list[i]=input.nextInt();

        }
        System.out.println("Girilen Dizi: "+Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Kucukten Buyuge Siralanan Dizi: "+Arrays.toString(list));





    }
}