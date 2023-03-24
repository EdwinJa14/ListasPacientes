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
import javax.swing.JOptionPane;

 public class Controlador implements ActionListener {
frmIngresarPacientes VistaPacientes;
frmPacientes VistaLista;
ListaPacientesOModell ModeloP2;
ListasPacientesMModell ModeloP1;


    public Controlador(frmIngresarPacientes VistaPacientes, frmPacientes VistaLista,ListaPacientesOModell ModeloP2,
            ListasPacientesMModell ModeloP1) {
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
        this.VistaPacientes.setLocationRelativeTo(null);
        this.VistaPacientes.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPacientes.btnAsignarO)
        {
            this.ModeloP1.EncolarPacientes1(this.VistaPacientes.txtApellidos.getText(),this.VistaPacientes.txtNombre.getText(),
                    this.VistaPacientes.txtEdad.getText());
            Queue<Pacientes>listaLocal = this.ModeloP1.ListarPacientes();
            String Cadena = "";
            for(Pacientes MiListaPacientes: listaLocal)
            {
                Cadena = Cadena + MiListaPacientes.getApellidos()+" "+MiListaPacientes.getNombre()+" "+MiListaPacientes.getEdad()+"\n";
            }
            
            this.VistaLista.txtListaOto.setText(Cadena);
           this.VistaPacientes.txtApellidos.setText("");
            this.VistaPacientes.txtNombre.setText("");
            this.VistaPacientes.txtEdad.setText(""); 
                    JOptionPane.showMessageDialog(null,"Usted  Ha Sido  Registrodo Y Asignado a Dr Oto");

        }
        
         if(e.getSource()==this.VistaPacientes.btnAsignarM)
        {
            this.ModeloP2.EncolarPacientes2(this.VistaPacientes.txtApellidos.getText(),this.VistaPacientes.txtNombre.getText(),
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
                    JOptionPane.showMessageDialog(null,"Usted  Ha Sido  Registrodo Y Asignado a Mendez");

        }
         
         
        if(e.getSource()==this.VistaPacientes.btnVerPacientes)
        {
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
           
        }
        
        if(e.getSource()==this.VistaLista.btnAtenderM)
        {
             
                this.ModeloP1.DesEncolar();
                this.ModeloP1.EncolarPacientes1(this.VistaPacientes.txtApellidos.getText(),
                        this.VistaPacientes.txtNombre.getText(),this.VistaPacientes.txtEdad.getText());
                Queue <Pacientes> listaLocal = this.ModeloP1.ListarPacientes();
                String Cadena="";
                for(Pacientes MiListaCliente: listaLocal){
                    Cadena=Cadena+MiListaCliente.getApellidos()+" "+MiListaCliente.getNombre()+"\n";
               }
                this.VistaLista.txtListaMendez.setText(Cadena);
                JOptionPane.showMessageDialog(null, "Cliente Atendido");
          
        }
         if(e.getSource()==this.VistaLista.btnAtenderO)
        {
          
                this.ModeloP2.DesEncolar();
                this.ModeloP2.EncolarPacientes2(this.VistaPacientes.txtApellidos.getText(),
                        this.VistaPacientes.txtNombre.getText(),this.VistaPacientes.txtEdad.getText());
                Queue <Pacientes> listaLocal = this.ModeloP2.ListarPacientes();
                String Cadena="";
                for(Pacientes MiListaCliente: listaLocal){
                    Cadena=Cadena+MiListaCliente.getApellidos()+" "+MiListaCliente.getNombre()+"\n";
               }
                this.VistaLista.txtListaOto.setText(Cadena);
                JOptionPane.showMessageDialog(null, "Cliente Atendido");
        }
    }
    
}

