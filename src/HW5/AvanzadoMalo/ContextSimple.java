package HW5.AvanzadoMalo;

public class ContextSimple {
    private ClassifierStrategy classifierStrategy;

    public ContextSimple(ClassifierStrategy strategy) {
        this.classifierStrategy = strategy;
    }

    public void run(){
        classifierStrategy.execute();
    }

    public void setClassifierStrategy(ClassifierStrategy classifierStrategy) {
        this.classifierStrategy = classifierStrategy;
    }
}
