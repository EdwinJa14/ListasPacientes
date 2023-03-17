/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelos.ListaPacientesOModell;
import Modelos.ListasPacientesMModell;
import Modelos.Pacientes;
import Vistas.frmIngresarPacientes;
import Vistas.frmPacientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;

 public class Controlador implements ActionListener {
frmIngresarPacientes VistaPacientes;
frmPacientes VistaLista;
ListaPacientesOModell ModeloP1;
ListasPacientesMModell ModeloP2;


    public Controlador(frmIngresarPacientes VistaPacientes, frmPacientes VistaLista,ListaPacientesOModell ModeloP1,
            ListasPacientesMModell ModeloP2) {
        this.VistaPacientes = VistaPacientes;
        this.VistaLista = VistaLista;
        this.ModeloP2 = ModeloP2;
        this.ModeloP1=ModeloP1;
        
        //poner a la escucha los botones
        this.VistaPacientes.btnAsignarM.addActionListener(this);
        this.VistaPacientes.btnAsignarO.addActionListener(this);
        this.VistaPacientes.btnVerPacientes.addActionListener(this);
         this.VistaLista.btnAtenderM.addActionListener(this);
        this.VistaLista.btnAtenderO.addActionListener(this);
        
        //Levantar formulario
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPacientes.btnAsignarM)
        {
            this.ModeloP1.EncolarPacientes1(this.VistaPacientes.txtApellidos.getText(),this.VistaPacientes.txtNombre.getText(),
                    this.VistaPacientes.txtEdad.getText());
            Queue<Pacientes>listaLocal = this.ModeloP1.ListarPacientes();
            String Cadena = "";
            for(Pacientes MiListaPacientes: listaLocal)
            {
                Cadena = Cadena + MiListaPacientes.getApellidos()+" "+MiListaPacientes.getNombre()+" "+MiListaPacientes.getEdad()+"\n";
            }
            
            this.VistaLista.txtListaMendez.setText(Cadena);
            this.VistaPacientes.txtApellidos.setText("");
            this.VistaPacientes.txtNombre.setText("");
            this.VistaPacientes.txtEdad.setText(""); 
            
        }
        
         if(e.getSource()==this.VistaPacientes.btnAsignarO)
        {
            this.ModeloP2.EncolarPacientes1(this.VistaPacientes.txtApellidos.getText(),this.VistaPacientes.txtNombre.getText(),
                    this.VistaPacientes.txtEdad.getText());
            Queue<Pacientes>listaLocal = this.ModeloP2.ListarPacientes();
            String Cadena = "";
            for(Pacientes MiListaPacientes: listaLocal)
            {
                Cadena = Cadena + MiListaPacientes.getApellidos()+" "+MiListaPacientes.getNombre()+" "+MiListaPacientes.getEdad()+"\n";
            }
            
            this.VistaLista.txtListaMendez.setText(Cadena);
            this.VistaPacientes.txtApellidos.setText("");
            this.VistaPacientes.txtNombre.setText("");
            this.VistaPacientes.txtEdad.setText(""); 
            
        }
         
         
        if(e.getSource()==this.VistaPacientes.btnVerPacientes)
        {
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
           
        }
        
        if(e.getSource()==this.VistaLista.btnAtenderM)
        {
          
        }
         if(e.getSource()==this.VistaLista.btnAtenderO)
        {
          
        }
    }
    
}

