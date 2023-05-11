package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbOperadores;
    private JComboBox<String> cbOperadores;

    private JLabel lbNumeroCelular;
    private JTextField tfNumeroCelular;
    private JLabel lbCantidadMinuto;
    private JTextField tfCantidadMinuto;
    private JLabel lbvalorMinuto;
    private JTextField tfvalorMinuto;
    private JLabel lbCostoPlan;
    private JTextField tfCostoPlan;

    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar etiqueta Operadores
        lbOperadores = new JLabel("Operadores : ", JLabel.RIGHT);
        lbOperadores.setBounds(20,20,100,20);
        this.add(lbOperadores);

        //Crear y agregar combo lista operadores (claro, movistar, tigo, Wom)
        cbOperadores = new JComboBox<String>();
        cbOperadores.setBounds(150,20,100,20);
        cbOperadores.addItem("Claro");
        cbOperadores.addItem("Movistar");
        cbOperadores.addItem("Tigo");
        cbOperadores.addItem("Wom");
        this.add(cbOperadores);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLACK);
        this.setBorder(borde);

        //Crear y agregar elementos
        lbNumeroCelular = new JLabel("Numero de celular: ");
        lbNumeroCelular.setBounds(20,55,140,20);
        this.add(lbNumeroCelular);

        tfNumeroCelular = new JTextField();
        tfNumeroCelular.setBounds(150,55,100, 25);
        this.add(tfNumeroCelular);

        lbCantidadMinuto = new JLabel("Cantidad de minutos: ");
        lbCantidadMinuto.setBounds(20, 85, 140, 20);
        this.add(lbCantidadMinuto);

        tfCantidadMinuto = new JTextField();
        tfCantidadMinuto.setBounds(150, 85, 100, 25);
        this.add(tfCantidadMinuto);

        lbvalorMinuto = new JLabel("Valor del minuto: ");
        lbvalorMinuto.setBounds(20, 120, 140, 20);
        this.add(lbvalorMinuto);

        tfvalorMinuto = new JTextField();
        tfvalorMinuto.setBounds(150, 120, 100, 25);
        this.add(tfvalorMinuto);

    }

    //Metodos de acceso

    public String getTxtOperadores()
    {
        return (String) cbOperadores.getSelectedItem();
    }

    public void setTxtOperadores(String sal)
    {
        cbOperadores.addItem(sal);
    }

    public void setIndexOperadores(int index)
    {
        cbOperadores.setSelectedIndex(index);
    }

    public String getTxtNumeroCelular()
    {
        return tfNumeroCelular.getText();
    }

    public void setTxtNumeroCelular(String numeroCelular)
    {
        tfNumeroCelular.setText(numeroCelular);
    }

    public String getTxtCantidadMinuto()
    {
        return tfCantidadMinuto.getText();
    }

    public void setTxtCantidadMinuto(String cantidadMinuto)
    {
        tfCantidadMinuto.setText(cantidadMinuto);
    }

    public String getTxtValorMinuto()
    {
        return tfvalorMinuto.getText();
    }

    public void setTxtValorMinuto(String valorMinuto)
    {
        tfvalorMinuto.setText(valorMinuto);
    }

    public String getTxtCostoPlan()
    {
        return tfCostoPlan.getText();
    }

    public void setTxtCostoPlan(String costoPlan)
    {
        tfCostoPlan.setText(costoPlan);
    }

}
