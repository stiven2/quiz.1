
package inventario;
import java.util.Scanner;

public class Inventario {

   
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //se crea un array de objetos de la clase producto   
        producto p[] = new producto[50];
        for(int i=0; i<p.length; i++) {
            p[i] = new producto();
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
            System.out.println(p[i]);
            String name = p[i].getNombre();
            int cant = p[i].getCantidad();
            float price = p[i].getPrecio();
            int vend = p[i].getVendido();
            }
                
               break;
         case 2:  
           for (int i =0; i<p.length; i++){
           System.out.println(p[i]);
           
            
            
            
            
            }
                 
                
                
                break;
          case 3:  
            for (int i =0; i<p.length; i++){
            System.out.println(p[i]);
            }
                break;
          case 4:
              
                for (int i =0; i<p.length; i++){
                System.out.println(p[i]);
           
            }
                
                break;
              
          default: System.out.println("Opción invalida");
        }
        
        
        
        } while(opcion!=7);
  
        
        
        
        
        
        
    }
    
}
