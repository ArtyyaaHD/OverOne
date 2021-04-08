package lesson2;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Введите имя вашего тузика");
        Scanner write = new Scanner(System.in);
        dog.name = write.nextLine();
        createDog(dog.name);
    }
    static void createDog(String name){
        String[] massDog = new String[5];
        for (int i = 0;i<5;i++){
            massDog[i] = name + " "+ (int) (Math.random()*10)+1;
            System.out.println(massDog[i]);
        }
    }
}

class Dog{
    String name;
    int age;
}
