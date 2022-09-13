
package modelo;

import clases.Usuario;


public class Principal {


    public static void main(String[] args) {
        
        
        clases.Almacen.listaUsuario.add(new Usuario("Chema", "123456",1));
        clases.Almacen.listaUsuario.add(new Usuario("Paula", "654321",2));

        
        
        for(Usuario u:clases.Almacen.listaUsuario){
            
            System.out.println(u.toString());
            
        }//fin for
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
