package lesson15;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Dima";
        person.age = 18;
        person.speak();
        Person person1 = new Person();
        person1.name = "Oleg";
        person1.age = 19;
        person1.speak();

    }
    static class Person{
        private String name;
        private int age;
        void speak(){
            System.out.println("Name: "+name + "; age: "+age);
        }
    }
}