/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Clases.Usuarios;

/**
 *
 * @author Administrador
 */
public interface SistemaImplements {
    public void LoginIntento(Usuarios usuarios);
    public void RegistroUsuarios(Usuarios usuarios);
    public void BloquearUsuario(Usuarios usuarios);
    public void EditarUsuario(Usuarios usuarios);
    public void CambiaClave(Usuarios usuarios);
}
