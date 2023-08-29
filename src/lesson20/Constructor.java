package lesson20;

public class Constructor {
    public static void main(String[] args) {
        Human human = new Human();
    }
}
class Human{
    String name;
    int age;
    public Human(){
        System.out.println("первый конструктор");
    }
    public Human(String name){
        this.name = name;
        System.out.println("второй конструктор");
    }
    public Human(String name, int age) {
        System.out.println("третий конструктор");
        this.name = name;
        this.age = age;
    }
}