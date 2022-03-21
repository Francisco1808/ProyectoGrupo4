
package proyecto_grupo_4;
import javax.swing.JOptionPane;
public class Mecanica_General {
private int cabezote;
private int pistones;
private int valvulas;
private int radiador;   
private int precio;
public Mecanica_General(){
cabezote=0;
pistones=0;
valvulas=0;
radiador=0;
precio=40000;
}
public Mecanica_General(int pcabezote, int ppistones, int pvalvulas,int pradiador, int pprecio){
 cabezote=pcabezote;
pistones=ppistones;
valvulas=pvalvulas;
radiador=pradiador;  
precio=pprecio;
}

    public int getCabezote() {
        return cabezote;
    }

    public int setCabezote(int pcabezote) {
        pcabezote=Integer.parseInt(JOptionPane.showInputDialog("Desea reparar el cabezote? 1=si, 2=no"));
        cabezote = pcabezote;
        return cabezote;
    }

    public int getPistones() {
        return pistones;
    }

    public int setPistones(int ppistones) {
        ppistones=Integer.parseInt(JOptionPane.showInputDialog("Desea reparar los pistones? 1=si, 2=no"));
        pistones = ppistones;
        return pistones;
    }

    public int getValvulas() {
        return valvulas;
    }

    public int setValvulas(int pvalvulas) {
        pvalvulas=Integer.parseInt(JOptionPane.showInputDialog("Desea cambiar las valvulas? 1=si, 2=no"));
        valvulas = pvalvulas;
        return valvulas;
    }

    public int getRadiador() {
        return radiador;
    }

    public int setRadiador(int pradiador) {
        pradiador=Integer.parseInt(JOptionPane.showInputDialog("Desea reparar el radiador? 1=si, 2=no"));
        radiador = pradiador;
        return radiador;
    }

    public int getPrecio() {
        int suma;
        if(cabezote==1){
        suma=precio+30000;
        precio=suma;
       }if(pistones==1){
        precio=precio+20000;   
       }if(valvulas==1){
        precio=precio+10000;
       }if(radiador==1){
           precio=precio+30000;
       }
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
 public String toString(){
        String retVal="";
        retVal+="Marca: "+this.getCabezote()+"|";
        retVal+="Grosor: "+this.getPistones()+"|";
        retVal+="Tipo de tacos: "+this.getValvulas()+"|";
        retVal+="cantidad: "+this.getRadiador()+"|";
  return retVal;
}}
