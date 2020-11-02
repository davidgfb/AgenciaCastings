/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.candidato;

import modelo.AgenciaCastings;
import modelo.Casting.Prueba;
import modelo.Casting.PruebaCastingPresencial;
import modelo.Perfil;

/**
 *
 * @author David
 */
public class Candidato {
    String codigo = "",
            nombre = "",
            direccion = "",
            fechaNacimiento = "";
    int telefonoContacto = 0;
    double dineroTotal = 0;
    Perfil perfil;
    Representante representante;
    boolean resultadoPrueba = false;
    
    /*
    void realiza(PruebaIndividual pruebaIndividual) {
        
    }
    */
    
    void realiza(Prueba prueba) {
        
    }

    void supera(PruebaCastingPresencial[] pruebasCastingPresencial) {
        
    }
    
    void paga(double coste, Prueba prueba, AgenciaCastings agenciaCastings) {
        
    }
}
