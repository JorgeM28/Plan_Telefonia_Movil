package vista;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    // Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;

    
    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public VentanaPrincipal()
    {
        //Definición del layout de la ventana
        this.setLayout(null);

        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,370,190);
        this.add(miPanelEntradaDatos);
        miPanelEntradaDatos.setBackground(Color.decode("#ABDEE6"));

        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,210,370,150);
        this.add(miPanelOperaciones);
        miPanelOperaciones.setBackground(Color.decode("#ABDEE6"));

        //Creación y adición del PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,370,380,180);
        this.add(miPanelResultados);
        miPanelResultados.setBackground(Color.decode("#ABDEE6"));

        //Caracteristicas de la ventana
        this.setTitle("Calculadora de Planes de Telefonía");
        this.setSize(400,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }


}
