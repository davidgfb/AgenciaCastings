/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.cliente;

import modelo.Actor;
import modelo.Casting.Casting;
import modelo.Modelo;
import modelo.Perfil;
import modelo.actividad.Actividad;
import modelo.candidato.Candidato;
import modelo.trabajo.Trabajo;

/**
 *
 * @author David
 */
public class Cliente {
    String codigoCliente = "",
           nombre = "",
           direccion = "";
    int telefono = 0;
    PersonaContacto personaContacto;
    Actividad tipoActividad; //ActividadPublicidadCine o ActividadModa
    
    void contrata(Casting casting, double coste, int nPersonas, Perfil perfil) {
        
    }
    
    //<editor-fold defaultstate="collapsed" desc="selecciona">
    /*
    void selecciona(Actor actor, Trabajo trabajo) {
        
    }
    
    void selecciona(Modelo modelo, Trabajo trabajo) {
        
    }
    */
    
    void selecciona(Candidato candidato) {
        
    }
//</editor-fold>
    
}
