package lesson2;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Введите максимальное число число");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 1;
        int[] numbers = new int[50];
        numbers[0]=1;
        numbers[1]=1;
        System.out.println(numbers[0]);
        do{
            System.out.println(numbers[i]);
            i++;
        }
        while((numbers[i]=numbers[i-1] + numbers[i-2])<=number);

    }
}
