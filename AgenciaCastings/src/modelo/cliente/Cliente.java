/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.cliente;

import modelo.actividad.Actividad;

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
}
