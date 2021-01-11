package Test;

public class Main {
    public static void main(String[] args) {
        Student stu=new Student(2019120016,"计算机科学与技术");
        System.out.println("调用父类构造方法获取默认密码:"+stu.getPassword());
        System.out.println(stu);
    }
}
