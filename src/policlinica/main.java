/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package policlinica;

import Controlador.Controlador;
import Modelos.ListaPacientesOModell;
import Modelos.ListasPacientesMModell;
import Vistas.frmIngresarPacientes;

/**
 *
 * @author umg
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        frmIngresarPacientes VistaIngresarP=new frmIngresarPacientes(null,true);
        frmPacientes VistaPacientes=new frmPacientes();
        ListaPacientesOModell ModeloPO=new ListaPacientesOModell();
        ListasPacientesMModell ModeloPM=new  ListasPacientesMModell();
        Controlador  Controller=new Controlador(VistaIngresarP,VistaPacientes,ModeloPO,ModeloPM) ;
    }
    
}
