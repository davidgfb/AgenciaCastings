/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.candidato.Candidato;

/**
 *
 * @author David
 */
public class Perfil {
    String codigoPerfil = "",
            provincia = "",
            sexo = "",
            rangoAltura = "",
            rangoEdad = "",
            colorPelo = "",
            colorOjos = "";
    Trabajador especialidad; //modelo o actor
    boolean experiencia = false;
    Candidato tipoCandidato; //CandidatoAdulto o CandidatoNiño
}
