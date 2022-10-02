public class JavaLearning {
    public static void main(String[] args) {
        // byte se uporabi, če je vrednost od -128 do 127
        byte numberOfSeats = 5;
        byte numberOfDoors = 3;
        byte numberOfVehicleOwners = 1;
        byte emissionSticker = 4;

        // short se uporabi, če je vrednost od -32.768 do 32.767
        short power = 362;
        short horsePower = 492;
        short co2Emission = 333;
        short cubicCapacity = 6;

        // int se uporabi, če je vrednost od -2.147.483.648 do -2.147.483.647
        int price = 29999;
        int mileage = 14999;

        // long se uporabi, če je vrednost od -9.223.372.036.854.775.808 do -9.223.372.036.854.775.807
        long registrationNumber = 4738429374423L;

        float fuelConsumptionCombined = 15.5F;
        float fuelConsumptionUrban = 21.4F;
        float fuelConsumptionExtraUrban = 13.6F;

        double fuelConsumptionPreciseAverage = 152.22345345623e-1;

        boolean isDamaged = true;

        char energyEfficiencyCategory = 'G';

        // sout
        System.out.println("2018 Dodge Challenger SRT 392");
        System.out.println("Price: €" + price);
        System.out.println("Mileage: " + mileage + "km");
        System.out.println("The car is Damaged: " + isDamaged);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Cubic capacity: " + cubicCapacity + "ccm");
        System.out.println("Power: " + power + "kW(" + horsePower + "hp)");
        System.out.println("CO2 emission: " + co2Emission + " g/km");
        System.out.println("Emission sticker: " + emissionSticker + " (Energy Efficiency Category: " + energyEfficiencyCategory + ")");
        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined + " l/100km");
        System.out.println("Urban fuel consumption: " + fuelConsumptionUrban + " l/100km");
        System.out.println("Extra urban fuel consumption: " + fuelConsumptionExtraUrban + " l/100km");
        System.out.println("Precise average fuel consumption: " + fuelConsumptionPreciseAverage + " l/100km");
        System.out.println("Number of previous owners: " + numberOfVehicleOwners);
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Number of seats: " + numberOfSeats);

        System.out.println("Conversion");
        short newNumberOfSears = numberOfSeats;
        System.out.println("The value of new number of seats: " + newNumberOfSears);
        double newFuelConsumptionCombined = fuelConsumptionCombined;
        System.out.println("The new value of combined fuel consumption: " + newFuelConsumptionCombined + "l/100km");

        byte newPower = (byte) power;
        System.out.println("The value of the new power: " + newPower + "kW");
    }
}
