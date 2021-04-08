package Lesson3.Human;

public class Main {
    public static void main(String[] args) {
        Human boris = new Human(150,"Boris",25,true);
        Human sergey = new Human(190,"Sergey",27,true);
        House dom = new House();
        dom.address = "Backer street 1";

        Human[] humans = new Human[]{boris, sergey};
        dom.humans = humans;
        String name = dom.humans[0].name;
        System.out.println(name);
        dom.checkHouse();
    }
}
