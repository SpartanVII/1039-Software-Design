package HW6;

import java.util.ArrayList;
import java.util.List;

public class Historial {
    private List<String> historial = new ArrayList<>();

    public void addMovimiento(String movimiento){
        historial.add(movimiento);
    }

    public void borrarUltimoMovimiento(){
        if (historial.isEmpty()) return;
        historial.remove(historial.size()-1);
    }

    public void go(){
        for (String mov : historial){
            System.out.println(mov);
        }
        historial.clear();
    }
}
