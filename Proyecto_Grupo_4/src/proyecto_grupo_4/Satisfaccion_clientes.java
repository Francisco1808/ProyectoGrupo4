
package proyecto_grupo_4;
import javax.swing.JOptionPane;
public class Satisfaccion_clientes {
private int nivel_satisfaccion;
private String observaciones;
private String recomendaciones;

public Satisfaccion_clientes(){
nivel_satisfaccion=0;
observaciones="";
recomendaciones="";
}
public Satisfaccion_clientes(int pnivel_satisfaccion,String pobservaciones, String precomendaciones){
nivel_satisfaccion=pnivel_satisfaccion;
observaciones=pobservaciones;
recomendaciones=precomendaciones;   
}

    public int getNivel_satisfaccion() {
        return nivel_satisfaccion;
    }

    public int setNivel_satisfaccion(int pnivel_satisfaccion) {
        pnivel_satisfaccion=Integer.parseInt(JOptionPane.showInputDialog("de una escala de 1 a 10 como quedo satisfecho como cliente?"));
        nivel_satisfaccion = pnivel_satisfaccion;
        return nivel_satisfaccion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public String setObservaciones(String pobservaciones) {
        pobservaciones=JOptionPane.showInputDialog("alguna observacion");
        observaciones = pobservaciones;
        return observaciones;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public String setRecomendaciones(String precomendaciones) {
        precomendaciones=JOptionPane.showInputDialog("alguna recomendacion");
        recomendaciones = precomendaciones;
        return recomendaciones;
    }


   
}
