package Test;

public class Student extends User{
    private int id;
    private String majar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMajar() {
        return majar;
    }

    public void setMajar(String majar) {
        this.majar = majar;
    }
    public Student (int id,String majar){
        this.id=id;
        this.majar=majar;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", majar='" + majar + '\'' +
                '}';
    }
}
