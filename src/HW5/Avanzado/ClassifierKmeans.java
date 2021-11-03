package HW5.Avanzado;

public class ClassifierKmeans implements ClassifierStrategy {
    private DistanceStrategy distanceStrategy;

    public ClassifierKmeans(DistanceStrategy distanceStrategy) {
        this.distanceStrategy = distanceStrategy;
    }

    @Override
    public void execute() {
        distanceStrategy.calculate();
        System.out.println("ClassifierKmeans executed\n");
    }
}
