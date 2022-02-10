import java.util.Stack;

public class NewStack {
    public static void main(String[] args){
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println(s);
        System.out.println("The removed value is " +s.pop());
        System.out.println("The top value is " +s.peek());

        tree t = new tree();
        t.Speciality_Of_Orange();
    }
}

class tree{
    String Apple;
    String Banana;
    String Mango;
    String Pine;
    String Orange;

    public void Speciality_Of_Apple(){
        System.out.println("Apple is great for health.");
    }

    public void Speciality_Of_Banana(){
        System.out.println("Banana is found in every season.");
    }

    public void Speciality_Of_Mango(){
        System.out.println("Mango is the king of the fruits.");
    }

    public void Speciality_Of_Pine(){
        System.out.println("Pine are found in high altittude.");
    }

    public void Speciality_Of_Orange(){
        System.out.println("Oranges are best for making juices.");
    }
}