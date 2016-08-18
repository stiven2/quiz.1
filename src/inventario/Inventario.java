
package inventario;
import java.util.Scanner;

public class Inventario {

   
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //se crea un array de objetos de la clase producto   
        producto p[] = new producto[50];
        for(int i=0; i<p.length; i++) {
            p[i] = new producto();
            p[i].productonuevo();
        }
        
        int opcion = 7;
        do {
        
        System.out.println("Digite la opción deseada");
        System.out.println("1. Agregar producto");
        System.out.println("2. Buscar producto ");
        System.out.println("3. Eliminar producto");
        System.out.println("4. Mostrar inventario");
        System.out.println("5. Realizar venta");
        System.out.println("6. Mostrar ganancias");
        System.out.println("7. salir");
        opcion = lector.nextInt();
            
       switch (opcion){
           
          case 1: 
            for (int i =0; i<p.length; i++){
           String x = " ";//compara el arreglo y donde hay un espacio ubica el nuevo prodcuto
           if (x.equals(p[i].getNombre())){
               System.out.println("Nuevo producto");
               p[i].ingresar();
               i = p.length;
           
           
           }
            }
                
               break;
         case 2: 
             
            System.out.println("Ingrese el nombre del producto a buscar");
            String o = lector.next();
           for (int i =0; i<p.length; i++){
               
            
           if (o.equals(p[i].getNombre())){
               System.out.println("Nombre del prodcuto:" +p[i].getNombre());
               System.out.println("Cantidad:"+p[i].getCantidad());
               System.out.println("precio:"+p[i].getPrecio());
               
             }
           if (i==p.length-1){
               System.out.println("no se encuentra");
           }    
            
   }
                 
                
    break;
          case 3: 
              
              System.out.println("nombre a borrar");
              String x = lector.next();
              
            for (int i =0; i<p.length; i++){
            if (i==p.length-1){
                System.out.println("no se encuentra");
            }
            if (x.equals(p[i].getNombre())){
            p[i].productonuevo();
            i=p.length;
            }
            
            }
                break;
          case 4:
              System.out.println("mostrar inventario");
                for (int i =0; i<p.length; i++){
                System.out.println(p[i]);
           
            }
                
                break;
              
          default: System.out.println("Opción invalida");
        }
        
        
        
        } while(opcion!=7);
  
        
        
        
        
        
        
    }
    
}
