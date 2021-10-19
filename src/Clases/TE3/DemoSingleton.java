package Clases.TE3;

public class DemoSingleton {
    public static void main(String[] args){
        double ini, fin;

        ini =System.currentTimeMillis();
        Singleton instance1 = Singleton.getInstance();
        fin =System.currentTimeMillis();
        System.out.println(instance1);
        System.out.println("Tiempo 1: "+(fin-ini)+"\n");


        ini =System.currentTimeMillis();
        Singleton instance2 = Singleton.getInstance();
        fin =System.currentTimeMillis();
        System.out.println(instance2);
        System.out.println("Tiempo 2: "+(fin-ini));
    }
}
