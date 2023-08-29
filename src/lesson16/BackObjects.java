package lesson16;


public class BackObjects {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Dima";
        person.age = 18;
        Person person1 = new Person();
        person1.name = "Oleg";
        person1.age = 19;
        int year1 = person1.calculateToRetiremnt();
        int year2 = person1.calculateToRetiremnt();
        System.out.println("Первому человеку до пенсии: " + year1 + " лет");
        System.out.println("Второму человеку до пенсии: " + year2 + " лет");
    }
}
    class Person {
        String name;
        int age;
        int calculateToRetiremnt(){
            int years = 65;
            return years;
        }
        void speak(){
            for(int i = 0; i<3; i++){
            System.out.println("Name: "+name + "; age: "+age);}
        }
        void sayHi(){
            System.out.println("Hi!");
        }
    }
