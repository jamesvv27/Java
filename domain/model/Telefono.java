package domain.model;

import domain.enums.LineaProduccion;
import domain.util.interfaces.Conectable;

public class Telefono extends Producto implements Conectable {
    
    private final String imei;
    private final int ramGB;
    private final int almacenamientoGB;
    
    public Telefono (double precioBase, String numeroSerie, String sku,
            String modelo,
            String imei, int ramGB, int almacenamientoGB){
        super(precioBase, numeroSerie, sku, modelo,
                LineaProduccion.TELEFONOS);
        this.imei = imei;
        this.ramGB = ramGB;
        this.almacenamientoGB = almacenamientoGB;
    }

    public String getImei()
    {
        return imei;
    }

    public int getRamGB()
    {
        return ramGB;
    }

    public int getAlmacenamientoGB()
    {
        return almacenamientoGB;
    }

    @Override
    public void realizarPruebaCalidad()
    {
        System.out.println("Realizando prueba de calidad");
    }

    @Override
    public int calcularGarantia()
    {
        if(getPrecioBase() > 500){
            return 24;
        }
        return 12;
    }

    @Override
    public void desconectarWifi()
    {
        System.out.println("Desconectando de wi-fi");
    }
    
    @Override
    public void conectarWifi()
    {
        System.out.println("Conectando a wi-fi");
    }
    
}
