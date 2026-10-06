package Composition;

public class test {
   public static void main(String[] args) {
      //  Car car=new Car(new DesialEngine());
       Car car=new Car(new PetrolEngine());
        car.drive();
    }
}
