/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_grupo_4;
import javax.swing.JOptionPane;

public class Frenos{
 private int Zapato_frenos;
 private int precio;
 private String marca;
 private int calibre;
  private String liquido;
 

 public Frenos(){
 Zapato_frenos=0;
 precio=20000;
 marca="";
 calibre=0;
 liquido="";
 
 }
 public Frenos(int pZapato_frenos, int pprecio, String pmarca, int pcalibre, String pliquido){
  Zapato_frenos=pZapato_frenos;
 precio=pprecio;
 marca=pmarca;
 calibre=pcalibre;
 liquido=pliquido;
 
 }
 
 
 public int getZapato_frenos() {
        return Zapato_frenos;
    }

    public int setZapato_frenos(int pZapato_frenos) {
        pZapato_frenos=Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero del tipo de zapato:1=Goodyear(30000)|2=Cooper(20000)|3=Scorpio(16000)"));
        Zapato_frenos = pZapato_frenos;
        
        return Zapato_frenos;
    }

    public int getPrecio() {
        int suma;
        if(Zapato_frenos==1){
        suma=precio+15000;
        precio=suma;
        }else if(Zapato_frenos==2){
        suma=precio+10000;
        precio=suma;
        }else if(Zapato_frenos==3){
        suma=precio+8000;
        precio=suma;
        }
        return precio;
    }

    public int setPrecio(int pprecio) {
        
            
        return precio;
    }

   

    public String setMarca(String pmarca) {
        pmarca=JOptionPane.showInputDialog(null,"escribael nombre marca del zapato que escogio");
        marca = pmarca;
        return marca;
    }
      public String getMarca() {
        return marca;
    }
    public int getCalibre() {
        return calibre;
    }

    public int setCalibre(int pcalibre) {
        pcalibre=Integer.parseInt(JOptionPane.showInputDialog("escriba el calibre que desea"));
        calibre = pcalibre;
        return calibre;
    }

    public String getLiquido() {
        return liquido;
    }

    public String setLiquido(String pliquido) {
        pliquido=JOptionPane.showInputDialog(null,"Tipo de liquido: Hidraulico | Friccion");
        this.liquido = pliquido;
        return liquido;
    }
    public String toString(){
        String retVal="";
        retVal+="Zapato: "+this.getZapato_frenos()+"|";
        retVal+="Marca: "+this.getMarca()+"|";
        retVal+="Calibre: "+this.getCalibre()+"|";
        retVal+="Liquido: "+this.getLiquido()+"|";
        
     return retVal;   
    }

   
    
 

    
    }
 

