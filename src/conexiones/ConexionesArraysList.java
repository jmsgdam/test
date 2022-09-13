
package conexiones;

import clases.Usuario;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ConexionesArraysList {
    
    public static void añadirUsuarioAlArraylist(JTextField usuario,JTextField contrasenia){
        
        int id = clases.Usuario.contadorID;
        
        String nombre = usuario.getText();
        String pass = contrasenia.getText();
        
        clases.Almacen.listaUsuario.add(new Usuario(nombre, pass, id));
        System.out.println("El usuario: " + nombre + " ha sido creado con la contraseña: " + pass);
        
        usuario.setText("");
        contrasenia.setText("");
        
        System.out.println("******Listado de Usuarios almacenados******");
        
        Usuario.contadorID++;
        
        for(Usuario u:clases.Almacen.listaUsuario){
            
            System.out.println(u.toString());
            
        }//fin for        
        
    }//fin método añadirUsuarioAlArraylist
    
    
    public static void cargarUltimaID_usuario(){
                        
        int ultimaID = clases.Almacen.listaUsuario.size();
            
        clases.Usuario.contadorID = ultimaID;
        
    }//fin método obtenerUltimaID_usuario
    
    public static void comprobarContrasenia(String usuario, String contrasenia){
        
        for(Usuario u:clases.Almacen.listaUsuario){
            
            if(u.getNombre().equals(usuario)){
                
                if(u.getPass().equals(contrasenia)){
                    
                    JOptionPane.showMessageDialog(null, "Contraseña correcta. Entramos en el siguiente nivel.");
                    
                }//fin if
                else{
                    
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta. El dispositivo se autodestruirá en 3...2...1...bye.");
                    
                    System.exit(0);
                }//fin else
                
                
            }//fin if

            
        }//fin for
        
    }//fin método comprobarContrasenia
    
}//fin clase ConexionesArrayList
