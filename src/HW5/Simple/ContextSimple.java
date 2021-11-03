package HW5.Simple;

public class ContextSimple {
    private ClassifierStrategy classifierStrategy;

    public ContextSimple(ClassifierStrategy strategy) {
        this.classifierStrategy = strategy;
    }

    public void setClassifierStrategy(ClassifierStrategy classifierStrategy) {
        this.classifierStrategy = classifierStrategy;
    }

    public void run(){
        classifierStrategy.execute();
    }
}
