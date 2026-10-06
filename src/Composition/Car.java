package Composition;

 public class Car {
    private Engine engine;

   public Car(Engine engine){
        this.engine=engine;
    }

    public void drive(){
        engine.Start();
        System.out.println("Car is Moveing");
    }
}



/*
// This Code is Compostion-RelationShip but it has Faces Problem So We Use UpperWrittenCode
public class Car{
    private Engine engine = new DesialEngine();
    public void StartCar(){
        engine.Start();
        System.out.println("Car Started");
    }
}

The code is correct, but the problem is tight coupling because the Car class creates the DesialEngine object directly.
If we want to use another engine, we need to modify the Car class

 */


