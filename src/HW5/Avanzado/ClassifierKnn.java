package HW5.Avanzado;

public class ClassifierKnn implements ClassifierStrategy {
    DistanceStrategy distanceStrategy;

    public ClassifierKnn(DistanceStrategy distanceStrategy) {
        this.distanceStrategy = distanceStrategy;
    }

    @Override
    public void play() {
        distanceStrategy.play();
        System.out.println("ClassifierKnn executed\n");
    }
}
