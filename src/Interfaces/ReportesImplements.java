/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Clases.Reportes;

/**
 *
 * @author Administrador
 */
public interface ReportesImplements {
      public void ListarClientesFrecuentes(Reportes reportes);
      public void ListarIngresosporMes(Reportes reportes);
      public void ListarIngresosporAño(Reportes reportes);
      public void ListarIngresosporRecepcionista(Reportes reportes);
      public void ListarCantidadReservasAño(Reportes reportes);
      public void ListarCantidadReservasMes(Reportes reportes);
      public void ListarCantidadReservasSemana(Reportes reportes);
}
