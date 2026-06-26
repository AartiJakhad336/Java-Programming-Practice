public class objectCar {
    int noOfWheels;
    String colour;
    float currentFuelInLiters;
    float maxSpeed;
    int noOfSeats;
    public void drive(){
        System.out.println("Car is driving:");
        currentFuelInLiters--;
    }
    public void addFuel(float fuel){
        currentFuelInLiters += fuel;
    }
    public float getCurrentFuelInLiters(){
        return currentFuelInLiters;
    }
}
