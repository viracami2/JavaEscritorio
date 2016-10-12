/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author estudiantes
 */
public class Clase_Tabla {
    
    
   JTable t;
    public void mostrarEstudios(JTable t,Estudiante servicios,int f ){
      ((DefaultTableModel)t.getModel()).setNumRows(f+1);
      ((DefaultTableModel)t.getModel()).setValueAt(servicios.getNombre(), f, 0);
      ((DefaultTableModel)t.getModel()).setValueAt(servicios.getApelllido(), f, 1);
       ((DefaultTableModel)t.getModel()).setValueAt(servicios.getCodigo(), f, 2);
      
       ((DefaultTableModel)t.getModel()).setValueAt(servicios.getIdentificacion(), f, 3);
       ((DefaultTableModel)t.getModel()).setValueAt(servicios.getPrograma(), f, 4);
       
     //  ((DefaultTableModel)t.getModel()).setValueAt(servicios.enviarfcomienzo(), f, 7);
       // ((DefaultTableModel)t.getModel()).setValueAt(servicios.enviarfnaci(), f, 8); 
    }

}
