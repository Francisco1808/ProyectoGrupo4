
package proyecto_grupo_4;
import javax.swing.JOptionPane;
public class Escaneo {
private int especifico;
private int general;
int precio;

public Escaneo(){
especifico=0;
general=0;
precio=55000;
}
public Escaneo(int pespecifico, int pgeneral, int pprecio){
especifico=pespecifico;
general=pgeneral;
precio=pprecio;
}

    public int getEspecifico() {
        if (especifico==1){
        JOptionPane.showMessageDialog(null,"motor frontal escaneado");}
        else if (especifico==2){
         JOptionPane.showMessageDialog(null,"motor inferior escaneado");}
         else if (especifico==3){
        JOptionPane.showMessageDialog(null,"computadora inteligente escaneada");}
        return especifico;
    }

    public int setEspecifico(int pespecifico){
        pespecifico=Integer.parseInt(JOptionPane.showInputDialog(null,"desea un escaneo especifico? 1=si,2=no"));
        if(pespecifico==1){
        pespecifico=Integer.parseInt(JOptionPane.showInputDialog(null,"escanear;1=motor frontal|2=motor inferior|3=computadora inteligente"));    
        }
        especifico = pespecifico;
        return especifico;
    }

    public int getGeneral() {
        return general;
    }

    public int setGeneral(int pgeneral) {
        pgeneral=Integer.parseInt(JOptionPane.showInputDialog(null,"desea un escaneo general? 1=si,2=no"));
        general = pgeneral;
        return general;
    }

    public int getPrecio() {
        int suma;
        if(especifico==1){
            suma=precio+20000;
            precio=suma;
        }else if(general==1){
            suma=precio+5000;
            precio=suma;
        }
        return precio;
    }
    

    public void setPrecio(int precio) {
        this.precio = precio;
    }
public String toString(){
        String retVal="";
        retVal+="Marca: "+this.getGeneral()+"|";
        retVal+="Grosor: "+this.getEspecifico()+"|";
       
  return retVal;
}}
