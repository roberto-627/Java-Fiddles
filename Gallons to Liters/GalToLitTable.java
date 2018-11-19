class GalToLitTable {
    public static void main(String[] args) {
        double gallons;
        double liters;

        for (gallons = 1; gallons <= 50; gallons ++) {
            liters = gallons * 3.7854;

            System.out.println(gallons + " gallons is equivalent to " + liters + " liters.");
        
            if(gallons % 10 == 0){
                System.out.println();
            }
        }
    }
}