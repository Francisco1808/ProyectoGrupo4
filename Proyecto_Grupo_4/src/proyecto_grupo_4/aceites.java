
package proyecto_grupo_4;
import javax.swing.JOptionPane;

public class aceites {
 private int Marca;
 private String tipo;
 private int combustible;
 private int rango;
 private int precio;
 
 public aceites(){
 Marca=0;
 tipo="";
 combustible=0;
 rango=0;
 precio=15000;
 }
 public aceites(int pMarca, String ptipo, int pcombustible, int prango, int pprecio){
 Marca=pMarca;
 tipo=ptipo;
 combustible=pcombustible;
 rango=prango;
 precio=pprecio;
 }

    public int getMarca() {
        return Marca;
    }

    public int setMarca(int pMarca) {
        pMarca=Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba el numero de la marca:1=Mobil(10000)|2=Penzoil(5000)|3=Valvoline(8000)|4=Castrol(9000)"));
        Marca = pMarca;
        return Marca;
    }

    public String getTipo() {
        return tipo;
    }

    public String setTipo(String ptipo) {
       ptipo=JOptionPane.showInputDialog(null,"Traccion|Carrera");
        tipo = ptipo;
        return tipo;
    }

    public int getCombustible() {
        return combustible;
    }

    public int setCombustible(int pcombustible) {
        pcombustible=Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba 1=Diesel|2=Gasolina"));
        combustible = pcombustible;
        
        
        return combustible;
    }

    public int getRango() {
        return rango;
    }

    public int setRango(int prango) {
        prango=Integer.parseInt(JOptionPane.showInputDialog("Rango:10-20-30-40-50-60-70-80-90"));
        rango = prango;
        return rango;
    }

    public int getPrecio() {
        
        int suma;
        if(Marca==1){
        suma=precio+10000;
        precio=suma;}
        else if(Marca==2){
       suma=precio+5000;
       precio=suma;}
        else if (Marca==3){
       suma=precio+8000;
       precio=suma;
       
       }
        
        return precio;
    }

    public int setPrecio(int precio) {
        this.precio = precio;
        return precio;
    }

 public String toString(){
        String retVal="";
        retVal+="Marca: "+this.getMarca()+"|";
        retVal+="Tipo: "+this.getTipo()+"|";
        retVal+="Combustible: "+this.getCombustible()+"|";
        retVal+="Rango: "+this.getRango()+"|";
        
     return retVal;
}}
