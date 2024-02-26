/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author DELL
 */
public class Calculadora {

    public static void main(String[] args) {
        Operaciones oper=new Operaciones();
        oper.leerNumeros();
        oper.sumar();
        oper.resta();
        oper.multiplicacion();
        oper.division();
        oper.modulo();
        oper.mostrarResultados();
    }
}
