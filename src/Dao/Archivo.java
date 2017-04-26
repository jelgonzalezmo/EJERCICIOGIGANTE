/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import datos.Admon;
import datos.CasaSoftware;
import datos.Consultor;
import datos.Contrato;
import datos.Lider;
import datos.Programador;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Archivo implements CasaSofwareDB {

    private File archivo;

    public Archivo(File archivo) {
        this.archivo = new File("casaSofware.txt");
    }

    @Override
    public void escribir(CasaSoftware cs) throws FileNotFoundException {
        PrintStream salida = new PrintStream(archivo);
        ArrayList<Contrato> contratos = cs.getContratos();
        for (Contrato contrato : contratos) {
            if (contrato instanceof Consultor) {
                Consultor consultor = (Consultor) contrato;
                salida.print("C,");
                salida.print(consultor.getId() + (","));
                salida.print(consultor.getLabor() + (","));
            } else if (contrato instanceof Admon) {
                Admon admon = (Admon) contrato;
                salida.print("A,");
                salida.print(admon.getId() + ",");
                salida.print(admon.getNombre() + ",");
                salida.print(admon.getSalario() + ",");

            } else if (contrato instanceof Programador) {
                Programador programador = (Programador) contrato;
                salida.print("P,");
                salida.print(programador.getId() + ",");
                salida.print(programador.getNombre() + ",");
                salida.print(programador.getSalario() + ",");
            } else if (contrato instanceof Lider) {
                Lider lider = (Lider) contrato;
                salida.print("L,");
                salida.print(lider.getId() + ",");
                salida.print(lider.getNombre() + ",");
                salida.print(lider.getSalario() + ",");
            }
        }
    }

    @Override
    public CasaSoftware leer() {
        return null;
    }

}
