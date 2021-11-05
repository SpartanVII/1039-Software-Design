package HW5.AvanzadoMalo;

public class ClassifierSOM implements ClassifierStrategy {
    private DistanceStrategy distanceStrategy;

    public ClassifierSOM(DistanceStrategy distanceStrategy) {
        this.distanceStrategy = distanceStrategy;
    }

    @Override
    public void execute() {
        distanceStrategy.calculate();
        System.out.println("ClassifierSOM executed\n");
    }
}
