package HW5.AvanzadoMalo;

public class DemoStrategyAdvanced {

    public static void main(String[] args) {
        System.out.println("--- KNN with Euclidean distance---");
        ContextSimple context = new ContextSimple(new ClassifierKnn(new DistanceEuclidea()));
        context.run();

        System.out.println("--- KNN with Manhattan distance---");
        context.setClassifierStrategy(new ClassifierKmeans(new DistanceManhattan()));
        context.run();

        System.out.println("--- K-means with Manhattan distance ---");
        context.setClassifierStrategy(new ClassifierSOM(new DistanceManhattan()));
        context.run();

        System.out.println("--- SOM  with Euclidean distance ---");
        context.setClassifierStrategy(new ClassifierSOM(new DistanceEuclidea()));
        context.run();
    }
}
