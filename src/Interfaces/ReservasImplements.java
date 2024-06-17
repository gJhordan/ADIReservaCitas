/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Clases.Clientes;
import Clases.Reservas;

/**
 *
 * @author Administrador
 */
public interface ReservasImplements {
    public void AgregarReserva(Reservas reserva);
    public void EditarReserva(Reservas reserva);
    public void MostrarReservas(Reservas reserva);
    public void MostrarReservasCliente(Reservas reserva, Clientes cliente);
    public void MostrarReservasRecientes(Reservas reserva);
    public void EliminarReserva(Reservas reserva);
}
