public class Encapsulation {
    private String name;
    private int age;

    public void getName(String name){
        this.name = name;
    }
    public void getAge(int age){ this.age = age; }
    public String SetName(String name){
        return name;
    }
    public int SetAge(int age){
        return age;
    }
}
