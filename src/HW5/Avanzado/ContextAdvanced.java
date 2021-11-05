package HW5.Avanzado;

public class ContextAdvanced {
    private ClassifierStrategy classifierStrategy;
    private DistanceStrategy distanceStrategy;

    public ContextAdvanced(ClassifierStrategy strategy) {
        this.classifierStrategy = strategy;
    }

    public void run(){
        distanceStrategy.calculate();
        classifierStrategy.execute();
    }

    public void setClassifierStrategy(ClassifierStrategy classifierStrategy) {
        this.classifierStrategy = classifierStrategy;
    }

    public void setDistanceStrategy(DistanceStrategy distanceStrategy) {
        this.distanceStrategy = distanceStrategy;
    }
}
