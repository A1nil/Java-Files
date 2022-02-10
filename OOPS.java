class Pen{
    String color;
    String type;
    
    public void Write(){
        System.out.println("Write something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
 //new = to allocate the space for all the storage of object properties 
 // Parenthesis = used when there is function

class Student{
    String name;
    int age;
    int grade;
    int rollNo;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.grade);
        System.out.println(this.rollNo);
    }

    Student(){
        System.out.println("This is my first created constructor.");
    }
}


public class OOPS{
    public static void main(String[] args){
        Pen Pen1 = new Pen();
        Pen1.color = "Green";
        Pen1.type = "Gel";

        Pen1.Write();

        Pen Pen2 = new Pen();
        Pen2.color = "Black";
        Pen2.type = "Ballpoint";

        Pen1.printColor();
        Pen2.printColor();

        Student S1 = new Student();
        S1.name = "Anil Thapa";
        S1.age = 20;
        S1.grade = 14;
        S1.rollNo = 30;

        S1.printInfo();
    }
}