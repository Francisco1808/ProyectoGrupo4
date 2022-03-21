
package proyecto_grupo_4;
import javax.swing.JOptionPane;
public class Pintura {
private String color;
private String brillo;
private String opacidad;
private String textura;
private int precio;
public Pintura(){
    color="";
    brillo="";
    opacidad="";
    textura="";
    precio=30000;
   }
public Pintura(String pcolor,String pbrillo, String popacidad, String ptextura, int pprecio){
 color=pcolor;
 brillo=pbrillo;
 opacidad=popacidad;
 textura=ptextura;
 precio=pprecio;
}

    public String getColor() {
        return color;
    }

    public String setColor(String pcolor) {
        pcolor=JOptionPane.showInputDialog(null,"de que color desea la pintura");
        color = pcolor;
        return color;
    }

    public String getBrillo() {
        return brillo;
    }

    public String setBrillo(String pbrillo) {
        pbrillo=JOptionPane.showInputDialog(null,"prefiere que sea: brillante|estandar");
        brillo = pbrillo;
        return brillo;
    }

    public String getOpacidad() {
        return opacidad;
    }

    public String setOpacidad(String popacidad) {
        popacidad=JOptionPane.showInputDialog(null,"prefiere que sea opaco: si|no");
        opacidad = popacidad;
        return opacidad;
    }

    public String getTextura() {
        return textura;
    }

    public String setTextura(String ptextura) {
        ptextura=JOptionPane.showInputDialog(null,"textura=lisa|lima");
        textura = ptextura;
        return textura;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
 public String toString(){
        String retVal="";
        retVal+="Marca: "+this.getColor()+"|";
        retVal+="Grosor: "+this.getBrillo()+"|";
        retVal+="Tipo de tacos: "+this.getOpacidad()+"|";
        retVal+="cantidad: "+this.getTextura()+"|";
  return retVal;


}}
