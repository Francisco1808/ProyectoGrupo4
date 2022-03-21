
package proyecto_grupo_4;

import javax.swing.JOptionPane;
public class Repuesto {
 private  String marca;
 private int precio;
 private int tipo;
 private String modelo;
 private int rango;
 private int cantidad;
 
 public Repuesto(){
 marca="";
 precio=50000;
 tipo=0;
 modelo="";
 rango=0;
 cantidad=0;
 }
  public Repuesto(String pmarca, int pprecio, int ptipo, String pmodelo, int prango, int pcantidad){
 marca=pmarca;
 precio=pprecio;
 tipo=ptipo;
 modelo=pmodelo;
 rango=prango;
 cantidad=pcantidad;
}

    public String getMarca() {
        return marca;
    }

    public String setMarca(String pmarca) {
        pmarca=JOptionPane.showInputDialog(null,"Escriba la marca de repuesto que requiere");
        marca = pmarca;
        return marca;
    }

    public int getPrecio() {
         int mult;
        mult=cantidad*precio;
        precio=mult;
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTipo() {
        return tipo;
    }

    public int setTipo(int ptipo) {
        ptipo=Integer.parseInt(JOptionPane.showInputDialog(null,"puerta|techo|ventana|bumper|cajuela|"));
        tipo = ptipo;
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public String setModelo(String pmodelo) {
        pmodelo=JOptionPane.showInputDialog(null,"Nombre del modelo de transporte");
        modelo = pmodelo;
        return modelo;
    }

    public int getRango() {
        return rango;
    }

    public int setRango(int prango) {
        prango=Integer.parseInt(JOptionPane.showInputDialog("derecha|izquierda|frontal|trasera|arriba|abbajo"));
        rango = prango;
        return rango;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int setCantidad(int pcantidad) {
        pcantidad=Integer.parseInt(JOptionPane.showInputDialog("cuantos repuestos necesita"));
        cantidad = pcantidad;
        return cantidad;
    }
  public String toString(){
        String retVal="";
        retVal+="Marca: "+this.getMarca()+"|";
        retVal+="Grosor: "+this.getModelo()+"|";
        retVal+="Tipo de tacos: "+this.getRango()+"|";
        retVal+="cantidad: "+this.getCantidad()+"|";
  return retVal;
}}
