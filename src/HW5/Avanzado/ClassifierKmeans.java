package HW5.Avanzado;

public class ClassifierKmeans implements ClassifierStrategy {
    DistanceStrategy distanceStrategy;

    public ClassifierKmeans(DistanceStrategy distanceStrategy) {
        this.distanceStrategy = distanceStrategy;
    }

    @Override
    public void play() {
        distanceStrategy.play();
        System.out.println("ClassifierKmeans executed\n");
    }
}
