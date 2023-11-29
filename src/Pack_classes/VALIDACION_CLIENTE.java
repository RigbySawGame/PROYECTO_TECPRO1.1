package Pack_classes;

import Pack_forms.frmUbicacion;
import Pack_forms.INICIO_SESION_CLIENTE;
import javax.swing.JOptionPane;


public class VALIDACION_CLIENTE {

    INICIO_SESION_CLIENTE login = new INICIO_SESION_CLIENTE();
    
    String respuesta;
    
    public void ValidadUsuario(String usuarios[], String user, String pass, int NumIntentos){
        
        boolean encontrado = false;
        
        for(int i=0; i < usuarios.length; i++){
            if(usuarios[i].equalsIgnoreCase(user) && usuarios[i+1].equals(pass)){
                respuesta = "Bienvenido " + user; 
                encontrado = true;
                JOptionPane.showMessageDialog(null, respuesta, "Inicio de Sesion", JOptionPane.INFORMATION_MESSAGE);
                NumIntentos=0;
                login.setNumIntentos(NumIntentos);
                
                //dirigiendo a otro formulario
                
                new frmUbicacion().setVisible(true);
                break;
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
