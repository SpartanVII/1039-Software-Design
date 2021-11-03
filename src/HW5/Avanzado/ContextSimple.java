package HW5.Avanzado;

public class ContextSimple {
    ClassifierStrategy classifierStrategy;

    public ContextSimple(ClassifierStrategy strategy) {
        this.classifierStrategy = strategy;
    }

    public void run(){
        classifierStrategy.play();
    }

    public void setClassifierStrategy(ClassifierStrategy classifierStrategy) {
        this.classifierStrategy = classifierStrategy;
    }
}
