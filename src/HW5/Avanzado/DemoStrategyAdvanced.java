package HW5.Avanzado;

public class DemoStrategyAdvanced {

    public static void main(String[] args) {
        System.out.println("--- KNN with Euclidean distance---");
        ContextAdvanced context = new ContextAdvanced(new ClassifierKnn());
        context.setDistanceStrategy(new DistanceEuclidea());
        context.run();

        System.out.println("--- KNN with Manhattan distance---");
        context.setClassifierStrategy(new ClassifierKmeans());
        context.setDistanceStrategy(new DistanceManhattan());
        context.run();

        System.out.println("--- K-means with Manhattan distance ---");
        context.setClassifierStrategy(new ClassifierSOM());
        context.setDistanceStrategy(new DistanceManhattan());
        context.run();

        System.out.println("--- SOM  with Euclidean distance ---");
        context.setClassifierStrategy(new ClassifierSOM());
        context.setDistanceStrategy(new DistanceEuclidea());
        context.run();
    }
}
