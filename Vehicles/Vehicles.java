class Vehicle {
    private int Passengers;
    private int FuelCapacity;
    private int MilesPerGalon;

    Vehicle(){
        Passengers = 0;
        FuelCapacity = 0;
        MilesPerGalon = 0;
    }

    Vehicle(int P, int FC, int MPG){
        Passengers = P;
        FuelCapacity = FC;
        MilesPerGalon = MPG;
    }
}

class Truck extends Vehicle {
    private int CargoCapacity;

    Truck(int P, int FC, int MPG, int C){
        super(P, FC, MPG);
        CargoCapacity = C;
    }

    int getCargo(){
        return CargoCapacity;
    }

    void putCargo(int C){
        CargoCapacity = C;
    }
}

class TwoVehicles {
    public static void main(String[] args) {
        Vehicle Minivan = new vehicle();
        Vehicle Sportscar= new Vehicle();
    }
}