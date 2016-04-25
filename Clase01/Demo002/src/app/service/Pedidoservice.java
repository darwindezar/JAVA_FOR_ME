/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.service;

/**
 *
 * @author Alumno
 */
public class Pedidoservice 
{
    public double CalcImpuesto(double importe)
    {
        return(importe*0.18);
    }
    public double CalcTotal(double importe)
    {
        return(importe+importe*0.18);
    }
}
