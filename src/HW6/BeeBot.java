package HW6;

import java.util.Objects;

public class BeeBot {
    Historial historial = new Historial();

    public void almacenaMovimiento(String movimiento){
        historial.addMovimiento(movimiento);
    }

    public void go(){
        historial.go();
    }

    public void borrar(){
        historial.borrarUltimoMovimiento();
    }
}
