/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author umg
 */
public class ListasPacientesMModell {
    
    Queue<Pacientes> ListaPacientes1=new LinkedList();
    public void EncolarPacientes2(String Apellidos,String Nombre,String Edad){
        Pacientes nuevoPaciente=new  Pacientes(Apellidos, Nombre, Edad);
        this.ListaPacientes1.add(nuevoPaciente);
        JOptionPane.showMessageDialog(null,"Usted  Ha Sido  Registrodo Y Asignado a Mendez");
        
    }
    
    public Queue ListarPacientes(){
        return this.ListaPacientes1;
    }
    public void DesEncolar(){
       // this.ListaPacientes1.poll();
    }
}
