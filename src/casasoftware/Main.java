/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casasoftware;

import datos.Admon;
import datos.CasaSoftware;
import datos.Consultor;
import datos.Contrato;
import datos.Lider;
import datos.Programador;
import excepciones.NombreExcepcion;
import excepciones.LenguajeExcepcion;
import excepciones.SalarioExcepcion;

/**
 *
 * @author Profe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CasaSoftware cs = new CasaSoftware();
        Contrato c2 = null;
        Programador c3 = null;
        Lider c4 = null;
        Contrato c1 = new Consultor(1, "ibg");
        cs.adicionarContrato(c1);
        try {
            c2 = new Admon(2, "f", 110);
            cs.adicionarContrato(c2);
            c3 = new Programador(2, "f", 110, "java");
            cs.adicionarContrato(c3);
            c4 = new Lider(3, "f", 110, "javadoc");
            c4.adicionarProgramador(c3);
            cs.adicionarContrato(c4);
        } catch (NombreExcepcion ex) {
            ex.printStackTrace();
        } catch (LenguajeExcepcion ex) {
            ex.printStackTrace();
        } catch (SalarioExcepcion ex) {
            ex.printStackTrace();
        }

    }}

    
    
