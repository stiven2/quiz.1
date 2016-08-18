
package inventario;
import java.util.Scanner;

public class producto {
     private Scanner lector;
     private String nombre;//Indica el nombre del producto
     private int cantidad;//Indica la cantidad de productos
     private float precio;//Indica el precio de venta
     private int vendido;//Indica las cantidades vendidas
     
     //Setters
     
    public void productonuevo(){
    
    nombre = " ";
    cantidad = 0;
    precio = 0;
    vendido = 0;
    
    } 
     
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setVendido(int vendido) {
        this.vendido = vendido;
    }
    
//Getters
    
    public String getNombre() {
        return nombre;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public int getVendido() {
        return vendido;
    }

    public void ingresar(){
    lector = new Scanner(System.in);
    System.out.println(" Ingrese el nombre");
    nombre = lector.next();       
    System.out.println(" Ingrese la cantidad ");   
    cantidad = lector.nextInt();
    System.out.println(" Ingrese el precio ");   
    precio = lector.nextFloat();
    
    }
    
    public void mostrar_producto(){
        
        System.out.println("Nombre:\n "+getNombre());
        System.out.println("Nombre:\n "+getCantidad());
        System.out.println("Nombre:\n "+getPrecio());
                
        
    }
    
   
    
    
}

