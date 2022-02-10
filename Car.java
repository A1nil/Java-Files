public class Car {
    String color;
    String model;
    String power;

    public void carInfo(){
        System.out.println("Here is your car's Info");
        System.out.println(this.color);
        System.out.println(this.model);
        System.out.println(this.power);
    }

    public static void main(String[] args){
        Car Car1 = new Car();
        Car1.color = "Black";
        Car1.model = "Genesis";
        Car1.power = "240hp";

        Car Car2 = new Car();
        Car2.color = "White";
        Car2.model = "Ferari";
        Car2.power = "250hp";

        Car1.carInfo();
        Car2.carInfo();
        }
}
