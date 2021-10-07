public class Lamp implements ElectricityConsumer{
    @Override
    public void electricityOn() {
        System.out.println("Lamp on");
    }
}
