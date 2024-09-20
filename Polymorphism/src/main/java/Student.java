public class Student extends Human{
    public String name;
    public String email;
    @Override
    public void nhap(){
        System.out.println(this.name);
    }

    public Student(){

    }

    public Student(String name){
        this.name = name;
    }

    public Student(String name, String email){
        this.name = name;
        this.email = email;
    }
}
