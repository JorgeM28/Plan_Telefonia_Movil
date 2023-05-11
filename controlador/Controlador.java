package controlador;

import modelo.PlanTelefonia;
import vista.PanelEntradaDatos;
import vista.PanelResultados;
import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
    private PlanTelefonia miPlanTelefonia;
    private PanelEntradaDatos pPanelEntradaDatos;
    private PanelResultados panelResultados;

    //------------------
    //Metodos
    //------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin,PanelEntradaDatos pPanelEntradaDatos)
    {
        this.venPrin = pVenPrin;
        this.pPanelEntradaDatos = pPanelEntradaDatos;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Calcular costo plan
        if(comando.equals("costo"))
        {
            int numeroCelular = Integer.parseInt(venPrin.miPanelEntradaDatos.getTxtNumeroCelular());
            String operador = venPrin.miPanelEntradaDatos.getTxtOperadores();
            int cantidadMinuto = Integer.parseInt(venPrin.miPanelEntradaDatos.getTxtCantidadMinuto());
            double valorMinuto = Double.parseDouble(venPrin.miPanelEntradaDatos.getTxtValorMinuto());


            miPlanTelefonia = new PlanTelefonia(numeroCelular, operador, cantidadMinuto, valorMinuto);
            
            double costoPlan = miPlanTelefonia.calcularCostoPlan();

            venPrin.miPanelResultados.mostrarResultado("Se ha calculado un nuevo plan telefonico"+"\n Numero celular: "+numeroCelular+"\n Operador: "+operador+"\n Cantidad de minutos: "+cantidadMinuto+"\n Valor minuto: "+valorMinuto+"\n Costo plan: "+costoPlan);

        }

        //Eliminar datos
        if(comando.equals("eliminar"))
        {
            pPanelEntradaDatos.setTxtNumeroCelular("");
            pPanelEntradaDatos.setTxtOperadores("");
            pPanelEntradaDatos.setTxtCantidadMinuto("");
            pPanelEntradaDatos.setTxtValorMinuto("");
            pPanelEntradaDatos.setTxtCostoPlan("");
            venPrin.miPanelResultados.borrar();
        }

        if(comando.equals("salir"))
        {
            System.exit(0);
        }  

        


    }
}