public class OOP {
    public static void main(String args[]){
        Names N = new Names("Loken" + ".");
        N.Print();
    }
}
//Practicing Constructors
class Names{
    String name;
    public void Print(){
        System.out.println("My friend's name is " + this.name);
    }
//Parametarize Constructors
    Names(String name){
        this.name = name;
        System.out.println("Some of my friends name are here.");
    }
}
