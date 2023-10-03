public class Boat extends Vehicle {
    public void sail(UI ui) {
        if (getEngineIsStarted()) {
            ui.movementMessage(this); // Pass the current Boat object
        } else {
            System.out.println("Turn on the engine");
        }
    }
}
