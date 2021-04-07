package lesson2;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Scanner write = new Scanner(System.in);
        dog.name = write.nextLine();
        createDog(dog.name);
    }
    static void createDog(String name){
        String[] massDog = new String[5];
        Dog dog = new Dog();
        for (int i = 0;i<5;i++){
            dog.age = (int) (Math.random()*10)+1;
            System.out.println(name+"  "+dog.age);
        }
    }
}




class Dog{
    String name;
    int age;
}
