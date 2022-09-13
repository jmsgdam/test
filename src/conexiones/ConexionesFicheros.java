/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexiones;

import clases.Usuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author chema
 */
public class ConexionesFicheros {
    
    public static void leerArchivoUsuarios(){
        
        try{
            
            clases.Almacen.listaUsuario.clear();
            
            ObjectInputStream leyendoFichero = new ObjectInputStream(new FileInputStream("BD_usuarios.dat"));
            
            clases.Almacen.listaUsuario = (ArrayList<Usuario>) leyendoFichero.readObject();
            leyendoFichero.close();
            
            
        } catch (FileNotFoundException e) {
            System.out.println("No encuentra el archivo");
        } catch (IOException e) {
            System.out.println("No hay conexión con el archivo");
        } catch (ClassNotFoundException e) {
            System.out.println("Error en el archivo");
        }        
        
    }//fin leerArchivoUsuarios
    
    
    public static void escribirArchivoUsuarios(){
        
        try{
            
            ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("BD_usuarios.dat"));
            
            escribiendoFichero.writeObject(clases.Almacen.listaUsuario);
            escribiendoFichero.close();
            
            JOptionPane.showMessageDialog(null, "Los datos han sido guardados correctamente. Saliendo del programa.");
            
        }catch (FileNotFoundException e){
            
            JOptionPane.showMessageDialog(null, "No se encuentra el archivo.");
            
        }catch (IOException e){
            
            JOptionPane.showMessageDialog(null, "No hay conexión con el archivo.");
            
        }//fin catch
        
             
        
    }//fin escribirArchivoUsuarios
    
}//fin clase ConexionesFicheros
