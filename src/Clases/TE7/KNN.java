package Clases.TE7;

public abstract class KNN {

    public void templateMethod(){
        step1();
        if(step5()) {
            step2();
            step3();
            step4();
        }
    }

    abstract protected void step1();
    abstract protected void step2();

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
