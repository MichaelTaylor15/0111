package Test;

public class User {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(){
        this("123456");//调用本类的构造方法
    }
    public User(String password){
        this.password=password;
    }
}
