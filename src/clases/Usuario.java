
package clases;

import java.io.Serializable;


public class Usuario implements Serializable{
    
    private String nombre,pass;
    private int id;
    public static int contadorID = 1;

    public Usuario() {
    }

    public Usuario(String nombre, String pass,int id) {
        this.id = id;
        this.nombre = nombre;
        this.pass = pass;
    }//fin constructor
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    @Override
    public String toString() {
        return "Usuario nº " + id+"{" + "nombre=" + nombre + ", pass=" + pass + '}';
    }
    
    
    
    
    
}//fin clase Usuario
