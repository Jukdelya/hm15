package lesson17;

public class BackObjects2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Dima";
        person.age = 18;
        Person person1 = new Person();
        person1.setNameandAge("Рома",43);
        person1.speak();
        person.speak();
    }
}
class Person {
    String name;
    int age;

    void setNameandAge(String username, int userage) {
        name = username;
        age = userage;
    }
    int calculateToRetiremnt(){
        int years = 65;
        return years;
    }
    void speak(){
        for(int i = 0; i<1; i++){
            System.out.println("Name: "+name + "; age: "+age);}
    }
    void sayHi(){
        System.out.println("Hi!");
    }
}
