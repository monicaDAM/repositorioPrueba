/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author DAM17
 */
public class Empresa {
    private ArrayList<Empleado> misEmpleados;

    public Empresa() {
        misEmpleados=new ArrayList<>(); // instanciar
        Empleado e=new Empleado(1,"maria", "pardo","maria pardo", 1);
        misEmpleados.add(e); // añado el primer elemento de tipo Empleado
        //Empleado e1=new Empleado(0,"luis", "delgado","Luis Delgado", 0);
        //misEmpleados.add(e1); // añado otro elemento de tipo Empleado, si quiero
    }
    
    public int buscarEmpleado(String login, String contra){
        // devuelve posicion o -1 si no
        int pos=0;
        boolean encontrado=false;
        while(!encontrado&&pos<misEmpleados.size()){
            if(misEmpleados.get(pos).getLogin().equalsIgnoreCase(login)&&misEmpleados.get(pos).getPass().equals(contra))
                encontrado=true;
            else
                pos++;
        }
        if(!encontrado)
            pos=-1;
        return pos;
    }
    public void anadir(Empleado e){
        misEmpleados.add(e);
    }

    public ArrayList<Empleado> getMisEmpleados() {
        return misEmpleados;
    }
    /**
     * Necesitamos un método para buscar que el login no esté ya cogido
     * @param login
     * @return 
     */
    public int buscarLogin (String login){
        boolean encontrado=false;
        int pos=0;
        while (!encontrado&&pos>misEmpleados.size()){
             if(misEmpleados.get(pos).getLogin().equalsIgnoreCase(login)){
                 encontrado=true;
             }else{
                 pos++;
             }                  
        }
        if(!encontrado)
            pos=-1;
        return pos;
    }
    //Buscamos que el login y la contraseña no estén siendo usados
    public int buscarLoginContra (String login, String password){
        boolean encontrado=false;
        int pos=0;
        while (!encontrado&&pos>misEmpleados.size()){
             if(misEmpleados.get(pos).getLogin().equalsIgnoreCase(login)&& 
                     misEmpleados.get(pos).getPass().equals(password)){
                 encontrado=true;
             }else{
                 pos++;
             }                  
        }
        if(!encontrado)
            pos=-1;
        return pos;
    }
    //Buscamos el identificador para ver si no está ya siendo utilizado
    public int buscarIdentificador (int identificador){
        boolean encontrado=false;
        int pos=0;
        while (!encontrado&&pos>misEmpleados.size()){
             if(misEmpleados.get(pos).getIdentificador()==identificador){
                 encontrado=true;
             }else{
                 pos++;
             }                  
        }
        if(!encontrado)
            pos=-1;
        return pos;
    }
}
