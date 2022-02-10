public class Practice {
    public static void main(String[] args){
        Animal a1 = new Animal();
        a1.name = "Lion";

        Animal a2 = new Animal();
        a2.name = "Cow";

        Animal a3 = new Animal();
        a3.name = "Dog";

        System.out.println(a1.name);
        System.out.println(a2.name);
        System.out.println(a3.name);

        a1.eat();
        a2.eats();
    }
    
}

//creating a new class
class Animal{
    //creating properties
    String name;

    //creating behaviour
    void eat(){
        System.out.println(name + " eat meat.");
    }

    void eats(){
        System.out.println(name + " eats grass.");
    }
}