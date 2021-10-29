package Clases.TE7;

public abstract class KNN {

    final public void templateMethod(){
        step1();
        if(step5()) {
            step2();
            step3();
            step4();
        }
    }

    abstract public void step1();
    abstract public void step2();

    public void step3(){
        System.out.println("Encontrando similitudes...");
    }

    public void step4(){
        System.out.println("Clasificando");
    }

    public boolean step5(){
        return true;
    }

}
