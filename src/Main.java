public class Main {
    public static void main(String[] args) throws InterruptedException {
        GasCar stdCar = new GasCar(220d);
        stdCar.speedUp();

        CarWithNitroDecorator sportiveStdCar = new CarWithNitroDecorator(stdCar,50.2d);
        sportiveStdCar.injectNitroToEngine();
    }
}