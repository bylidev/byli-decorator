public final class GasCar implements Car{

    private Double maxSpeed;
    private Double currentSpeed;

    public GasCar(Double maxSpeed) {
        this.currentSpeed = 0d;
        this.maxSpeed = maxSpeed;
    }

    public void speedUp() {
        while (this.currentSpeed < maxSpeed) {
            this.showVelocity();
            this.currentSpeed += 1;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void speedDown() throws InterruptedException {
        while (this.currentSpeed > 0 ) {
            this.showVelocity();
            this.currentSpeed -= 1;
                Thread.sleep(50);
        }
    }

    private void showVelocity(){
        System.out.println();
        System.out.printf("Speed %.2f KM/h of a %.2f max velocity.", this.currentSpeed,this.maxSpeed);
    }
}
