
package pojo;


public class Activos {
   private String tipo;
   private String Vehiculo ;
   private String Maquinaria ;
   private String Mobiliario  ;
   private String Computo ;
   private double precio;

    public Activos() {
    }

    public Activos(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public Activos(String Vehiculo, String Maquinaria, String Mobiliario, String Computo, double precio) {
        this.Vehiculo = Vehiculo;
        this.Maquinaria = Maquinaria;
        this.Mobiliario = Mobiliario;
        this.Computo = Computo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Activos{" + "Vehiculo=" + Vehiculo + ", Maquinaria=" + Maquinaria + ", Mobiliario=" + Mobiliario + ", Computo=" + Computo + ", precio=" + precio + '}';
    }
   
           
}
