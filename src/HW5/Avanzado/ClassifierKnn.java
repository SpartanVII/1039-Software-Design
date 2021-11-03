package HW5.Avanzado;

public class ClassifierKnn implements ClassifierStrategy {
    private DistanceStrategy distanceStrategy;

    public ClassifierKnn(DistanceStrategy distanceStrategy) {
        this.distanceStrategy = distanceStrategy;
    }

    @Override
    public void execute() {
        distanceStrategy.calculate();
        System.out.println("ClassifierKnn executed\n");
    }
}
