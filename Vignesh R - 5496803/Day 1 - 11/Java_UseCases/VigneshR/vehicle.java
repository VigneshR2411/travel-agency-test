package VigneshR;
class car;
    private boolean engineStatus;
    private int speed;
    private int fuelLevel;  // renamed for clarity (optional)

    public void setEngine(boolean engineStatus) {
        this.engineStatus = engineStatus;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFuel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public String getEngine() {
        return engineStatus ? "Engine Started" : "Engine Stops";
    }

    public int getSpeed() {
        return speed;
    }

    public int getFuel() {
        return fuelLevel;
    }
}

public class vehicle {
    public static void main(String args[]) {
        Car swift = new Car();
        swift.setEngine(true);
        swift.setSpeed(50);
        swift.setFuelLevel(5);

        System.out.println("Engine Status: " + swift.getEngine());
        System.out.println("Speed: " + swift.getSpeed() + " km/h");
        System.out.println("Fuel Level: " + swift.getFuelLevel() + " ltr");  // corrected
    }
}