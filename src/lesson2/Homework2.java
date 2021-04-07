package lesson2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Введите длинну, а затем ширину");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        for(int i = 1; i <= width;i++){
            for(int j = 1; j <= length;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
