package javaapplication1;

import java.io.*;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.*;
import static java.util.Collections.list;

public class Shell {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		Model model = null;
		try {
                    
             /*        String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
                    Connection con = DriverManager.getConnection(url, "usuario","contraseña");
                    Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                      ResultSet.CONCUR_READ_ONLY);
               */     
                    
                    /*    model = new Model();
			model.setJdbcDriver("sun.jdbc.odbc.JdbcOdbcDriver");
			model.setDatabaseURL("jdbc:odbc:con");
			model.connect();

			System.out.println("OK2 ");
			*/
			model = new Model();
                        
			model.setJdbcDriver("org.postgresql.Driver");
                        model.setDatabaseURL("jdbc:postgresql://localhost:5432/Virra");			
			model.connect();
                    
                        if(model.isConnect())                        {
			   System.out.println("Conectado...");
                           List est = new LinkedList();
                           est =  model.listEstudiantes();
                           
                            for (int i = 0; i < est.size(); i++) {
                           
                                Estudiante e = (Estudiante)est.get(i);
                                System.out.println(e.getCodigo()+"  "+e.getNombre()+" "+e.getApelllido()+" "+e.getIdentificacion()+" "+e.getPrograma());
                            }

                           
//                        Estudiante est = new Estudiante();
//                        est.setCodigo("12352");
//                        est.setNombre("Mario");
//                        est.setApelllido("Corpas");
//                        est.setPrograma("123");
//                        
//                        model.guardarEstudiante(est);
                }
                        else{
                            System.out.println("No se pudo Conectar..");
                        }
                       
                        
                        model.disconnect();

			/*try {

				System.out.println("00...");
				Iterator it = model.getConsultaDocentes("Ra",2005,2).iterator();
				System.out.println("0...");
				while(it.hasNext()){
					System.out.println("1...");
					Docente d = (Docente)it.next();
					System.out.println("3...");
					System.out.println("Codigo "+d.getCodigo_Docente()+"Nombre"+d.getNombre());
				}
			} catch (Exception e) {
				System.err.println("Error:  " + e);
			}*/
		} catch (Exception e) {
			System.err.println("aqui"+e);
		} finally {
			model.disconnect();
		}
	}
}