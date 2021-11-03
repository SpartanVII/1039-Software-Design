package HW5.Avanzado;

public class ClassifierSOM implements ClassifierStrategy {
    DistanceStrategy distanceStrategy;

    public ClassifierSOM(DistanceStrategy distanceStrategy) {
        this.distanceStrategy = distanceStrategy;
    }

    @Override
    public void play() {
        distanceStrategy.play();
        System.out.println("ClassifierSOM executed\n");
    }
}
