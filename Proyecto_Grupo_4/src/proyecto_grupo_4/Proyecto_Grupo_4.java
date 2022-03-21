package proyecto_grupo_4;
import javax.swing.JOptionPane;

public class Proyecto_Grupo_4 
{

static int factura=0;
static int opcion[]=new int[6];
    public static void main(String[] args) 
    {
   JOptionPane.showMessageDialog(null,"Bienvenido al taller");
   Frenos f1=new Frenos();
   
   aceites a1=new aceites();
   Llantas l1=new Llantas();
   Repuesto r1=new Repuesto();
   Pintura p1=new Pintura();
   Escaneo e1=new Escaneo();
   Mecanica_General m1=new Mecanica_General();
   Satisfaccion_clientes s1=new Satisfaccion_clientes();
   JOptionPane.showMessageDialog(null,"Servicios: 0:Frenos,1:Aceites,2:Llantas,3:Repuesto,4:Pintura,5:Escaneo,6:Mecanica General");
   for(int i=0;i<opcion.length;i++){
   opcion[i]=Integer.parseInt(JOptionPane.showInputDialog("Si requiere el servicio numero: "+i+" escriba 1, sino escriba 2"));    
   JOptionPane.showMessageDialog(null,"Servicios: 0:Frenos,1:Aceites,2:Llantas,3:Repuesto,4:Pintura,5:Escaneo,6:Mecanica General");
   }
   if (opcion[0]==1){
  JOptionPane.showMessageDialog(null,"seccion de frenos");
  
  Frenos f2=new Frenos();   
  f2.setZapato_frenos(0);
  f2.setMarca("");
  f2.setCalibre(0);
  f2.setLiquido("");
  factura=f2.getPrecio();
    JOptionPane.showMessageDialog(null,f2.toString());
    JOptionPane.showMessageDialog(null,"Subtotal: "+factura);
    
   }
   if(opcion[1]==1){
  JOptionPane.showMessageDialog(null,"seccion de aceites");
  aceites a2=new aceites();
  a2.setMarca(0);
  a2.setTipo("");
  a2.setCombustible(0);
  a2.setRango(0);
  factura=factura+a2.getPrecio();
  JOptionPane.showMessageDialog(null,a2.toString());
  JOptionPane.showMessageDialog(null,"Subtotal: "+factura); 
   }
   if(opcion[2]==1){
 JOptionPane.showMessageDialog(null,"seccion de Llantas"); 
Llantas l2=new Llantas();
l2.setMarca("");
l2.setGrosor("");
l2.setTipo_tacos("");
l2.setTamano(0);
l2.setCantidad(0);
factura=factura+l2.getPrecio();
JOptionPane.showMessageDialog(null,l2.toString());
 JOptionPane.showMessageDialog(null,"Subtotal: "+factura); 
   }
if (opcion[3]==1){
    JOptionPane.showMessageDialog(null,"seccion de Repuestos"); 
  Repuesto r2=new Repuesto();  
  r2.setMarca("");
  r2.setTipo(0);
  r2.setModelo("");
  r2.setRango(0);
  r2.setCantidad(0);
  factura=factura+r2.getPrecio();
  JOptionPane.showMessageDialog(null,r2.toString());
  JOptionPane.showMessageDialog(null,"Subtotal: "+factura); 
   }
if (opcion[4]==1){
   JOptionPane.showMessageDialog(null,"seccion de Pinturas"); 
   Pintura p2=new Pintura();
   p2.setColor("");
   p2.setBrillo("");
   p2.setOpacidad("");
   p2.setTextura("");
   factura=factura+p2.getPrecio();
   JOptionPane.showMessageDialog(null,p2.toString());
  JOptionPane.showMessageDialog(null,"Subtotal: "+factura); 
}
if (opcion[5]==1){
JOptionPane.showMessageDialog(null,"seccion de Escaneo");
 Escaneo e2=new Escaneo();
 e2.setGeneral(0);
 e2.setEspecifico(0);
  factura=factura+e2.getPrecio();
 JOptionPane.showMessageDialog(null,e2.toString());
  JOptionPane.showMessageDialog(null,"Subtotal: "+factura);  
 }
if (opcion[5]==1){
JOptionPane.showMessageDialog(null,"seccion de Mecanica General");
Mecanica_General m2=new Mecanica_General();
m2.setCabezote(0);
m2.setPistones(0);
m2.setValvulas(0);
m2.setRadiador(0);
factura=factura+m2.getPrecio();
 JOptionPane.showMessageDialog(null,m2.toString());
  JOptionPane.showMessageDialog(null,"Subtotal: "+factura);  
}
Satisfaccion_clientes s2=new Satisfaccion_clientes();
s2.setNivel_satisfaccion(0);
s2.setObservaciones("");
s2.setRecomendaciones("");
JOptionPane.showMessageDialog(null,"El total de su compra es de: "+factura+" colones"); 
JOptionPane.showMessageDialog(null,"gracias por su visita!"); 
}
}
