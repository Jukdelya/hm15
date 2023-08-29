package lesson18;

public class BackObjects3 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Dima");
        person.setAge(55);
        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());
    }
}
class Person {
    String name;
    int age;
    public void setName(String userName){
        if (userName.isEmpty()){
            System.out.println("Пустое имя");
        }
        else{
            name = userName;}
    }
    public String getName(){
        return name;
    }
    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("возраст должен быть положительным");
        } else {
            age = userAge;
        }
    }
    public int getAge(){
        return age;
    }
}