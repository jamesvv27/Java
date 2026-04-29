package domain.model;

import domain.enums.LineaProduccion;

public class SistemaAudio extends Producto
{

    private final int numeroMaxBocinas;
    private final int numeroMaxSBuffers;

    public SistemaAudio(int numeroMaxBocinas, int numeroMaxSBuffers, String numeroSerie, String sku, String modelo, LineaProduccion lineaProduccion)
    {
        super(numeroSerie, sku, modelo, lineaProduccion);
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
