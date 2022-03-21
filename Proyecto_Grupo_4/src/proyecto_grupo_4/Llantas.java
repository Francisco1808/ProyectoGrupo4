
package proyecto_grupo_4;
import javax.swing.JOptionPane;
public class Llantas {
private String marca;
private int precio;
private String grosor;
private String tipo_tacos;
private int tamano;
private int cantidad;

public Llantas(){
marca="";
precio=10000;
grosor="";
tipo_tacos="";
tamano=0;
cantidad=0;    
}

public Llantas(String pmarca,int pprecio,String pgrosor, String ptipo_tacos,int ptamano, int pcantidad ){
marca=pmarca;
precio=pprecio;
grosor=pgrosor;
tipo_tacos=ptipo_tacos;
tamano=ptamano;
cantidad=pcantidad;
}

    public String getMarca() {
        return marca;
    }

    public String setMarca(String pmarca) {
        pmarca=JOptionPane.showInputDialog(null,"cual marca de llanta prefiere?");
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

    public String getGrosor() {
        return grosor;
    }

    public String setGrosor(String pgrosor) {
        pgrosor=JOptionPane.showInputDialog(null,"cual grosor requiere: ancho o mediano ");
        grosor = pgrosor;
        return grosor;
    }

    public String getTipo_tacos() {
        return tipo_tacos;
    }

    public String setTipo_tacos(String ptipo_tacos) {
        ptipo_tacos=JOptionPane.showInputDialog(null,"Tacos: carrera|traccion ");
        tipo_tacos = ptipo_tacos;
        return tipo_tacos;
    }

    public int getTamano() {
        return tamano;
    }

    public int setTamano(int ptamano) {
        ptamano=Integer.parseInt(JOptionPane.showInputDialog("de que tamano las ocupa en cm"));
        tamano = ptamano;
        return tamano;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int setCantidad(int pcantidad) {
        pcantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"cantidad de llantas: 1,2,3,4,5"));
        cantidad = pcantidad;
        return cantidad;
    }
     public String toString(){
        String retVal="";
        retVal+="Marca: "+this.getMarca()+"|";
        retVal+="Grosor: "+this.getGrosor()+"|";
        retVal+="Tipo de tacos: "+this.getTipo_tacos()+"|";
        retVal+="tamano: "+this.getTamano()+"|";
        retVal+="cantidad: "+this.getCantidad()+"|";
        
     return retVal;

}}
