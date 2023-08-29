package lesson19;

public class ThisIs {
    public static void main(String[] args) {
        Human human = new Human();
        human.setAge(15);
        human.setName("Artem");
        human.getInfo();
        Human human1 = new Human();
        human1.setAge(29);
        human1.setName("Misha");
        human1.getInfo();

    }
}
class Human{
    String name;
    int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void getInfo(){
        System.out.println(name + " " + age);
    }
}