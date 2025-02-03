
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Массив какой длинны хотел бы получить пользователь?");
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        System.out.println("Введите минимальное значение диапазона:");
        int min = sc.nextInt();
        System.out.println("Введите максимальное значение диапазона:");
        int max = sc.nextInt();

        int[] minMax = new int[size];
        Random random=new Random();
        Arrays.setAll(minMax,i -> random.nextInt(max-min+1)+min);
        System.out.println(Arrays.toString(minMax));

//        for (int i = 0; i <minMax.length; i++) {
//            minMax[i]=random.nextInt(min,max+1);
//            System.out.println(minMax[i]);
//        }
    }
}