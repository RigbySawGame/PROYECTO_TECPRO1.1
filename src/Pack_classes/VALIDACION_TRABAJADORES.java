package Pack_classes;

import Pack_forms.INICIO_SESION_TRABAJADORES;
import Pack_forms.INICIO_SESION_ADMIN_SUB;
import Pack_forms.Registro_de_pelicula_Trabajador;
import Pack_forms.frmAlimentosyBebidas;
import Pack_forms.frmCartelera;
import javax.swing.JOptionPane;

public class VALIDACION_TRABAJADORES {

    INICIO_SESION_TRABAJADORES login = new INICIO_SESION_TRABAJADORES();
    
    String respuesta;
    
    public void ValidadUsuario(String usuarios[], String user, String pass, int NumIntentos, String cargo){
        
        boolean encontrado = false;
        
        for(int i=0; i < usuarios.length; i++){
            if(usuarios[i].equalsIgnoreCase(user) && usuarios[i+1].equals(pass)){
                respuesta = "Bienvenido " + user; 
                encontrado = true;
                JOptionPane.showMessageDialog(null, respuesta, "Inicio de Sesion", JOptionPane.INFORMATION_MESSAGE);
                NumIntentos=0;
                login.setNumIntentos(NumIntentos);
                
                //dirigiendo a otro formulario
                if(cargo.equalsIgnoreCase("Boleteria")){
                    new Registro_de_pelicula_Trabajador().setVisible(true);
                    break;
                }if(cargo.equalsIgnoreCase("Confiteria")){
                    new frmAlimentosyBebidas().setVisible(true);
                    break;
                }if(cargo.equalsIgnoreCase("Administrativa")){
                    new INICIO_SESION_ADMIN_SUB().setVisible(true);
                    break;
                }
                
                
            }
        }
        
        if(encontrado==false){
            respuesta="Clave y/o Usuario incorrecto. Van " + NumIntentos + " intentos";
            JOptionPane.showMessageDialog(null, respuesta, "Inicio de Sesion", JOptionPane.ERROR_MESSAGE);
        }
        
        if(NumIntentos > 2){
            JOptionPane.showMessageDialog(null, "3 Intentos Fallidos, esto se cerrara", "Inicio de Sesion", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        
    }
    
}
