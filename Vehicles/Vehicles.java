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
    
    int getRange(){
        return FuelCapacity * MilesPerGalon;
    }

    double FuelNeeded(int miles){
        return (double) (miles / MilesPerGalon);
    }

    void setPassengers(int P){
        Passengers = P;
    }

    void setFuelCapacity(int FC){
        FuelCapacity = FC;
    }

    void setMilesPerGalon(int MPG){
        MilesPerGalon = MPG;
    }

    void getPassengers(){
        Passengers = P;
    }

    void getFuelCapacity(){
        FuelCapacity = FC;
    }

    void getMilesPerGalon(){
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

