package modelo;

import java.util.ArrayList;

public class PlanTelefonia
{
    //----------------------
    // Constantes
    //----------------------

    //----------------------
    // Atributos
    //----------------------
    private int numeroCelular;
    private String operador;
    private int cantidadMinuto;
    private double valorMinuto;
    private double costoPlan;


    //----------------------
    // Metodos
    //----------------------
    public PlanTelefonia(int pNumeroCelular, String pOperador, int pCantidadMinuto, double pValorMinuto)
    {
        numeroCelular = pNumeroCelular;
        operador = pOperador;
        cantidadMinuto = pCantidadMinuto;
        valorMinuto = pValorMinuto;
        costoPlan = 0;
    }


    
    public int getNumeroCelular()
    {
        return numeroCelular;
    }

    public String getOperador()
    {
        return operador;
    }

    public int getCantidadMinuto()
    {
        return cantidadMinuto;
    }

    public double getValorMinuto()
    {
        return valorMinuto;
    }

    public double getCostoPlan()
    {
        return costoPlan;
    }

    public void setNumeroCelular(int pNumeroCelular)
    {
        numeroCelular = pNumeroCelular;
    }

    public void setOperador(String pOperador)
    {
        operador = pOperador;
    }

    public void setCantidadMinuto(int pCantidadMinuto)
    {
        cantidadMinuto = pCantidadMinuto;
    }

    public void setValorMinuto(double pValorMinuto)
    {
        valorMinuto = pValorMinuto;
    }

    public void setCostoPlan(double pCostoPlan)
    {
        costoPlan = pCostoPlan;
    }



    //Calcular el costo del plan teniendo en cuenta que si el operador es "Wom" tiene un 50% de descuento, la cantidad de minutos y el valor del minuto, y guardar los datos del panel entrada de datos en la lista de planes incluyendo tambine el costo del plan
    public double calcularCostoPlan()
    {
        if(operador.equals("Wom"))
        {
            costoPlan = (cantidadMinuto * valorMinuto) * 0.5;
        }
        else
        {
            costoPlan = cantidadMinuto * valorMinuto;
        }
        return costoPlan;
    }


    

    

}