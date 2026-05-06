package domain.model;

import domain.enums.LineaProduccion;

public class SistemaAudio extends Producto
{

    private final int numeroMaxBocinas;
    private final int numeroMaxSBuffers;

    public SistemaAudio(double precioBase, int numeroMaxBocinas,
            int numeroMaxSBuffers, String numeroSerie, String sku,
            String modelo, LineaProduccion lineaProduccion)
    {
        super(precioBase, numeroSerie, sku, modelo, lineaProduccion);
        this.numeroMaxBocinas = numeroMaxBocinas;
        this.numeroMaxSBuffers = numeroMaxSBuffers;
    }

    public int getNumeroMaxBocinas()
    {
        return numeroMaxBocinas;
    }

    public int getNumeroMaxSBuffers()
    {
        return numeroMaxSBuffers;
    }

    @Override
    public void realizarPruebaCalidad()
    {
        System.out.println("Realizando prueba de calidad del SistemaAudio");
    }

    @Override
    public int calcularGarantia()
    {
        if(getPrecioBase() > 1000){
            return 32;
        }
        return 12;
    }
    
}
