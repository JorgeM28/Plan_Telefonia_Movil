package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelOperaciones extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btCalcularAgregarPlan;
    private JButton btSalir;
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JButton btEleminar;
;
    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/logo.jpeg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(200,25,150,116);
        add(lbImagen);

        //Crear y agregar boton Agregar plan
        btCalcularAgregarPlan = new JButton("Calcular Plan");
        btCalcularAgregarPlan.setBounds(10,20,150,20);
        btCalcularAgregarPlan.setActionCommand("costo");
        this.add(btCalcularAgregarPlan);

        //Crear y agregar boton Eleminar
        btEleminar = new JButton("Eliminar");
        btEleminar.setBounds(10,50,150,20);
        btEleminar.setActionCommand("eliminar");
        this.add(btEleminar);

        //Crear y agregar boton Salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(10,80,150,20);
        btSalir.setActionCommand("salir");
        this.add(btSalir);
    

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLACK);
        this.setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btCalcularAgregarPlan.addActionListener(pAL);
        btEleminar.addActionListener(pAL);
        btSalir.addActionListener(pAL);
  
    }


}
