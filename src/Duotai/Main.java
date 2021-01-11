package Duotai;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Cat();//上转型
        animal.bark();
        animal=new Dog();
        animal.bark();
    }
}
