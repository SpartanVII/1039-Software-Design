package Clases.TE3;

public class Singleton {
    static Singleton instance;
    public synchronized static Singleton getInstance(){
        if(instance==null) instance= new Singleton();
        return instance;
    }
}
