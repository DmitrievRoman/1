import java.util.ArrayList;
import java.util.List;

public class Switcher {
    private List<ElectricityConsumer> consumers = new ArrayList<>();
    public void switchOn() {
        System.out.println("Switch on");
        for(ElectricityConsumer e : consumers) {
            e.electricityOn();
        }
    }

    public void addConsumer(ElectricityConsumer electricityConsumer) {
        consumers.add(electricityConsumer);
    }

    public void removeConsumer(ElectricityConsumer electricityConsumer ) {
        consumers.remove(electricityConsumer);
    }

    
}
