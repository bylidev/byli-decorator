public abstract class CarDecorator implements Car {

    private Car car;

    public CarDecorator(Car toDecorate) {
        this.car = toDecorate;
    }

    @Override
    public void speedUp() throws InterruptedException {
        this.car.speedUp();
    }

    @Override
    public void speedDown() throws InterruptedException {
        this.car.speedDown();
    }

}
