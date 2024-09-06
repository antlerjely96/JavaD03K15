//Khai báo class có tên là Human
public class Human {
    //Khai báo 4 attribute: Name, Age, Phone, Address
    public String name;
    public int age;
    public String phone;
    public String address = "Vietnam";

    //Khai báo 4 method: eat, sleep, run, display
    public void eat(){
        System.out.println("Eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
    public void run(){
        System.out.println("run");
    }
    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Phone: " + this.phone);
        System.out.println("Address: " + this.address);
    }
}
