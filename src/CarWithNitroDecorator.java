public class CarWithNitroDecorator extends CarDecorator {

    private Double nitroTankLoad;

    public CarWithNitroDecorator(Car toDecorate,Double nitroLoad) {
        super(toDecorate);
        this.nitroTankLoad = nitroLoad;
    }

    public void injectNitroToEngine() throws InterruptedException {
        while (this.nitroTankLoad > 0 ) {
            this.showNitroLoad();
            this.nitroTankLoad -= 2;
            Thread.sleep(50);
        }
    }

    public void loadNitroTank(Double load){
        this.nitroTankLoad = load;
    }

    public void showNitroLoad(){
        System.out.println();
        System.out.printf("injecting nitro, remaining %.2f lbs", this.nitroTankLoad);
    }
}
